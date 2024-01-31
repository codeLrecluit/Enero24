package common;

public class SeleccionFutbol {
	String nombre;
	
	int numerotrabajadores;
	int telefeno;
	String localidad;
	
	public SeleccionFutbol() {
		
	}

	public SeleccionFutbol(String nombre, int numerotrabajadores, int telefeno, String localidad) {
		super();
		this.nombre = nombre;
		this.numerotrabajadores = numerotrabajadores;
		this.telefeno = telefeno;
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumerotrabajadores() {
		return numerotrabajadores;
	}

	public void setNumerotrabajadores(int numerotrabajadores) {
		this.numerotrabajadores = numerotrabajadores;
	}

	public int getTelefeno() {
		return telefeno;
	}

	public void setTelefeno(int telefeno) {
		this.telefeno = telefeno;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "SeleccionFutbol [nombre=" + nombre + ", numerotrabajadores=" + numerotrabajadores + ", telefeno="
				+ telefeno + ", localidad=" + localidad + "]";
	}
	

}
