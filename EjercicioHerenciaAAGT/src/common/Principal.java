package common;

public class Principal {
	public static void main(String[] args) {
       
        Automovil miAuto = new Automovil("Toyota", "Corolla", 4);
        Motosicleta miMoto = new Motosicleta("Honda", "CBR500R", false);

        miAuto.mostrarInformacion();
        miAuto.conducir();

        System.out.println(); 
        
        miMoto.mostrarInformacion();
        miMoto.hacerCaballito();
    }
}
