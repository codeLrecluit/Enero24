package common;

public class Calculadora {
	 double num1;
	 double num2;
	 double resultado;
	 
	public Calculadora() {
		
	}
	
	public void Suma(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		
		
		resultado = num1 + num2;
		System.out.println(resultado);
	}
	public void Resta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		
		
		resultado = num1 - num2;
		System.out.println(resultado);
	}
	
	public void Division(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		
		
		if(num1 == 0 || num2 == 0) {
			System.out.println("No se puede dividir entre 0");
		}
		resultado = num1 / num2;
		System.out.println(resultado);
	}
	
	public void Multiplicacion(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		
	
		resultado = num1 * num2;
		System.out.println(resultado);
	}
	

	
	
	

	 
	 
	 
	 
}
