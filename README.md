# Sistema de Personas - Iterator y Visitor

Este es un proyecto básico en Java creado para resolver un ejercicio de clase sobre patrones de diseño. El programa permite registrar **Estudiantes** y **Docentes**, guardarlos en listas y validar sus datos.

## 📌 ¿Qué hace el programa?

El código cumple con todos los requisitos del "Escenario Problema":

1. **Guarda los datos:** Usa `ArrayList` para guardar la información completa de las personas y `TreeSet` para guardar solo los nombres ordenados.
2. **Patrón Iterator:** Se usa para recorrer y mostrar en pantalla los datos guardados en las listas paso a paso.
3. **Patrón Visitor:** Se encarga de revisar (validar) los datos sin modificar las clases principales:
   * Revisa que nadie tenga datos en blanco.
   * Revisa que el **código de los docentes** sea solo de números y tenga máximo 4 dígitos.

## 🗂️ Archivos principales

* **Clases de datos:** `Persona`, `Estudiante`, `Docente`.
* **Colecciones (Iterator):** `ListaPersonas`.
* **Validaciones (Visitor):** `ValidadorVisitor`.
* **Diagrama UML:** `UMLiv.png` (Muestra cómo se conectan todas las clases).

## 🚀 Cómo usarlo

1. Descarga el código y ábrelo en tu editor de Java (como NetBeans, Eclipse o IntelliJ).
2. Ejecuta el archivo `Main.java`.
3. Sigue las instrucciones en la consola: el programa te pedirá cuántas personas quieres registrar y luego te pedirá sus datos.
4. Al final, el programa mostrará la lista de personas y te dirá si los datos son válidos o no.
