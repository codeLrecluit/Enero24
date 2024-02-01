package common;

public class Smartwatch extends Reloj {
	SistemaOperativo so;
public Smartwatch() {
	
}
public Smartwatch(String tipo, int minutos, int horas, int segundos, String material, SistemaOperativo so) {
	super(tipo, minutos, horas, segundos, material);
	this.so = so;
}
public void sincronizarhora() {
	
	System.out.println("conectado a internet");
	System.out.println("Sincronizando hora");
}
}
