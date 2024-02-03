package trabajo;

public class Ciudad {
	String nombre;
	String estado;
	double area;
	int numeroHabitantes;
	public Ciudad(String nombre, String estado, double area, int numeroHabitantes) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.area = area;
		this.numeroHabitantes = numeroHabitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", estado=" + estado + ", area=" + area + ", numeroHabitantes="
				+ numeroHabitantes + "]";
	}
	
	
	
	
}
