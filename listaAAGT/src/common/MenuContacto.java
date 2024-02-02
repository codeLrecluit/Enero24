package common;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuContacto {

	public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
			int opcion;

			do {
			    System.out.println("\n--- Menú de Opciones ---");
			    System.out.println("1. Agregar Contacto");
			    System.out.println("2. Buscar Contacto");
			    System.out.println("3. Modificar Contacto");
			    System.out.println("4. Eliminar Contacto");
			    System.out.println("5. Mostrar Todos los Contactos");
			    System.out.println("6. Salir");
			    System.out.print("Seleccione una opción: ");

			    opcion = scanner.nextInt();

			    switch (opcion) {
			        case 1:
			            
			            scanner.nextLine(); 
			            System.out.print("Ingrese el nombre del contacto: ");
			            String nuevoNombre = scanner.nextLine();
			            System.out.print("Ingrese el teléfono del contacto: ");
			            String nuevoTelefono = scanner.nextLine();
			            listaContactos.add(new Contacto(nuevoNombre, nuevoTelefono));
			            System.out.println("Contacto agregado con éxito.");
			            break;

			        case 2:
			           
			            scanner.nextLine(); 
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
			            break;

			        case 3:
			         
			            scanner.nextLine();
			            System.out.print("Ingrese el nombre del contacto a modificar: ");
			            String nombreModificar = scanner.nextLine();
			            boolean modificado = false;

			            for (Contacto contacto : listaContactos) {
			                if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
			                    System.out.print("Ingrese el nuevo teléfono del contacto: ");
			                    String nuevoTelefonoModificar = scanner.nextLine();
			                    contacto = new Contacto(contacto.getNombre(), nuevoTelefonoModificar);
			                    System.out.println("Contacto modificado con éxito.");
			                    modificado = true;
			                    break;
			                }
			            }

			            if (!modificado) {
			                System.out.println("Contacto no encontrado.");
			            }
			            break;

			        case 4:
			            scanner.nextLine();  
			            System.out.print("Ingrese el nombre del contacto a eliminar: ");
			            String nombreEliminar = scanner.nextLine();
			            boolean eliminado = false;

			            for (Contacto contacto : listaContactos) {
			                if (contacto.getNombre().equalsIgnoreCase(nombreEliminar)) {
			                    listaContactos.remove(contacto);
			                    System.out.println("Contacto eliminado con éxito.");
			                    eliminado = true;
			                    break;
			                }
			            }

			            if (!eliminado) {
			                System.out.println("Contacto no encontrado.");
			            }
			            break;

			        case 5:
			        
			            if (listaContactos.isEmpty()) {
			                System.out.println("La lista de contactos está vacía.");
			            } else {
			                System.out.println("Lista de contactos:");
			                for (Contacto contacto : listaContactos) {
			                    System.out.println(contacto);
			                }
			            }
			            break;

			        case 6:
			        
			            System.out.println("Saliendo del programa. ¡Hasta luego!");
			            break;

			        default:
			            System.out.println("Opción no válida. Intente de nuevo.");
			    }

			} while (opcion != 6);
		}
    }
}
