package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ciudades {
    private Map<String, List<Ciudad>> mapaCiudades;
    private Scanner scanner;

    public Ciudades() {
        mapaCiudades = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void ejecutarMenu() {
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Agregar ciudad");
            System.out.println("2. Buscar ciudad");
            System.out.println("3. Modificar ciudad");
            System.out.println("4. Eliminar ciudad");
            System.out.println("5. Mostrar todas las ciudades");
            System.out.println("0. Salir");

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
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    private void agregarCiudad() {
        System.out.print("Ingrese el nombre de la ciudad: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el estado de la ciudad: ");
        String estado = scanner.nextLine();
        System.out.print("Ingrese el área en metros cuadrados de la ciudad: ");
        double area = scanner.nextDouble();
        System.out.print("Ingrese el número de habitantes de la ciudad: ");
        int numHabitantes = scanner.nextInt();

        Ciudad nuevaCiudad = new Ciudad(nombre,estado, area, numHabitantes);

        // Verificar si el estado ya está en el mapa
        if (mapaCiudades.containsKey(estado)) {
            mapaCiudades.get(estado).add(nuevaCiudad);
        } else {
            List<Ciudad> ciudadesEnEstado = new ArrayList<>();
            ciudadesEnEstado.add(nuevaCiudad);
            mapaCiudades.put(estado, ciudadesEnEstado);
        }

        System.out.println("Ciudad agregada con éxito.");
    }

    private void buscarCiudad() {
        System.out.print("Ingrese el nombre del estado de la ciudad a buscar: ");
        String estadoBuscar = scanner.nextLine();

        if (mapaCiudades.containsKey(estadoBuscar)) {
            List<Ciudad> ciudadesEnEstado = mapaCiudades.get(estadoBuscar);

            System.out.println("Ciudades en el estado " + estadoBuscar + ":");
            for (Ciudad ciudad : ciudadesEnEstado) {
                System.out.println(ciudad);
            }
        } else {
            System.out.println("Estado no encontrado.");
        }
    }

    private void modificarCiudad() {
        System.out.print("Ingrese el nombre del estado de la ciudad a modificar: ");
        String estadoModificar = scanner.nextLine();

        if (mapaCiudades.containsKey(estadoModificar)) {
            List<Ciudad> ciudadesEnEstado = mapaCiudades.get(estadoModificar);

            System.out.print("Ingrese el índice de la ciudad a modificar (0, 1, 2, ...): ");
            int indiceCiudad = scanner.nextInt();

            if (indiceCiudad >= 0 && indiceCiudad < ciudadesEnEstado.size()) {
                Ciudad ciudadExistente = ciudadesEnEstado.get(indiceCiudad);

                System.out.print("Ingrese el nuevo número de habitantes: ");
                int nuevoNumHabitantes = scanner.nextInt();
                ciudadExistente.setNumHabitantes(nuevoNumHabitantes);

                System.out.println("Ciudad modificada con éxito.");
            } else {
                System.out.println("Índice de ciudad no válido.");
            }
        } else {
            System.out.println("Estado no encontrado. No se puede modificar.");
        }
    }

    private void eliminarCiudad() {
        System.out.print("Ingrese el nombre del estado de la ciudad a eliminar: ");
        String estadoEliminar = scanner.nextLine();

        if (mapaCiudades.containsKey(estadoEliminar)) {
            List<Ciudad> ciudadesEnEstado = mapaCiudades.remove(estadoEliminar);

            System.out.println("Ciudades en el estado " + estadoEliminar + " eliminadas con éxito.");
        } else {
            System.out.println("Estado no encontrado. No se puede eliminar.");
        }
    }

    private void mostrarTodasLasCiudades() {
        if (mapaCiudades.isEmpty()) {
            System.out.println("No hay ciudades para mostrar.");
        } else {
            System.out.println("Lista de ciudades por estado:");
            for (Map.Entry<String, List<Ciudad>> entry : mapaCiudades.entrySet()) {
                String estado = entry.getKey();
                List<Ciudad> ciudadesEnEstado = entry.getValue();

                System.out.println("Estado: " + estado);
                for (Ciudad ciudad : ciudadesEnEstado) {
                    System.out.println(ciudad);
                }
                System.out.println();
            }
        }
    }

    
}