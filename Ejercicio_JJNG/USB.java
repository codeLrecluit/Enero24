package Ejercicio_JJNG;

public class USB extends DispositivoAlmacenamiento {

    int velocidad;
    String tipoUSB;

    public USB() {
    }

    public USB(String marca, String modelo, double capacidad, int velocidad, String tipoUSB) {
        super(marca, modelo, capacidad);
        this.velocidad = velocidad;
        this.tipoUSB = tipoUSB;
    }

    public void conectar() {
        System.out.println("Conectando el USB " + tipoUSB + "...");
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoUSB() {
        return tipoUSB;
    }

    public void setTipoUSB(String tipoUSB) {
        this.tipoUSB = tipoUSB;
    }

    @Override
    public String toString() {
        return "USB [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad +
                ", velocidad=" + velocidad + ", tipoUSB=" + tipoUSB + "]";
    }
}
