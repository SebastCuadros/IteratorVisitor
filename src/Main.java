/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Clase principal del programa.
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ListaPersonas lista
                = new ListaPersonas();

        int cantidad = 0;

        System.out.println(
                "==================================");

        System.out.println(
                " SISTEMA DE PERSONAS");

        System.out.println(
                " PATRONES ITERATOR Y VISITOR");

        System.out.println(
                "==================================");

        /*
         * VALIDACIÓN CON EXCEPTION
         * Verifica que la cantidad sea numérica.
         */
        while (true) {

            try {

                System.out.print(
                        "\n¿Cuántas personas desea registrar?: ");

                cantidad = entrada.nextInt();

                entrada.nextLine();

                if (cantidad <= 0) {

                    System.out.println(
                            "La cantidad debe ser mayor a 0.");

                } else {

                    break;
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "ERROR: Debe ingresar un número.");

                entrada.nextLine();
            }
        }

        /*
         * REGISTRO DE PERSONAS
         */
        for (int i = 1; i <= cantidad; i++) {

            System.out.println(
                    "\n==================================");

            System.out.println(
                    " REGISTRO PERSONA #" + i);

            System.out.println(
                    "==================================");

            int tipo = 0;

            /*
             * VALIDACIÓN DEL TIPO
             */
            while (true) {

                try {

                    System.out.println(
                            "1. Estudiante");

                    System.out.println(
                            "2. Docente");

                    System.out.print(
                            "Seleccione el tipo: ");

                    tipo = entrada.nextInt();

                    entrada.nextLine();

                    if (tipo == 1 || tipo == 2) {

                        break;

                    } else {

                        System.out.println(
                                "Seleccione 1 o 2.");
                    }

                } catch (InputMismatchException e) {

                    System.out.println(
                            "ERROR: Debe ingresar un número.");

                    entrada.nextLine();
                }
            }

            /*
             * DATOS GENERALES
             */
            String codigo;
            String nombre;
            String direccion;

            while (true) {

                System.out.print("Código: ");

                codigo = entrada.nextLine();

                if (!codigo.isEmpty()) {

                    break;

                } else {

                    System.out.println(
                            "El código no puede estar vacío.");
                }
            }

            while (true) {

                System.out.print("Nombre: ");

                nombre = entrada.nextLine();

                if (!nombre.isEmpty()) {

                    break;

                } else {

                    System.out.println(
                            "El nombre no puede estar vacío.");
                }
            }

            while (true) {

                System.out.print("Dirección: ");

                direccion = entrada.nextLine();

                if (!direccion.isEmpty()) {

                    break;

                } else {

                    System.out.println(
                            "La dirección no puede estar vacía.");
                }
            }

            /*
             * TELÉFONOS
             */
            ArrayList<String> telefonos
                    = new ArrayList<>();

            int cantidadTelefonos = 0;

            while (true) {

                try {

                    System.out.print(
                            "Cantidad de teléfonos: ");

                    cantidadTelefonos
                            = entrada.nextInt();

                    entrada.nextLine();

                    if (cantidadTelefonos > 0) {

                        break;

                    } else {

                        System.out.println(
                                "Debe ingresar al menos un teléfono.");
                    }

                } catch (InputMismatchException e) {

                    System.out.println(
                            "ERROR: Debe ingresar un número.");

                    entrada.nextLine();
                }
            }

            for (int j = 1;
                    j <= cantidadTelefonos;
                    j++) {

                while (true) {

                    System.out.print(
                            "Teléfono #" + j + ": ");

                    String telefono
                            = entrada.nextLine();

                    if (!telefono.isEmpty()) {

                        telefonos.add(telefono);

                        break;

                    } else {

                        System.out.println(
                                "El teléfono no puede estar vacío.");
                    }
                }
            }

            /*
             * CREACIÓN DE OBJETOS
             */
            if (tipo == 1) {

                Estudiante estudiante
                        = new Estudiante(
                                codigo,
                                nombre,
                                direccion,
                                telefonos
                        );

                lista.agregarPersona(estudiante);

            } else {

                Docente docente
                        = new Docente(
                                codigo,
                                nombre,
                                direccion,
                                telefonos
                        );

                lista.agregarPersona(docente);
            }

            System.out.println(
                    "\nPersona registrada correctamente.");
        }

        /*
         * ============================
         * PATRÓN ITERATOR
         * ============================
         */
        System.out.println(
                "\n==================================");

        System.out.println(
                " RECORRIDOS CON ITERATOR");

        System.out.println(
                "==================================");

        lista.recorridoArrayList();

        lista.recorridoTreeSet();

        /*
         * ============================
         * PATRÓN VISITOR
         * ============================
         */
        System.out.println(
                "\n==================================");

        System.out.println(
                " VALIDACIONES CON VISITOR");

        System.out.println(
                "==================================");

        ValidadorVisitor visitor
                = new ValidadorVisitor();

        for (Persona p : lista.getPersonasArray()) {

            /*
             * Aplicación del Visitor
             */
            ((ElementoPersona) p)
                    .aceptar(visitor);
        }

        System.out.println(
                "\n==================================");

        System.out.println(
                " FIN DEL PROGRAMA");

        System.out.println(
                "==================================");
    }
}
