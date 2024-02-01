package common;

public class Principal {
	
	public static void main(String[] args) {
		
		//OBJETO PADRE
		Reloj r1 = new Reloj();
		r1.mostrarhora();
		
		
		//OBJETO HIJO
		Smartwatch sm1 = new Smartwatch();
		
		sm1.mostrarhora(); //METODO CLASE PADRE
		
		sm1.sincrnizarHora(); //METODO CLASE HIJA(EXCLUSIVO)
		
		System.out.println(Reloj.HORAS_MAX);
		System.out.println(Reloj.MINUTOS_MAX);
		System.out.println(Reloj.SEGUNDOS_MAX);
		
		// NO SE PUEDE CAMBIAR EL VALOR DE FINAL
		//Reloj.HORAS_MAX =35;
		
	}

}
