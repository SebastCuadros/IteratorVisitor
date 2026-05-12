/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
/*
 * CLASE CONCRETA DEL PATRÓN VISITOR
 *
 * Implementa las operaciones de validación
 * para estudiantes y docentes.
 */
public class ValidadorVisitor
        implements PersonaVisitor {

    /*
     * Validación para estudiantes.
     */
    @Override
    public void visitarEstudiante(Estudiante e) {

        if (datosCompletos(e)) {

            System.out.println(
                    "Estudiante válido: "
                    + e.getNombre());

        } else {

            System.out.println(
                    "Estudiante con datos incompletos");
        }
    }

    /*
     * Validación para docentes.
     *
     * Además valida que el código tenga
     * máximo 4 dígitos.
     */
    @Override
    public void visitarDocente(Docente d) {

        if (!datosCompletos(d)) {

            System.out.println(
                    "Docente con datos incompletos");

            return;
        }

        if (!d.getCodigo().matches("\\d+")) {

            System.out.println(
                    "El código del docente debe ser numérico");

        } else if (d.getCodigo().length() > 4) {

            System.out.println(
                    "Código inválido para docente");

        } else {

            System.out.println(
                    "Docente válido: "
                    + d.getNombre());
        }
    }

    /*
     * Método auxiliar de validación.
     */
    private boolean datosCompletos(Persona p) {

        return p.getCodigo() != null
                && p.getNombre() != null
                && p.getDireccion() != null
                && p.getTelefonos() != null
                && !p.getTelefonos().isEmpty();
    }
}
