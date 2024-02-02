package InterfazTrabajo;

public class CalculadoraCientifica extends Calculadora implements Cientifica {

	@Override
	public double potencia(double base, double exponent) {
		// TODO Auto-generated method stub
		return Math.pow(base, exponent);
	}

	@Override
	public double raizC(double numero) {

	    if (numero < 0) {
	        throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
	    }
	    return Math.sqrt(numero);
	}

	@Override
	public double calcular(String operaciones, double a, double b) {
		// TODO Auto-generated method stub
		switch (operaciones) {
		case "potencia":
			return potencia(a, b);

		case "raiz":
			return raizC(a);
		default:
			return calcular(operaciones, a, b);
		}
	}

}
