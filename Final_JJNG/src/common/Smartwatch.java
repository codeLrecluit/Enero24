package common;
public class Smartwatch extends Reloj{
	
	SistemaOperativo so;
	
	public Smartwatch() {
		
	}
	
	
	public Smartwatch(String tipo, int minutos, int horas, int segundos, String material, SistemaOperativo so) {
		super(tipo, minutos, horas, segundos, material);
		this.so = so;
	}
	
	
	//Metodo nativo 
	public void sincronizarHora() {
		
		System.out.println("Conectando a internet ....");
		System.out.println("Sincronizando hora...");
	}
	
	@Override
	public void mostrarHora() {
		System.out.println("Esta es la hora .....");
	}
	
	
	

	
}
