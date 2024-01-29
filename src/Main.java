import ConversorFechas.DateConvert;
import ReadingServices.FileReaderService;
import ReadingServices.IReadingService;
import WritterServices.IWritterServices;
import WritterServices.WritterService;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IReadingService readingService = new FileReaderService();
        DateConvert convert = new DateConvert();
        IWritterServices writterServices = new WritterService();
        String rutaLectura = "C:\\Users\\josue\\Desktop\\fechas.txt";
        String rutaEscritura = "C:\\Users\\josue\\Desktop\\fechasDos.txt";

        ArrayList<String> fechas = readingService.Reading(rutaLectura);
        String[] fechasC = convert.handler(fechas);
        writterServices.Writter(rutaEscritura, fechasC);

    }

    public static int calcularPotencia(int base, int exponente) {
        // Caso base: cualquier número elevado a la potencia 0 es 1
        if (exponente == 0) {
            return 1;
        }

        // Llamada recursiva para reducir el exponente en cada iteración
        return base * calcularPotencia(base, exponente - 1);
    }
}