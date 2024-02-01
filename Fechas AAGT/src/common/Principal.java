package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	 public static void main(String[] args) {
		 
	        String archivoEntrada = "C:\\Users\\Sony\\Desktop\\fecha\\fechas.txt";
	        String archivoSalida = "C:\\Users\\Sony\\Desktop\\fecha\\fechas_letras.txt";

	        escribirFechas(archivoEntrada, "26012024");
	        
	        leerFechasYConvertir(archivoEntrada, archivoSalida);

	        System.out.println("Proceso completado.");
	    }

	    private static void escribirFechas(String archivo, String fechaString) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
	            writer.write(fechaString);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void leerFechasYConvertir(String archivoEntrada, String archivoSalida) {
	    	try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
	    		 BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {

	            String fechaString = reader.readLine();
	            SimpleDateFormat formatoEntrada = new SimpleDateFormat("ddMMyyyy");
	            SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

	            try {
	                Date fecha = formatoEntrada.parse(fechaString);
	                String fechaConvertida = formatoSalida.format(fecha);
	                writer.write(fechaConvertida);
	            } catch (ParseException e) {
	                e.printStackTrace();
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}