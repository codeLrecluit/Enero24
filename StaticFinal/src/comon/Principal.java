package comon;

public class Principal {

	public static void main(String[] args) {

		CasaInfonavit ci = new CasaInfonavit(2, "Verde");
		CasaInfonavit c2 = new CasaInfonavit(1, "Rojo");
		CasaInfonavit c3 = new CasaInfonavit(3, "Azul");
		
		//COMO SE DENIFIO STATIC TODOS TIENE EL MISMOS
		System.out.println(ci.getArea());
		System.out.println(c2.getArea());
		System.out.println(c3.getArea());
		
		//ACCEDIENDO CON UN MECANISMO DE OBJETO (SETTER)
		//MODIFICACION DE STATIC MODIFICA TODOS
		//System.out.println(CasaInfonavit.area);//ACCEDIENDO DIRECTO
		//ci.setArea(150);
		
		CasaInfonavit.area = 200;
		System.out.println(ci.getArea());
		System.out.println(c2.getArea());
		System.out.println(c3.getArea());
		
		
		System.out.println(ci.getPisos());
		System.out.println(c2.getPisos());
		System.out.println(c3.getPisos());
		
		

	}

}
