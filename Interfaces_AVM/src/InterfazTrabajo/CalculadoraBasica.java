package InterfazTrabajo;

public class CalculadoraBasica extends Calculadora implements Basicas{

	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double dividir(double a, double b) {
		// TODO Auto-generated method stub
		if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
	}

	@Override
	public double calcular(String operaciones, double a, double b) {
	   
	    switch (operaciones) {
	        case "+":
	            return sumar(a, b);
	        case "-":
	            return restar(a, b);
	        case "*":
	            return multiplicar(a, b);
	        case "/":
	            return dividir(a, b);
	        default:
	           
	            throw new IllegalArgumentException("Operación no válida: " + operaciones);
	    }
	}
	
}
