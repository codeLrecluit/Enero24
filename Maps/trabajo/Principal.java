package trabajo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//List dentro de un Map
		
		//Convertimos la lista en un Arraylist
//		List<Ciudad> ciudadList = new ArrayList();
		//Cramos el objetos con datos
//		Ciudad c1 = new Ciudad("Per",23,23);
		//Agregamos el objeto en la arrayList
//		ciudadList.add(c1);
		//despues lo agregamos en nuestro map
//		ciudades.put("espo", ciudadList);
//		System.out.println(ciudades);
		
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);
		Scanner s5 = new Scanner(System.in);
		
		String nombre;
		String estado;
		int numHabitantes;
		double area;
		int seleccion=0;
		Ciudad city = null;
		int respuesta;
		
		
		Map<String, List<Ciudad>> datos = new HashMap<String,List<Ciudad>>();
		List<Ciudad> ciudades = null;
		do {
			System.out.println("****Menu****");
			System.out.println("1 Agregar ciduad");
			System.out.println("2 Buscar ciudad");
			System.out.println("3 Modificar ciudad");
			System.out.println("4 Eliminar ciudad");
			System.out.println("5 Mostrar Ciudad");
			System.out.println("6 Mostrar Ciudadades de un estado especifico");
			
			System.out.println("Seleccione una opcion");
			seleccion = s1.nextInt();
			
			
			switch (seleccion) {
			
			case 1:
				System.out.println("Nombre de la ciudad");
				nombre = s2.nextLine();
			
				System.out.println("Nombre del estado");
				estado = s3.nextLine();
				
				System.out.println("Numero de habitantes");
				numHabitantes = s4.nextInt();
				System.out.println("Numero de area");
				area = s5.nextDouble();
				
				city = new Ciudad(nombre,estado,area,numHabitantes);
				//busco dentro del mapa si ya contiene una llave (estado
				if(datos.containsKey(estado)) {
					//Asigno la ciudad a la lista de ciduades de ese estado
					datos.get(estado).add(city);
				}else {
					//Crear el registro(add la llave y la lista
					ciudades = new ArrayList<Ciudad>();
					ciudades.add(city);
					datos.put(estado, ciudades);
				}
				break;
			case 2:
				System.out.println("Nombre de la ciudad:");
				nombre = s2.nextLine();
				
				for(String key:datos.keySet()) {
					for(int i = 0; i< datos.get(key).size(); i++) {
						if(datos.get(key).get(i).getNombre().equals(nombre)) {
							System.out.println("Ciudad encontrada");
							System.out.println(datos.get(key).get(i));
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("Nombre de la ciudad:");
				nombre = s2.nextLine();
				
				for(String key:datos.keySet()) {
					for(int i = 0; i< datos.get(key).size(); i++) {
						if(datos.get(key).get(i).getNombre().equals(nombre)) {
							
							System.out.println("Nombre de la ciudad");
							nombre = s2.nextLine();
							System.out.println("Numero de habitantes");
							numHabitantes = s3.nextInt();
							System.out.println("Area en m2");
							area = s4.nextDouble();
							
							datos.get(key).get(i).setNombre(nombre);
							datos.get(key).get(i).setNumeroHabitantes(numHabitantes);
							datos.get(key).get(i).setArea(area);
							
							break;
						}
					}
				}
				
				break;
			case 4:
				System.out.println("Nombre de la ciudad:");
				nombre = s2.nextLine();
				
				for(String key:datos.keySet()) {
					for(int i = 0; i< datos.get(key).size(); i++) {
						if(datos.get(key).get(i).getNombre().equals(nombre)) {
							//eliminamos el objeto de la lista
							datos.get(key).remove(i);
							break;
						}
					}
				}
				break;
			case 5:
				System.out.println("Nombre de la ciudad:");
				nombre = s2.nextLine();
				
				for(String key:datos.keySet()) {
					for(int i = 0; i< datos.get(key).size(); i++) {
						System.out.println("Item: " + datos.get(key).get(i));
					}
				}
				
				break;
			case 6:
				System.out.println("Nombre ciudades de un estado");
				estado = s2.nextLine();
				
				if(datos.containsKey(estado)) {
					for (int i = 0; i < datos.get(estado).size(); i++) {
						
						System.out.println("Item: "+datos.get(estado).get(i));
						
					}
				}
				break;
			}
			
		}while(seleccion != 7);
		
	}
}
