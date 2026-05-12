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
 * Clase concreta Docente.
 *
 * Hereda de Persona e implementa ElementoPersona
 * para usar el patrón Visitor.
 */
public class Docente extends Persona
        implements ElementoPersona {

    public Docente(String codigo,
            String nombre,
            String direccion,
            List<String> telefonos) {

        super(codigo, nombre, direccion, telefonos);
    }

    /*
     * APLICACIÓN DEL PATRÓN VISITOR
     *
     * El objeto recibe el visitor y permite
     * ejecutar operaciones sobre él.
     */
    @Override
    public void aceptar(PersonaVisitor visitor) {

        visitor.visitarDocente(this);
    }
}
