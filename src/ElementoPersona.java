/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author sebas
 */
/*
 * INTERFAZ DEL PATRÓN VISITOR
 *
 * Todas las clases que implementen esta interfaz
 * podrán recibir un Visitor mediante el método aceptar().
 */

public interface ElementoPersona {

    void aceptar(PersonaVisitor visitor);
}
