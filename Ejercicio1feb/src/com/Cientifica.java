package com;

public class Cientifica {
	
public double raizCuadrada(double numero) {
	if (numero >= 0) {
		return Math.sqrt(numero);
		
	}else {
		System.out.println("no se puede calcular la raiz de un negativo");
		return Double.NaN;
	}
	

}
}
