package common;

public class Principal {

	public static void main(String[] args) {
		
		//Objeto de la clase padre
		Reloj r1 = new Reloj();
		r1.mostrarHora();//metodo de clase padre
		
		Smartwatch sm1 = new Smartwatch();
		sm1.mostrarHora();//metodo de clase padre
		sm1.sincronizarHora();//metodo de clase hija (Exclusivo)
		
		
	}
	
}
