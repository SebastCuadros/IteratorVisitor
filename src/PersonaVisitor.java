/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
/*
 * INTERFAZ VISITOR
 *
 * Aquí se definen las operaciones que realizará
 * el patrón Visitor sobre cada tipo de objeto.
 */

public interface PersonaVisitor {

    void visitarEstudiante(Estudiante e);

    void visitarDocente(Docente d);
}
