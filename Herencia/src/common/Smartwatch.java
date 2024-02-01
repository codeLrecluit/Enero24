package common;

public class Smartwatch extends Reloj{
	

	
	SistemaOperativo so;
	
	public Smartwatch() {
		
	}
//LLAMAR EL CONSTRUCTOR DE LA CLASE PADRE
	public Smartwatch(String tipo, int minutos, int horas, int segundos, String material, SistemaOperativo so) {
		super(tipo, minutos, horas, segundos, material);
		this.so = so;
	}
	
	
	//METODO NATIVO
	public void sincrnizarHora() {
		
		System.out.println("Conectando");
		System.out.println("Sincronizando");
		
	}
	
	 @Override
	public void mostrarhora() {
		System.out.println("La hora es...");
	}
	

}
