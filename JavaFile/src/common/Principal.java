package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Frank\\OneDrive\\Escritorio\\lectura.txt";
		
		String escritura = "C:\\\\Users\\\\Frank\\\\OneDrive\\\\Escritorio\\\\escritura.txt";
		String abc = "ABCDEFR";
		
		//File permite trabajar con archivos
		File file = new File(ruta);
		//guardar los datos del archivos
		String linea = null;
		
		
		
		try {
			
			//lectura
//			FileReader fr = new FileReader(file);
//			//Permite leer carcateres, arrays y lineas
//			BufferedReader br = new BufferedReader(fr);
//			
//			//leera linea por linea los datos del archivo
//			while((linea = br.readLine()) !=null) {
//				System.out.println(linea);
//			}
			//true agrega mas texto, false remplasa el texto anterior
			FileWriter fw = new FileWriter(escritura);
			//por cada caracter en la referencia
			for (int i = 0; i < abc.length(); i++) {
				fw.write(abc.charAt(i));
			}
			//guardar cambios en el archivo
			fw.close();
			
			
			
		}catch (Exception ex){
			ex.printStackTrace();
			
		}
		
	}
}
