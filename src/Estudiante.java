/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
import java.util.List;

/*
 * Clase concreta Estudiante.
 *
 * Hereda de Persona e implementa ElementoPersona
 * para participar en el patrón Visitor.
 */
public class Estudiante extends Persona
        implements ElementoPersona {

    public Estudiante(String codigo,
            String nombre,
            String direccion,
            List<String> telefonos) {

        super(codigo, nombre, direccion, telefonos);
    }

    /*
     * APLICACIÓN DEL PATRÓN VISITOR
     *
     * El objeto acepta un visitor y le permite
     * ejecutar operaciones sobre él.
     */
    @Override
    public void aceptar(PersonaVisitor visitor) {

        visitor.visitarEstudiante(this);
    }
}
