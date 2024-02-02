package PracticaList;

import java.util.ArrayList;
import java.util.Scanner;

public class Agregar {
	
	public static void agregarContacto(ArrayList<Contacto> contactos) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("INGRESE EL NUMERO DEL CONTACTO");
		String nombre = sc2.nextLine();

		System.out.println("INGRESE EL NUMERO DEL TELEFONO");
		String numero = sc2.nextLine();

		System.out.println("INGRESE DIRECCION DE CONTACTO");
		String direccion = sc2.nextLine();

		System.out.println("INGRESE CORREO ELECTRONICO");
		String correo = sc2.nextLine();

		Contacto contacto = new Contacto(nombre, numero, direccion, correo);
		contactos.add(contacto);
		System.out.println("CONTACOT AGREGAR CORRECTAMENTE");
	}

	public static void buscarContacto(ArrayList<Contacto> contactos) {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Ingrese nombre a buscar");
		String nombreBuscar = sc3.nextLine();

		boolean encontrado = false;
		for (Contacto contacto : contactos) {
			if (contacto.nombre.equalsIgnoreCase(nombreBuscar)) {
				encontrado = true;
				System.out.println("Nombre " + contacto.nombre);
				System.out.println("Numero " + contacto.numeor);
				System.out.println("Direccion " + contacto.dirrecion);
				System.out.println("Correo " + contacto.correo);
				break;
			}
		}

		if (!encontrado) {
			System.out.println("CONTACTO NO ENCONTRADO");
		}

	}

	public static void mostrarContacto(ArrayList<Contacto> contactos) {
		if (contactos.isEmpty()) {
			System.out.println("No hay contactos para mostrar");
		}else {
			System.out.println("LISTA DE CONTACTOS");
			for(Contacto contacto : contactos) {
				System.out.println("Nombre " + contacto.nombre);
				System.out.println("Numero " + contacto.numeor);
				System.out.println("Direccion " + contacto.dirrecion);
				System.out.println("Correo " + contacto.correo);
			}
			
		}
	}
	
	public static void eliminarContacto(ArrayList<Contacto> contactos) {
		Scanner sc4 = new Scanner(System.in);
		System.out.println("INGRESE EL NOMBRE DEL CONTACTO A ELIMINAR");
		String nombreEliminar = sc4.nextLine();
		
		boolean encontrado = false;
		for(int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if(contacto.nombre.equalsIgnoreCase(nombreEliminar)) {
				encontrado = true;
				contactos.remove(i);
				System.out.println("CONTACTO ELIMINADO");
				break;
			}
		}
		if(!encontrado) {
			System.out.println("CONTACTO NO ENCONTRADO");
		}
	}
	
	public static void modificarContacto(ArrayList<Contacto> contactos) {
		Scanner sc5 = new Scanner(System.in);
		System.out.println("INGRESE EL NOMBRE DEL CONTACTO A MODIFICAR");
		String nombreModificar = sc5.nextLine();
		
		boolean encontrado = false;
		for(Contacto contacto : contactos) {
			if(contacto.nombre.equalsIgnoreCase(nombreModificar)) {
				encontrado = true;
				System.out.println("Contacto encontrado:");
	            System.out.println("Nombre: " + contacto.nombre);
	            System.out.println("Número: " + contacto.numeor);
	            System.out.println("Dirección: " + contacto.dirrecion);
	            System.out.println("Correo: " + contacto.correo);
	            System.out.println("-------------------------");

	            System.out.println("Ingrese el nuevo nombre del contacto: ");
	            String nuevoNombre = sc5.nextLine();
	            System.out.println("Ingrese el nuevo número de teléfono del contacto: ");
	            String nuevoNumero = sc5.nextLine();
	            System.out.println("Ingrese la nueva dirección del contacto: ");
	            String nuevaDireccion = sc5.nextLine();
	            System.out.println("Ingrese el nuevo correo electrónico del contacto: ");
	            String nuevoCorreo = sc5.nextLine();

	            contacto.nombre = nuevoNombre;
	            contacto.numeor = nuevoNumero;
	            contacto.dirrecion = nuevaDireccion;
	            contacto.correo = nuevoCorreo;

	            System.out.println("Contacto modificado exitosamente.");
	            break; 
			}
		}
		if(!encontrado) {
			System.out.println("CONTACTO NO ENCONTRADO");
		}
	}

}
