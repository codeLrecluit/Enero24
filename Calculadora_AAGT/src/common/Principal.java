package common;

public class Principal {
	
	public static void main(String[] args) {
        // Calculadora básica
        Basica calculadoraBasica = new Basica();
        System.out.println("Suma: " + calculadoraBasica.sumar(5, 3));
        System.out.println("Resta: " + calculadoraBasica.restar(5, 3));
        System.out.println("Multiplicación: " + calculadoraBasica.multiplicar(5, 3));
        System.out.println("División: " + calculadoraBasica.dividir(5, 3));

        // Calculadora científica
        Cientifica calculadoraCientifica = new Cientifica();
        System.out.println("Potencia: " + calculadoraCientifica.elevar(2, 3));
        System.out.println("Raíz cuadrada: " + calculadoraCientifica.raizCuadrada(25));
    }
}