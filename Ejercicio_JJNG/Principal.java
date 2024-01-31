package Ejercicio_JJNG;

public class Principal {

public static void main(String[] args) {
		
		// Objeto de la clase padre
        DispositivoAlmacenamiento d1 = new DispositivoAlmacenamiento("Samsung", "Portable SSD", 512);
        d1.transferirDatos(); // método de clase padre

        // Objeto de la clase hija (USB)
        USB usb1 = new USB("SanDisk", "Cruzer", 64, 3, "3.0");

        // Objeto de la otra clase hija (TarjetaSD)
        TarjetaSD tarjetaSD1 = new TarjetaSD("Samsung", "EVO Plus", 128, "Clase 10");

        usb1.transferirDatos(); // método de clase padre heredado
        usb1.conectar(); // método de clase hija (exclusivo)

        tarjetaSD1.transferirDatos(); // método de clase padre heredado
        tarjetaSD1.cargarDatos(); // método de clase hija (exclusivo)

        // Mostrar información de los objetos
        System.out.println("Información del USB 1: " + usb1);
        System.out.println("Información de la Tarjeta SD 1: " + tarjetaSD1);
	}
}
