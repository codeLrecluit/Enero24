package common;

public class Principal {
public static void main(String[]args) {
	Reloj r1 = new Reloj();
	r1.mostrarHora();
	
	Smartwatch sm1 = new Smartwatch();
	sm1.mostrarHora();
	sm1.sincronizarhora();//metodo clase hija (exclusiva
	
	//System.out.println(Reloj.MINUTOS_MAX);
	
}
}
