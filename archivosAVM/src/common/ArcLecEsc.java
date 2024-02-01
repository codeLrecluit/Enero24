package common;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//ALEKS VIVEROS MEJIA 26 ENERO 2024

public class ArcLecEsc {
    public static void main(String[] args) {
    	
		//En un archivo agregar numeros FECHAS
		//23092008
		//11121998
		//27052010
		//11032000
		//05092012
		//25102001
		//LEER LOS DATOS DEL ARCHIVO FEHCAS EN DATOS NUMERICO
		//ESCRIBIR LOS DATOS DE ESE ARCHIVO EN OTRO ARCHIVO
		//EN FORMATO FECHA DIAS Y MES EN TEXTO Y AÑO EN NUMERO
    	
        String lectura = "C:\\Users\\Omen\\Desktop\\LecturaFecha.txt";
        String escritura = "C:\\Users\\Omen\\Desktop\\EscrituraFecha2.txt";

        try {
            FileReader fr = new FileReader(lectura);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(escritura);
            BufferedWriter bw = new BufferedWriter(fw);

            String[] nombresDias = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                                    "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                                    "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno"};

            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                              "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

            String fecha;
            while ((fecha = br.readLine()) != null) {
            	
                if (fecha.length() == 8) {
                	
                    int diaIndex = Integer.parseInt(fecha.substring(0, 2));
                    int mesIndex = Integer.parseInt(fecha.substring(2, 4)) - 1;
                    String ano = fecha.substring(4);

                    if (diaIndex >= 1 && diaIndex <= nombresDias.length && mesIndex >= 0 && mesIndex < meses.length) {
                    
                    	String dia = nombresDias[diaIndex - 1];
                        String mes = meses[mesIndex];

                        bw.write(dia + " de " + mes + " de " + ano);
                        bw.newLine();
                        
                    } else {
                        System.out.println("Fecha inválida: " + fecha);
                    }
                } else {
                    System.out.println("Formato de fecha inválido: " + fecha);
                }
            }

            br.close();
            bw.close();

            System.out.println("Proceso completado");
            
        } catch (Exception e) {
            
        	System.out.println("Error al procesar el archivo");
            e.printStackTrace();
        }
    }
}
