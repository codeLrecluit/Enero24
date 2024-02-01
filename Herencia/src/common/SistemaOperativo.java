package common;

public class SistemaOperativo {

	String fabricante;
	String nombre;
	int version;
	
	public SistemaOperativo() {
		
	}

	public SistemaOperativo(String fabricante, String nombre, int version) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.version = version;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SistemaOperativo [fabricante=" + fabricante + ", nombre=" + nombre + ", version=" + version + "]";
	}

}
