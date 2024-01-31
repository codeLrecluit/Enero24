package common;

public class Principal {
public static void main(String[]args) {
	 ClaseA aa=new ClaseA();
	aa.setAtributo1(24);
	//aa.atributo=30;  atributos privados no son accessibledesde afuera
	//de la clase
	
	
	//atributo es protected
	aa.atributo2="hola";
	
}
}
