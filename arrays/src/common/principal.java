package common;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
//ingresar un texto cualquiera,parrrafo
		//cazador cazado 754 -> dbabeps-dbabeps-865
		// Ingresar nombre completo y edad en una cadena de texto
		String palabra;
		Scanner leer=new Scanner(System.in);
		String array[]=new String[10];

		System.out.println("Introduzca palabras:");

		for(int i=0; i<=5; i++) {
			palabra=leer.nextLine();
			array[i]=palabra;
		}
		leer.close();
		
		System.out.println("Las palabras ingresadas : " + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j + 1].compareTo(array[j]) < 0) {
					
					String aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}

		System.out.println("Las palabras ordenadas : " + Arrays.toString(array));
		
	}
		
}

	

