package common;

public class Dogs {
	
	public static int numDogs = 0;
	
	public String nombre;
	
	public Dogs() {

	}
	
	public Dogs(String nombre) {
		super();
		this.nombre = nombre;
		
		numDogs++;
	}
	
	public static int getNumDogs() {
		return numDogs;
			
	}
	public static void setNumDogs(int numDogs) {
		Dogs.numDogs = numDogs;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public  static void ladrar() {
		
		System.out.println("EL perro esta ladrando...");
		
	}
	
	
	
	

}
