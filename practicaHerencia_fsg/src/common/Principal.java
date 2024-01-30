package common;

public class Principal {
	
	public static void main(String[] args) {
		
		Jugador j1 = new Jugador();
		
		j1.setNombreJugador("Raul S.");
		j1.setIdJugador(23);
		
		j1.setNombreEquipo("Puebla");
		j1.setPais("Mexico");
		j1.setYear(1960);
		
		
		System.out.println(j1);
		
	
	}

}
