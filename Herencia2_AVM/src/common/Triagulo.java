package common;

public class Triagulo extends Figura {
	
	double base;
	double altura;

	public Triagulo() {

	}

	public Triagulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double cArea() {
		return (base * altura) / 2;
	}

}
