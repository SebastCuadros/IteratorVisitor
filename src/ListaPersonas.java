/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Clase que administra las colecciones
 * de personas.
 */
public class ListaPersonas {

    private ArrayList<Persona> personasArray;
    private TreeSet<String> personasTree;

    public ListaPersonas() {

        personasArray = new ArrayList<>();
        personasTree = new TreeSet<>();
    }

    /*
     * Agrega personas a ambas estructuras.
     */
    public void agregarPersona(Persona p) {

        personasArray.add(p);
        personasTree.add(p.getNombre());
    }

    /*
     * APLICACIÓN DEL PATRÓN ITERATOR
     *
     * Recorrido de un ArrayList usando Iterator.
     */
    public void recorridoArrayList() {

        System.out.println(
                "\n--- Recorrido ArrayList ---");

        Iterator<Persona> iterator
                = personasArray.iterator();

        while (iterator.hasNext()) {

            Persona p = iterator.next();

            System.out.println(
                    "Código: " + p.getCodigo()
                    + " | Nombre: " + p.getNombre());
        }
    }

    /*
     * APLICACIÓN DEL PATRÓN ITERATOR
     *
     * Recorrido de un TreeSet usando Iterator.
     */
    public void recorridoTreeSet() {

        System.out.println(
                "\n--- Recorrido TreeSet ---");

        Iterator<String> iterator
                = personasTree.iterator();

        while (iterator.hasNext()) {

            System.out.println(
                    iterator.next());
        }
    }

    public ArrayList<Persona> getPersonasArray() {

        return personasArray;
    }
}
