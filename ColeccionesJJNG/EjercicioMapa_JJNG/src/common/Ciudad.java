package common;

public class Ciudad {
    String nombre;
    String estado;
    double area;
    int numHabitantes;

    public Ciudad(String nombre, String estado, double areaMetrosCuadrados, int numHabitantes) {
        this.nombre = nombre;
        this.estado = estado;
        this.area = areaMetrosCuadrados;
        this.numHabitantes = numHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public double getAreaMetrosCuadrados() {
        return area;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", estado=" + estado + ", area=" + area + ", numHabitantes=" + numHabitantes
				+ "]";
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
    
}