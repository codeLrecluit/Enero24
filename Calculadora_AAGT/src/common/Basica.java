package common;

public class Basica implements OperacionBasica{
	public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN; // NaN (Not a Number) para representar un resultado indefinido
        }
    }

	public double raizCuadrada(double numero) {
		
		
		
		return 0;
	}
}