# File: app/src/main/java/python/query_generator.py
import spacy
import pandas as pd
from sqlalchemy import create_engine

# Cargar modelo de lenguaje
nlp = spacy.load("es_core_news_sm")

def generar_query_sql(consulta, tablas):
    doc = nlp(consulta)
    select_part = []
    from_part = None
    where_part = []

    # Identificar la tabla adecuada
    for token in doc:
        if token.lemma_ in tablas.keys():
            from_part = token.lemma_
            break

    if not from_part:
        return "Tabla no identificada en la consulta."

    for token in doc:
        if token.dep_ in ("attr", "pobj", "dobj") and token.lemma_ in tablas[from_part]:
            select_part.append(token.lemma_)
        elif token.dep_ == "prep":
            where_part.append(f"{token.head.lemma_} = '{token.text}'")

    # Construir la consulta SQL
    select_clause = ", ".join(select_part) if select_part else "*"
    where_clause = " AND ".join(where_part) if where_part else "1=1"
    query = f"SELECT {select_clause} FROM {from_part} WHERE {where_clause};"
    return query