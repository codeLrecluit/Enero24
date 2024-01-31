package common;

public class Entrenador {
	
	String seleccion;
	int juegosganados;
	int campeonatos;

	public Entrenador() {
		
	}

	public Entrenador(String seleccion, int juegosganados, int campeonatos) {
		super();
		this.seleccion = seleccion;
		this.juegosganados = juegosganados;
		this.campeonatos = campeonatos;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public int getJuegosganados() {
		return juegosganados;
	}

	public void setJuegosganados(int juegosganados) {
		this.juegosganados = juegosganados;
	}

	public int getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(int campeonatos) {
		this.campeonatos = campeonatos;
	}

	@Override
	public String toString() {
		return "Entrenador [seleccion=" + seleccion + ", juegosganados=" + juegosganados + ", campeonatos="
				+ campeonatos + "]";
	}
	
}
