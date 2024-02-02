package common;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		//ARRAYLIST ES UNA CLASE QUE IMPLEMENTA LA INTERFACE
		//LISTE ES UNA INTERFACE
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<String> cadenas = new ArrayList<String>();
		
		List<Auto> autos = new ArrayList<Auto>();
		Auto a1 = new Auto("123", "43", "76");
		Auto a2 = new Auto("123", "43", "76");
		Auto a3 = new Auto("123", "43", "76");
		Auto a4 = new Auto("123", "43", "76");
		Auto a5 = new Auto("123", "43", "76");
		Auto a6 = new Auto("123", "43", "76");
		autos.add(a1);
		autos.add(a2);
		autos.add(a3);
		autos.add(a4);
		autos.add(a5);
		autos.add(a6);
		System.out.println(autos);
		
		cadenas.add("ewqe");
		cadenas.add("123");
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		
		System.out.println(numeros.contains(2));
		System.out.println(cadenas.contains("1asdsa"));
		
	
		
	}

}
