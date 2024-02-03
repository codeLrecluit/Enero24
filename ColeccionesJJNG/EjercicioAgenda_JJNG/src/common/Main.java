package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Contacto> listaContactos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar todos los contactos");
            System.out.println("0. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Se debe limpiar el buffer de entrada
            

            switch (opcion) {
                case 1:
                    agregarContacto(listaContactos, scanner);
                    break;
                case 2:
                    buscarContacto(listaContactos, scanner);
                    break;
                case 3:
                    modificarContacto(listaContactos, scanner);
                    break;
                case 4:
                    eliminarContacto(listaContactos, scanner);
                    break;
                case 5:
                    mostrarTodosLosContactos(listaContactos);
                    break;
                case 0:
                    System.out.println("Saliendo. . .");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void agregarContacto(List<Contacto> listaContactos, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de teléfono del contacto: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico del contacto: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese la dirección del contacto: ");
        String direccion = scanner.nextLine();

        Contacto nuevoContacto = new Contacto(nombre, telefono, correo, direccion);
        listaContactos.add(nuevoContacto);

        System.out.println("Contacto agregado con éxito.");
    }

    private static void buscarContacto(List<Contacto> listaContactos, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscar = scanner.nextLine();

        boolean encontrado = false;

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void modificarContacto(List<Contacto> listaContactos, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto que va a modificar: ");
        String nombreModificar = scanner.nextLine();

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                System.out.print("Ingrese el nuevo número de teléfono: ");
                String nuevoTelefono = scanner.nextLine();
                System.out.print("Ingrese el nuevo correo electrónico: ");
                String nuevoCorreo = scanner.nextLine();
                System.out.print("Ingrese la nueva dirección: ");
                String nuevaDireccion = scanner.nextLine();

                contacto.setTelefono(nuevoTelefono);
                contacto.setCorreo(nuevoCorreo);
                contacto.setDireccion(nuevaDireccion);

                System.out.println("Contacto modificado con éxito.");
                return;
            }
        }

        System.out.println("Contacto no encontrado. No se puede modificar.");
    }

    private static void eliminarContacto(List<Contacto> listaContactos, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreEliminar)) {
                listaContactos.remove(contacto);
                System.out.println("Contacto eliminado con éxito.");
                return;
            }
        }

        System.out.println("Contacto no encontrado. No se puede eliminar.");
    }

    private static void mostrarTodosLosContactos(List<Contacto> listaContactos) {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto contacto : listaContactos) {
                System.out.println(contacto);
            }
        }
    }
}

