package comon;

public class CasaInfonavit {
	
	public static double area = 120;
	
	public int habitaciones;
	
	public static int pisos =3;
	
	public String color;
	
	public CasaInfonavit() {
		
	}

	public CasaInfonavit(int habitaciones, String color) {
		super();
		this.habitaciones = habitaciones;
		this.color = color;
	}

	public static int getPisos() {
		return pisos;
	}

	public static void setPisos(int pisos) {
		CasaInfonavit.pisos = pisos;
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

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CasaInfonavit [habitaciones=" + habitaciones + ", color=" + color + "]";
	}
	
	

}
