package com;

public class Principal {
	public static void main(String[] args) {
		//calcu basica
		 Basica b =new Basica(0, 0, 0, 0);
		 System.out.println("CALCULADORA BASICA");
	        System.out.println("suma:"+b.sumar(1, 3));
	        System.out.println("restar:"+b.restar(8, 1));
	        System.out.println("dividir:"+b.dividir(10, 2));
	        System.out.println("multiplicar:"+b.multiplicar(5, 5));
	        
	    
	    //calcu cientifica   	    
		Cientifica calcuc=new Cientifica();
		System.out.println("CALCULADORA CIENTIFICA");
		System.out.println("Raiz cuadrada:"+ calcuc.raizCuadrada(50) );
		
	}
}
