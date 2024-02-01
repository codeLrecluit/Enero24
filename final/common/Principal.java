package common;
//herencia
public class Principal {
	public static void main(String[] args) {
		//objeto de la clase padre
		Reloj r1 = new Reloj();
		r1.mostrarHora();
		
		Smartwatch s1 = new Smartwatch();
		s1.mostrarHora(); //metodo de clase padre
		s1.sincronizarHora();//metodo de clase hija(exclusivo)
		
		
		System.out.println(Reloj.SEGUNDOS_MAX);
	} 
	
	
}
