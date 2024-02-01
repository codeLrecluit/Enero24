package common;

public class Smartwatch extends Reloj{
	
	SistemaOperativo so;
	
	public Smartwatch() {
		
	}

	public Smartwatch(String tipo, int minutos, int horas, int segundos, String material, SistemaOperativo so) {
		//llamada al constructor de la clase padre
		super(tipo, minutos, horas, segundos, material);
		
		this.so = so;
	}
	
	//metodo nativo
	public void sincronizarHora() {
		System.out.println("Conecatando a internet");
		System.out.println("Sincronizando hora...");
	}
	
	//
	@Override 
	public void mostrarHora() {
		System.out.println("Nueva hora...");
	}
	
}
