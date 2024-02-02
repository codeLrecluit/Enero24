package PracticaList;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal extends Agregar {
	// MENU DE OPCIONES DOWHILE (MODELO DE TIPO CONTACTO, LISTA DE CONTACTOS)

	// 1 ACCION DE AGREGAR
	// 2 ACCION DE BUSCAR
	// 3 ACCION DE MODIFICAR
	// 4 ACCION DE ELIMINAR
	// 5 ACCION DE MOSTRAR TODO EL CONTENIDO

	public static void main(String[] args) {
		ArrayList<Contacto> contactos = new ArrayList<Contacto>();

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {
			System.out.println("______-MENU DE OPCIONES-_________ ");
			System.out.println("1 AGREGAR CONTACTO");
			System.out.println("2 BUSCAR CONTACTO");
			System.out.println("3 MODIFICAR CONTACTO");
			System.out.println("4 ELIMINAR CONTACTO");
			System.out.println("5 MOSTRAR CONTACTO");
			System.out.println("6 SALIR ");
			System.out.println("---------------------------------------");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				agregarContacto(contactos);
				break;
			case 2:
				buscarContacto(contactos);
				break;
			case 3:
				modificarContacto(contactos);
				break;
			case 4:
				eliminarContacto(contactos);
				break;
			case 5:
				mostrarContacto(contactos);
				break;
			case 6:
				System.out.println("Adios");
				break;
			default:
				System.out.println("OPCION NO VALIDA");
			}
		} while (opcion != 6);
	}

}
