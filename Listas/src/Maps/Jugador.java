package Maps;

import java.util.Map;
import java.util.TreeMap;

public class Jugador {
	
	private int dorsal;
	private String nombre;
	private String demarcacion;
	
	
	
	public Jugador() {
		super();
	}

	public Jugador(int dorsal, String nombre, String demarcacion) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", nombre=" + nombre + ", demarcacion=" + demarcacion + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("TREEMPA CON OBJETOS Y COMO CLAVE STRING");
		Map<String, Jugador> jugadores = new TreeMap<String,Jugador>();
		
		jugadores.put("Casillas", new Jugador(1,"Casilas", "Portero"));
		
	}

}
