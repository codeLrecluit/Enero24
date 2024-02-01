package common;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Total ahora : " + Dogs.getNumDogs());
		
		Dogs d = new Dogs("Bunny");
		Dogs d2 = new Dogs("Max");
		Dogs d3 = new Dogs("Hugs");
		
		System.out.println("Total despues : " + Dogs.getNumDogs()
		+ " : " 
		+ d.nombre+ " : " + d2.nombre + " : " + d3.nombre);
		
		Dogs.ladrar();
		
	}

}
