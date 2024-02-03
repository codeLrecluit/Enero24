package actividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//refencia para eligir o cerar el programa
		int respuesta;
		Scanner s1 = new Scanner(System.in);
		
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);
		Scanner s5 = new Scanner(System.in);
		//arrayList de la clase personas
		List<Personas> p = new ArrayList<Personas>();
		
		do 
		{
			//Mostramos menu
			System.out.println("****Menu****");
			System.out.println("1 Agregar");
			System.out.println("2 Buscar");
			System.out.println("3 Modificar");
			System.out.println("4 Eliminar");
			System.out.println("5 Mostrar todos los datos");
			System.out.println("6 finalizar");
			
			
			respuesta = s1.nextInt();
			
			switch(respuesta) {
			//Agregar usuario
			case 1:
				System.out.println("Nombre");
				String nombre = s2.nextLine();
				System.out.println("Apellido");
				String apellido = s3.nextLine();
				System.out.println("Correo");
				String correo = s3.nextLine();
				System.out.println("Numero Cel.");
				int celular = s4.nextInt();
				
				Personas pe = new Personas(nombre,apellido,correo,celular);
				p.add(pe);

				break;
			//Buscar usuario por nombre
			case 2:
				System.out.println("Nombre del usuario");
				String buscar = s2.nextLine();

				
				for (int i = 0; i < p.size(); i++) {
				    if ((p.get(i).nombre).equals(buscar)) {
				   
				    	System.out.println(p.get(i));
				    }
				}
				break;
			//modificar usuario por nombre
			case 3:
				System.out.println("Nombre del usuario a quien modificar:");
				String modificar = s2.nextLine();
				
				for (int i = 0; i < p.size(); i++) {
				    if ((p.get(i).nombre).equals(modificar)) {
				   
				    	System.out.println("Usuario encontrado "+p.get(i));
				    	System.out.println("Nuevo nombre");
				    	
				    	String nombreNew = p.get(i).nombre;
				    	nombreNew = s2.nextLine();
				    	
				    	System.out.println("Nuevo Apellido");
				    	
				    	String apellidoNew = p.get(i).apellido;
				    	apellidoNew = s3.nextLine();
				    	
				    	System.out.println("Nuevo Correo");
				    	
				    	String correoNew = p.get(i).apellido;
				    	correoNew = s3.nextLine();
				    	
				    	System.out.println("Nuevo celular");
				    	
				    	int numeroNew = p.get(i).celular;
				    	numeroNew = s3.nextInt();
				    	
				    	Personas peNew = new Personas(nombreNew,apellidoNew,correoNew,numeroNew);
				    	//actualizamos la informacion
				    	p.set(i, peNew);
				    	System.out.println("Su nueva informacion es: ");
				    	System.out.println(p.get(i));
				    	break;
				    	
				    }
				    
				}
				System.out.println("No encontrado");
		    	break;
			
			
			case 4:
				System.out.println("Eliminar usuario:");
				String eliminar = s2.nextLine();
				for (int i = 0; i < p.size(); i++) {
				    if ((p.get(i).nombre).equals(eliminar)) {
				    	
				    	System.out.println("Desea eliminar este usuario? ");
				    	System.out.println("1 Si, 2 No ");
				    	System.out.println(p.get(i));
				    	int eliminarUser = s5.nextInt();
				    	if(eliminarUser == 1) {
				    		p.remove(i);
				    		System.out.println("Se ha elminado el usuario ");
				    		break;
				    	}
				    	System.out.println("Accion cancelada");
				    	break;
				    	
				    	
				    }
				    
				    
				}
				System.out.println("No encontrado");
		    	break;
				
				
			case 5:
				System.out.println(p);
				break;
				
			default:
				System.out.println("Opcion no valida");
			}
		
				
			
		}
		while(respuesta != 6);
		System.out.println("Programa finalizado");
	}

}
