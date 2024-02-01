package common;

public class Main {
    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
        CalculadoraCientifica cientifica = new CalculadoraCientifica();

        // Operaciones básicas
        System.out.println("Uso calculadora basica");
        System.out.println("Suma: " + basica.suma(5, 3));
        System.out.println("Resta: " + basica.resta(5, 3));
        System.out.println("Multiplicación: " + basica.multiplicacion(5, 3));
        System.out.println("División: " + basica.division(5, 3));
        System.out.println("Raiz cuadrada de 25: " + basica.raiz(25));

        // Operaciones científicas
        System.out.println("Uso calculadora cientifica");
        System.out.println("Raiz cuadrada de 25: " + basica.raiz(25));
        System.out.println("Seno: " + cientifica.resta(5, 8));
        System.out.println("Seno: " + cientifica.seno(Math.PI / 2));
        System.out.println("Coseno: " + cientifica.coseno(Math.PI));
        System.out.println("Logaritmo base 2 de 8: " + cientifica.logaritmo(2, 8));
    }
}
