package program.vehiculos;

public class Vehiculo {
    protected String numeroPasajeros;
    protected int añoFabricacion;

    public Vehiculo(String numeroPasajeros, int añoFabricacion) {
        this.numeroPasajeros = numeroPasajeros;
        this.añoFabricacion = añoFabricacion;
    }

    public static void avanzar(){
        System.out.println("Avanzando...");
    }

    public static void retroceder(){
        System.out.println("Retroceder...");
    }

}