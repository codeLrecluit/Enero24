package program.vehiculos;

public class VehiculoTerrestre extends Vehiculo {
    private int numeroRuedas;
    private final String tipoCombustible;

    public VehiculoTerrestre(String numeroPasajeros, int añoFabricacion, int numeroRuedas, String tipoCombustible) {
        super(numeroPasajeros, añoFabricacion);
        this.numeroRuedas = numeroRuedas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
}