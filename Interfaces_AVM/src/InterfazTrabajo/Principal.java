package InterfazTrabajo;

public class Principal {

	public static void main(String[] args) {

//Modelar una Calculadora, de la cual se harán 2 clases hijas, Basica y Cientifica
//Crear herencia e interfaces necesarias para que la clase Basica sea distinta en su comportamiento de la clase Cientifica.
//Donde usar la herencia y las interfaces queda a su criterio.

		System.out.println("CALCULADORA BASICA");
		CalculadoraBasica cb = new CalculadoraBasica();
		System.out.println("Suma : " + cb.calcular("+", 10, 20));
		System.out.println("Resta : " + cb.calcular("-", 949, 40));
		System.out.println("Multiplicacion : " + cb.calcular("*", 30, 17));
		System.out.println("Division : " + cb.calcular("/", 38, 23));
		
		
		
		System.out.println("CALCULADORA CIENTIFICA");
		CalculadoraCientifica cc = new CalculadoraCientifica();
		System.out.println("Potencia : " + cc.calcular("potencia", 45, 2));
		System.out.println("Raiz : " + cc.calcular("raiz", 76, 0));
	}

}
