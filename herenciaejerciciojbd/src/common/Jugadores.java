package common;

public class Jugadores {
 
	String nombre;
	int edad;
	int numero;
	
	public Jugadores() {
		
	
	}

	public Jugadores(String nombre, int edad, int numero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
