# 🎓 Sistema de notas de alumnos

Una sencilla aplicación de consola desarrollada en Java para la gestión básica y visualización de notas de estudiantes. Este programa simula un registro de calificaciones, permitiendo ingresar alumnos, generar notas aleatorias y consultar la información de diversas formas.

Este proyecto está escrito en Java y es ideal como ejercicio de lógica y manejo de arrays bidimensionales.

## 🚀 Funcionalidades

El programa ofrece varias funciones accesibles al ejecutar el método `main`:

* **Registro de Alumnos:** El usuario introduce el número de alumnos a gestionar al inicio.
* **Asignaturas Predefinidas:** El programa maneja seis asignaturas fijas: `Matematicas`, `Tecnologia`, `Informatica`, `Ingles`, `Lengua` y `LLengua` (utilizando la lista exacta del código).
* **Generación Aleatoria de Notas:** Las notas se generan automáticamente usando `Math.random()`, con valores entre **0.00 y 10.00**, y se redondean a dos decimales.
* **Visualización en Tabla (`tabla`):** Muestra un *tabular* completo con todos los alumnos y sus calificaciones para cada asignatura.
* **Cálculo de Media (`mediaalumno`):** Calcula y muestra la nota media total de cada alumno.
* **Visualización Gráfica (`estrellicademadrugada`):** Muestra las notas de cada alumno utilizando un sistema de estrellas (`*`), donde cada estrella representa un punto de la nota redondeada.
* **Búsqueda de Notas (`busqueda`):** Permite al usuario buscar la nota de un alumno específico en una asignatura concreta.

## 🛠️ Tecnología

* **Lenguaje:** Java
* **Entorno:** Aplicación de Consola
* **Estructura de Datos:** Array bidimensional (`String[][]`) para almacenar nombres y notas.

## ⚙️ Uso

Para utilizar este programa, debes tener instalado el **Java Development Kit (JDK)**.

1.  **Compila el archivo:**
    ```bash
    javac Main.java
    ```

2.  **Ejecuta la aplicación:**
    ```bash
    java Main
    ```

### Interacción

Una vez ejecutado, el programa te pedirá:

1.  **Número de alumnos:** Ingresa la cantidad de estudiantes.
2.  **Nombres de los alumnos:** Introduce el nombre de cada estudiante.

Tras la entrada de datos, el programa ejecutará secuencialmente todas las funciones, mostrando en consola:
1. La tabla de notas completa.
2. La visualización de notas con estrellas.
3. La media de cada alumno.
4. La función de búsqueda (pidiendo un alumno y luego una asignatura).

---
