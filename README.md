Proyecto ACA — Sistema Básico de Inventario en Java

Curso: Programación Orientada a Objetos

Proyecto: Mi primera aplicación orientada a objetos (Núcleo Obligatorio - Opción 1)

📝 Descripción del Proyecto

Este proyecto consiste en una aplicación de consola desarrollada en Java que simula el sistema de inventario de una pequeña tienda. Permite administrar productos en tiempo real, calcular el valor total del inventario acumulado y realizar búsquedas por código de manera segura utilizando manejo de excepciones.

⚙️ Funcionalidades

Registrar producto: Permite ingresar código, nombre, precio y cantidad de un nuevo producto.

Mostrar productos: Listado completo de los productos almacenados en el inventario y cálculo automático del valor total (precio * cantidad).

Buscar producto por código: Búsqueda individual de productos. Lanza una excepción personalizada si el producto no existe.

Validación de entradas: Captura de errores mediante try-catch para evitar que el programa falle si el usuario ingresa texto en lugar de números.

Categorías predefinidas: Muestra una lista simple de categorías de productos mediante el uso de un arreglo estático.

🛠️ Clases Utilizadas

Producto.java: Clase de dominio u objeto. Contiene los atributos del producto (codigo, nombre, precio, cantidad), constructor, encapsulamiento (getters y setters) y el método mostrarInformacion().

Inventario.java: Clase contenedora. Gestiona una lista dinámica (ArrayList<Producto>), realiza el recorrido para calcular el valor total y busca productos lanzando excepciones.

ProductoNoEncontradoException.java: Excepción personalizada que hereda de Exception, utilizada cuando una búsqueda no arroja resultados.

Main.java: Clase principal con la lógica del menú por consola (do-while, switch), interacción con el usuario y manejo global de errores con try-catch.

🧠 Conceptos de POO Aplicados

Clases y Objetos: Representación de entidades del mundo real (Producto, Inventario).

Encapsulamiento: Definición de atributos privados (private) accesibles únicamente a través de métodos públicos (getters y setters).

Relación entre Clases (Agregación): La clase Inventario contiene y administra múltiples instancias de Producto.

Colecciones y Arreglos: Uso de ArrayList para almacenamiento dinámico de objetos y un arreglo estático (String[]) para mostrar categorías.

Manejo de Excepciones: Uso de bloques try-catch (NumberFormatException) para control de entradas y creación de una excepción personalizada (ProductoNoEncontradoException).

🚀 Instrucciones de Ejecución

Clonar el repositorio o descargar los archivos fuente .java.

Asegurarse de tener instalado el JDK (Java Development Kit) versión 8 o superior.

Abrir los archivos en cualquier IDE de Java (IntelliJ IDEA, Eclipse, NetBeans) o compilar desde la terminal.

Ejecutar el archivo Main.java.

Interactuar con el programa ingresando las opciones del menú numerado en la consola.
