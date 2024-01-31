package common;

public class Principal {
	public static void main(String[]args) {
		
	SeleccionFutbol slf = new SeleccionFutbol();
	
	System.out.println(slf);
	
	slf.setLocalidad("toluca");
	slf.setNombre("canchca");
	slf.setNumerotrabajadores(23);
	slf.setTelefeno(123445);
	 System.out.println(slf);

 
		 

}
	public Principal(){
		
		 Jugadores j = new Jugadores();
		 System.out.println(j);
		 j.setEdad(21);
		 j.setNombre("Raul");
		 j.setNumero(19);
		
		 System.out.println(j);
	}
}