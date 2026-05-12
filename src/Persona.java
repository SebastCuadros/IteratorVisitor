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
 * Clase abstracta base del sistema.
 * Representa una persona genérica.
 */
public abstract class Persona {

    protected String codigo;
    protected String nombre;
    protected String direccion;
    protected List<String> telefonos;

    public Persona(String codigo, String nombre,
            String direccion, List<String> telefonos) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }
}
