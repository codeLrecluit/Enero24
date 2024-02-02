package Ejercicio_JJNG;

public class TarjetaSD extends DispositivoAlmacenamiento {

    String claseVelocidad;

    public TarjetaSD() {
    }

    public TarjetaSD(String marca, String modelo, double capacidad, String claseVelocidad) {
        super(marca, modelo, capacidad);
        this.claseVelocidad = claseVelocidad;
    }

    public void cargarDatos() {
        System.out.println("Cargando datos en la tarjeta SD...");
    }

    public String getClaseVelocidad() {
        return claseVelocidad;
    }

    public void setClaseVelocidad(String claseVelocidad) {
        this.claseVelocidad = claseVelocidad;
    }

    @Override
    public String toString() {
        return "TarjetaSD [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad +
                ", claseVelocidad=" + claseVelocidad + "]";
    }
}
