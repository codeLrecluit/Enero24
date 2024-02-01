package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class EjercicioJJNG {
	
	
	
	private static String[] dias = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", 
			"once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", 
			"diecinueve", "veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro",
			"veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno"};

	private static String[] meses = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

	public static void main(String[] args) {
		String path = "C:\\Users\\juane\\Escritorio\\fechas.txt";
		String write = "C:\\Users\\juane\\Escritorio\\fechasP.txt";
		File file = new File(path);
		String line = null;
		String[] fechas = new String[5];
		String[] fechasP;
		String fpline="";
		int i = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				fechas[i] = line;
				System.out.println(line);
				i++;
				
			}
			
			fechasP = LlenarFechas(fechas);
			FileWriter fw = new FileWriter(write,false);
			for (int j = 0; j < fechasP.length; j++) {
				fpline=fechasP[j];
				fw.write(fpline+"\n");
			}
			fw.close();
			
			
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
	
	public static String[] LlenarFechas(String[] fechas) {
        String[] unidades = new String[fechas.length];
        String fechasc;
        for (int i = 0; i < unidades.length; i++) {
        	fechasc = fechas[i];
        	String dia;
            int diaNumero = Integer.parseInt(fechasc.substring(0, 2));

            
            dia = dias[diaNumero];
            

            String mes = meses[Integer.parseInt(fechasc.substring(2, 4))];
            String año = fechasc.substring(4);
            unidades[i]=dia + " de " + mes + " del " + año;
		}
        

        for (int i = 0; i < unidades.length; i++) {
			
		}
        
//        int num = Integer.parseInt(numero);
//        if (num < unidades.length) {
//            return unidades[num];
//        } else {
//            return "Número no soportado";
//        }
        
        return unidades;
    }
	
}
