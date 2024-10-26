[Mi Abarroter-IA PDF](https://github.com/molmos14/MiAbarroterIA/blob/master/MiAbarroterIA.pdf)

# Instituto Tecnológico y de Estudios Superiores de Monterrey
## Campus Estado de México
**Análisis de métodos de razonamiento e incertidumbre**

### Mi Abarroter-IA
- Manuel Olmos Antillón A01750748
- Ximena Serna Mendoza A01749870
- César Antonio Espinosa Madrid A01799815
- Carlos Manuel Martínez Hernández A01749154
- Regina Rodríguez Chagoya A01750056

**26 de octubre del 2024**

### 1. Introducción
Este documento presenta una propuesta para el desarrollo de una aplicación destinada a optimizar la gestión de ventas e inventario en tienditas de la esquina en México. La problemática que se busca abordar es la falta de herramientas eficientes que faciliten a los propietarios llevar un registro adecuado de sus operaciones comerciales. Muchas de estas pequeñas tiendas no cuentan con sistemas de gestión que les permitan tomar decisiones informadas, lo que resulta en pérdidas económicas y una mala administración de sus inventarios.

#### 1.1 Propósito
El propósito de este proyecto es desarrollar una solución basada en inteligencia artificial que optimice la gestión de ventas e inventario en las tienditas de la esquina. Esta herramienta permitirá a los dueños ahorrar tiempo, llevar un registro preciso de sus ventas y tomar decisiones informadas, mejorando así la eficiencia y desempeño de sus negocios. La aplicación se centrará en capturar datos de ventas en tiempo real y en monitorear el inventario de manera inteligente, facilitando a los tenderos la gestión diaria de sus operaciones comerciales.

### 2. Diseño de la aplicación
#### 2.1 Descripción general
La aplicación se desarrollará con un enfoque en la simplicidad y la rapidez, ofreciendo una experiencia de usuario personalizada que se adapte a las necesidades de los tenderos. Su diseño intuitivo permitirá a los usuarios navegar fácilmente a través de sus funcionalidades principales, asegurando que incluso aquellos con poca experiencia tecnológica puedan utilizarla sin dificultad. La interfaz será clara y amigable, incorporando elementos visuales que faciliten la comprensión de las opciones disponibles.

##### 2.1.1 Objetivos de la aplicación
Los objetivos principales de la aplicación incluyen la optimización de la gestión de ventas e inventario, la captura de datos en tiempo real y la entrega de recomendaciones personalizadas para el reabastecimiento de productos. Al simplificar estos procesos, se busca mejorar la eficiencia operativa de las tienditas y permitir a los propietarios tomar decisiones informadas sobre sus inventarios y ventas.

##### 2.1.2 Funcionalidades principales
Las funcionalidades principales de la aplicación abarcarán la captura de datos de ventas, que permitirá el registro rápido y preciso de las ventas mediante escaneo de códigos de barras, dictado por voz y entrada manual. También se incluirá el monitoreo de inventario, que permitirá el seguimiento en tiempo real del inventario disponible, con alertas automáticas para reabastecimiento y gestión de productos. Además, se incorporará un asistente de inteligencia artificial que ofrecerá sugerencias personalizadas sobre productos a adquirir y realizará análisis de tendencias de ventas.

### 3. Explicación de funcionalidades
#### 3.1 Captura de datos de ventas
##### 3.1.1 Escaneo de código de barras
El escaneo de código de barras es una de las funcionalidades clave para agilizar el proceso de ventas. Esta herramienta permite registrar productos vendidos simplemente escaneando su código de barras, lo cual es rápido, preciso y fácil de usar. Esta funcionalidad es particularmente útil en momentos de alta afluencia de clientes, ya que permite procesar las ventas sin necesidad de buscar manualmente el producto o ingresar datos específicos. Además, el escaneo minimiza la posibilidad de errores humanos que pueden ocurrir al escribir el nombre del producto o ingresar precios incorrectos, lo cual es fundamental para la exactitud de los registros y el control de inventario.

##### 3.1.2 Dictado por voz
La funcionalidad de dictado por voz permite registrar productos mediante comandos verbales, una característica que agrega accesibilidad y flexibilidad a la aplicación. Esta opción es ideal en situaciones en las que el usuario tiene las manos ocupadas o prefiere no interactuar físicamente con el dispositivo. Con esta tecnología, el sistema reconoce la voz del usuario y asocia los nombres de los productos mencionados con su información en la base de datos, registrando la venta automáticamente.

##### 3.1.3 Entrada manual
La entrada manual de productos asegura que cualquier artículo, independientemente de si tiene código de barras o si es difícil de identificar por voz, pueda ser registrado en el sistema. Esta funcionalidad es particularmente útil para productos que se venden por unidad o peso y que no cuentan con código de barras, como los productos a granel o alimentos frescos. También resulta ventajosa en situaciones donde el sistema de voz no reconoce un producto específico.

#### 3.2 Monitoreo de inventario
El monitoreo de inventario es una funcionalidad esencial que permite un control continuo y preciso de las existencias en la tienda. Esta herramienta actualiza el inventario en tiempo real a medida que se registran las ventas, evitando la necesidad de conteos manuales y asegurando que siempre se disponga de una visión clara del stock disponible.

##### 3.2.1 Seguimiento en tiempo real
El seguimiento en tiempo real del inventario permite un control constante y preciso sobre las existencias disponibles. Con cada venta registrada, la cantidad de productos en stock se actualiza instantáneamente, eliminando la necesidad de realizar conteos manuales frecuentes. Esto asegura que el inventario refleja el estado real de los productos en todo momento, lo cual es especialmente importante para evitar rupturas de stock o para identificar rápidamente productos que están agotándose.

##### 3.2.2 Alertas automáticas para reabastecimiento
Las alertas automáticas de reabastecimiento son una herramienta que ayuda a evitar quedarse sin productos importantes. Cada vez que el inventario de un artículo cae por debajo de 10 unidades, la aplicación envía una notificación indicando que es momento de considerar un nuevo pedido. Si el stock llega a 0, el sistema genera una alerta de "restock inmediato," lo que significa que el producto se ha agotado y necesita reabastecerse con urgencia.

##### 3.2.3 Registro de entradas de inventario
El registro de entradas de inventario permite actualizar el stock de manera sencilla cada vez que se reciben nuevos productos. Esta funcionalidad facilita la introducción de información sobre las cantidades recibidas, actualizando automáticamente la cantidad disponible en el sistema. De esta forma, el inventario siempre refleja las existencias actuales y permite que la aplicación continúe monitoreando el stock en tiempo real. Además, el sistema puede guardar un historial de entradas de inventario, proporcionando un registro de cuándo y cuántas unidades de cada producto se abastecieron nuevamente.

#### 3.3 Asistente de inteligencia artificial
La inteligencia artificial de la aplicación incluye un modelo de predicción desarrollado mediante técnicas de regresión lineal, lo que permite proyectar la demanda futura de los productos con base en datos históricos. Este modelo analiza las tendencias de ventas de cada artículo, identificando patrones que ayudan a anticiparse a las necesidades de inventario. Al emplear un modelo de regresión lineal, el sistema puede predecir con mayor precisión la demanda, optimizando así el proceso de reabastecimiento y asegurando que el inventario esté alineado con las expectativas de ventas.

##### 3.3.1 Recomendaciones personalizadas
El asistente de inteligencia artificial analiza el historial de ventas y las tendencias de cada producto para generar recomendaciones personalizadas de reabastecimiento. Con el modelo de regresión lineal, se predice la demanda de cada producto en función de los datos de ventas anteriores, sugiriendo cuáles artículos deben reabastecerse y en qué cantidad. Estas recomendaciones consideran factores como la frecuencia de ventas y épocas de mayor demanda, ayudando a optimizar el inventario de manera informada.

##### 3.3.2 Análisis de tendencias de ventas
El análisis de tendencias de ventas es una herramienta avanzada del asistente de inteligencia artificial, que ofrece información detallada sobre el comportamiento de los productos. Utilizando algoritmos de aprendizaje automático y modelos de regresión lineal, el sistema genera informes periódicos que muestran cuáles son los artículos más populares, aquellos con ventas bajas y los que podrían beneficiarse de una promoción. Este análisis permite tomar decisiones estratégicas y focalizar los esfuerzos de promoción o reabastecimiento en productos específicos.

##### 3.3.3 Optimización de inventario
La optimización de inventario es una funcionalidad crucial que, apoyada en la regresión lineal, recomienda cantidades óptimas de reabastecimiento. Basado en factores como el historial de ventas, la estacionalidad y las tendencias de consumo, el modelo sugiere cantidades específicas para cada producto. Esta optimización reduce costos y evita desperdicios, asegurando que el inventario se mantenga en niveles adecuados para satisfacer la demanda sin exceso de productos.
