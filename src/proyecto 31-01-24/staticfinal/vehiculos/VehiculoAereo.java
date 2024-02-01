package program.vehiculos;

public class VehiculoAereo extends Vehiculo {
    private String tipoMotor;
    private int altitudMaxima;

    public VehiculoAereo(String numeroPasajeros, int añoFabricacion, String tipoMotor, int altitudMaxima) {
        super(numeroPasajeros, añoFabricacion);
        this.tipoMotor = tipoMotor;
        this.altitudMaxima = altitudMaxima;
    }

    // Métodos específicos para vehículos aéreos
    public static void despegar() {
        System.out.println("Volando a altitudes elevadas.");
    }
}