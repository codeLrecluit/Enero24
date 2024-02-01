package common;

public class CasaInfonavit {

	public static double area = 120;
	public int habitaciones;
	public static int pisos;
	public String color;
	
	public CasaInfonavit() {}
	


	public CasaInfonavit(int habitaciones, String color) {
		super();
		this.habitaciones = habitaciones;
		this.color = color;
	}



	public static double getArea() {
		return area;
	}

	public static void setArea(double area) {
		CasaInfonavit.area = area;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getColor() {
		return color;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
