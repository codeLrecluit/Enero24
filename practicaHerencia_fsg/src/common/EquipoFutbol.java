package common;

public class EquipoFutbol {	
	String nombreEquipo;
	String pais;
	int year;
	
	public EquipoFutbol() {
		
	}

	public EquipoFutbol(String nombreEquipo, String pais, int year) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.pais = pais;
		this.year = year;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "EquipoFutbol [nombreEquipo=" + nombreEquipo + ", pais=" + pais + ", year=" + year + "]";
	}
	
	
	
}
