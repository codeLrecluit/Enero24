package common;

public class Cuadrado extends Figura {

	double lado;

	public Cuadrado() {

	}

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double cArea() {
		return lado * lado;
	}
}
