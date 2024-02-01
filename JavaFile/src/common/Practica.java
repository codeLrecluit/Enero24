package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Practica {
	public static void main(String[] args) {
		//
		
		String ruta = "C:\\Users\\Frank\\OneDrive\\Escritorio\\lectura.txt";
		
		String escritura = "C:\\Users\\Frank\\OneDrive\\Escritorio\\escritura.txt";
		
		File file = new File(ruta);
		String linea = null;
		String [] tall = new String [3];
		
		//leer los datos del archivo y guardarlos en un array
		try {
			FileReader  fr = new FileReader(file);
			Scanner myReader = new Scanner(fr);
		
			int i = 0;
			
			while (myReader.hasNextInt()) {
				tall[i++] = myReader.nextLine();
		       
		      }
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		 System.out.println(Arrays.deepToString(tall));
		 
		 String[] numeros = {"","uno","dos","tres","cuatro",
				 "cinco","seis","siete","ocho","nueve","diez",
				 "once","doce","trece","catorce","quince","dieciseis","diecisiete",
				 "dieciocho","diecinueve","Veinte","Veintiuno","Veintidos","Veintitres",
				 "Veinticuatro","Veinticinco","Veintiseis","Veintisiete","Veintiocho",
				 "Veintinueve","Treinta", "Trentaiuno"};
		 
		 String[] meses = {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
				 "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		 
//		//Escribir datos
		 try {
			 
			FileWriter fw = new FileWriter(escritura);
			BufferedWriter writer = new BufferedWriter(fw);
			
			//por cada elemento en la array 
			for (int i = 0; i < tall.length; i++) {
				//convertimos de string a int 
				if(Integer.parseInt(tall[i].substring(0,2))>=1){
					String nuevo = numeros[Integer.parseInt(tall[i].substring(0,2))];
					System.out.println(nuevo);
					writer.write(nuevo + " de ");
				}
				if(Integer.parseInt(tall[i].substring(2,4))>=1){
					String nuevo = meses[Integer.parseInt(tall[i].substring(0,2))];
					System.out.println(nuevo);
					writer.write(nuevo + " del ");
				}
				
				writer.write(tall[i].substring(4,8) + " ");
				writer.newLine();
				
			}
			writer.close();
	
		}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
		//Escribir datos
	
		
	
	

}
