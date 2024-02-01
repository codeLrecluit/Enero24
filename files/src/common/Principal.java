package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class Principal {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\juane\\Escritorio\\fechas.txt";
		String write = "C:\\Users\\juane\\Escritorio\\escritura.txt";
		File file = new File(path);
		String line = null;
		String abc = "Holaaaaaa ya cambie el texto";
		String[] fechas = new String[5];
		int i = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				fechas[i] = line;
				System.out.println(line);
				i++;
				
			}
			
			System.out.println();
			
			for (int j = 0; j < fechas.length; j++) {
				System.out.println(fechas[j]);
			}
//			FileWriter fw = new FileWriter(write,false);
//			
//			for (int i = 0; i < abc.length(); i++) {
//				fw.write(abc.charAt(i));
//			}
//			fw.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
