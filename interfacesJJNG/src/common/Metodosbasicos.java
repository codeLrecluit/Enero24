package common;

public class Metodosbasicos implements Calculadora{

	@Override
	public double suma(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double resta(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicacion(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN; // indefinido
        }
	}

	@Override
	public double raiz(double a) {
		// TODO Auto-generated method stub
		return Math.sqrt(a);
	}

	
	
}
