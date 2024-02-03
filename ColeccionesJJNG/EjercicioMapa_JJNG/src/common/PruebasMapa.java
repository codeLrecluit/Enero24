package common;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PruebasMapa {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, List<Ciudad>> ciudades = new HashMap<>();
    private static String nombre;
    private static String estado;
    private static int numHabitantes;
    private static double area;
    private static Ciudad city = null;

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarCiudad();
                    break;
                case 2:
                    buscarCiudad();
                    break;
                case 3:
                    modificarCiudad();
                    break;
                case 4:
                    eliminarCiudad();
                    break;
                case 5:
                    mostrarTodasLasCiudades();
                    break;
                case 6:
                    mostrarCiudadesPorEstado();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Adios!");
                    break;
                default:
                    System.out.println("La opción no es válida, vuelve a intentar.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Opciones:");
        System.out.println("1. Agregar ciudad");
        System.out.println("2. Buscar ciudad");
        System.out.println("3. Modificar ciudad");
        System.out.println("4. Eliminar ciudad");
        System.out.println("5. Mostrar todas las ciudades");
        System.out.println("6. Mostrar todas las ciudades de un Estado");
        System.out.println("0. Salir");
    }

    private static void agregarCiudad() {
        System.out.print("Ingrese el nombre de la ciudad: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el estado de la ciudad: ");
        estado = scanner.nextLine();
        System.out.print("Ingrese el área en metros cuadrados de la ciudad: ");
        area = scanner.nextDouble();
        System.out.print("Ingrese el número de habitantes de la ciudad: ");
        numHabitantes = scanner.nextInt();

        city = new Ciudad(nombre, estado, area, numHabitantes);

        if (ciudades.containsKey(estado)) {
            ciudades.get(estado).add(city);
        } else {
            List<Ciudad> ciudadesEnEstado = new ArrayList<>();
            ciudadesEnEstado.add(city);
            ciudades.put(estado, ciudadesEnEstado);
        }

        System.out.println("Ciudad agregada con éxito.");
    }

    private static void buscarCiudad() {
        System.out.println("Nombre de la ciudad a buscar");
        nombre = scanner.nextLine();

        for (String key : ciudades.keySet()) {
            for (int i = 0; i < ciudades.get(key).size(); i++) {
                if (ciudades.get(key).get(i).getNombre().equals(nombre)) {
                    System.out.println("Ciudad encontrada");
                    System.out.println(ciudades.get(key).get(i));
                }
            }
        }
    }

    private static void modificarCiudad() {
        System.out.println("Nombre de la ciudad a buscar");
        nombre = scanner.nextLine();

        for (String key : ciudades.keySet()) {
            for (int i = 0; i < ciudades.get(key).size(); i++) {
                if (ciudades.get(key).get(i).getNombre().equals(nombre)) {
                    System.out.println("Ciudad encontrada");

                    System.out.print("Ingrese el nuevo nombre de la ciudad: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el área en metros cuadrados de la ciudad: ");
                    area = scanner.nextDouble();
                    System.out.print("Ingrese el número de habitantes de la ciudad: ");
                    numHabitantes = scanner.nextInt();

                    ciudades.get(key).get(i).setNumHabitantes(numHabitantes);
                    ciudades.get(key).get(i).setNombre(nombre);
                    ciudades.get(key).get(i).setArea(area);
                }
            }
        }
        System.out.println("Ciudad modificada con éxito.");
    }

    private static void eliminarCiudad() {
        System.out.println("Nombre de la ciudad a eliminar");
        nombre = scanner.nextLine();

        for (String key : ciudades.keySet()) {
            for (int i = 0; i < ciudades.get(key).size(); i++) {
                if (ciudades.get(key).get(i).getNombre().equals(nombre)) {
                    System.out.println("Ciudad encontrada");
                    ciudades.get(key).remove(i);
                    System.out.println("Ciudad eliminada con éxito.");
                }
            }
        }
    }

    private static void mostrarTodasLasCiudades() {
        for (String key : ciudades.keySet()) {
            for (int i = 0; i < ciudades.get(key).size(); i++) {
                System.out.println("Item: " + ciudades.get(key).get(i));
            }
        }
    }

    private static void mostrarCiudadesPorEstado() {
        System.out.println("Nombre del estado a mostrar");
        estado = scanner.nextLine();

        if (ciudades.containsKey(estado)) {
            for (int i = 0; i < ciudades.get(estado).size(); i++) {
                System.out.println("Item: " + ciudades.get(estado).get(i));
            }
        } else {
            System.out.println("Estado no encontrado.");
        }
    }
}