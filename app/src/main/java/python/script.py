# File: app/src/main/java/python/script.py
import speech_recognition as sr
import sounddevice as sd
import numpy as np

def record_and_recognize_audio(duration=5, fs=44100):
    recognizer = sr.Recognizer()
    print("Por favor, hable ahora...")
    audio = sd.rec(int(duration * fs), samplerate=fs, channels=1, dtype='int16')
    sd.wait()  # Wait until recording is finished
    audio = np.squeeze(audio)
    audio_data = sr.AudioData(audio.tobytes(), fs, 2)

    try:
        texto = recognizer.recognize_google(audio_data, language='es-ES')
        print("Usted dijo: " + texto)
        return texto
    except sr.UnknownValueError:
        print("No se pudo entender el audio.")
        return "No se pudo entender el audio."
    except sr.RequestError as e:
        print("No se pudo pedir resultados; {0}".format(e))
        return "No se pudo pedir resultados; {0}".format(e)
