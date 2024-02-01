package common;

public class SistemaOperativo {
	String fabricante;
	String nombre;
	int verison;
	
	public SistemaOperativo() {
		
	}

	public SistemaOperativo(String fabricante, String nombre, int verison) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.verison = verison;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVerison() {
		return verison;
	}

	public void setVerison(int verison) {
		this.verison = verison;
	}

	@Override
	public String toString() {
		return "SistemaOperativo [fabricante=" + fabricante + ", nombre=" + nombre + ", verison=" + verison + "]";
	}
	
}
