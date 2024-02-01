package common;

public class Principal {
	public static void main(String[] args) {
		Basica b1 = new Basica();
		b1.Suma(10, 20);
		b1.Resta(10, 20);
		b1.Division(10, 20);
		b1.Multiplicacion(10, 20);
		
		Cientifica c1 = new Cientifica();
		c1.raizCuadrada(3);
		c1.operacionesTrigonometricas(45.0);
		c1.potencia(2, 3);
		
	}
}
