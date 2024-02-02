package common;

public class Jugador extends EquipoFutbol{
	
	String nombreJugador;
	int idJugador;
	
	public Jugador() {
		
	}

	public Jugador(String nombreEquipo, String pais, int year, String nombreJugador, int idJugador) {
		super(nombreEquipo, pais, year);
		this.nombreJugador = nombreJugador;
		this.idJugador = idJugador;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	@Override
	public String toString() {
		return "Jugador [nombreJugador=" + nombreJugador + ", idJugador=" + idJugador + ", nombreEquipo=" + nombreEquipo
				+ ", pais=" + pais + ", año=" + year + "]";
	}
	
	
}
