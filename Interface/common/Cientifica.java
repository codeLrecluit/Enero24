package common;

public class Cientifica extends Calculadora implements CalculosAvanzados{
	

	@Override
	public void raizCuadrada(double num1) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(num1));
	}

	@Override
	public void operacionesTrigonometricas(double num1) {
		// TODO Auto-generated method stub
		double grados = num1;
		double radians = Math.toRadians(grados);
		double sinValue = Math.sin(radians);
		System.out.println("El seno de " + grados + " grados es " + sinValue);
	}

	@Override
	public void potencia(double num1,double num2) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(num1,num2));
	}

	
	
	

}
