package common;

public class Principal {
	public static void main(String[] args) {

		Cuadrado c = new Cuadrado("verde", 4.0);
		System.out.println("Cuadrado : " + c.getColor() + " : " + c.cArea());

		Triagulo t = new Triagulo("Rojo", 7.0, 3.0);
		System.out.println("Triangulo : " + t.getColor() + " : " + t.cArea());

	}

}
