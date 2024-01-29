package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class CLASE5 {

	public static void main(String[] args) {
		String ruta="C:\\Users\\adreaalejandra\\OneDrive\\Escritorio";
		String escritura="C:\\Users\\adreaalejandra\\OneDrive\\Escritorio";
		File file= new File(ruta);
		String linea=null;
		String abc="ABCDEFGHIJKLMNOP";
		try {
//			FileReader fr=new FileReader(file);
//			BufferedReader br =new BufferedReader(fr);
//			while((linea=br.readLine()) !=null) {
//				System.out.println(linea);
				
			//}
			FileWriter fw = new FileWriter(escritura,true);
			for(int i=0; i<abc.length();i++) {
				fw.write(abc.charAt(i));
				
			}
			fw.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
