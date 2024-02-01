package program.vehiculos;

public class VehiculoTerrestre extends Vehiculo {
    private int numeroRuedas;
    private String tipoCombustible;

    public VehiculoTerrestre(String numeroPasajeros, int añoFabricacion, int numeroRuedas, String tipoCombustible) {
        super(numeroPasajeros, añoFabricacion);
        this.numeroRuedas = numeroRuedas;
        this.tipoCombustible = tipoCombustible;
    }
}