package Ejercicio_JJNG;

public class DispositivoAlmacenamiento {

    String marca;
    String modelo;
    double capacidad;

    public DispositivoAlmacenamiento() {
    }

    public DispositivoAlmacenamiento(String marca, String modelo, double capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public void transferirDatos() {
        System.out.println("Transferiendo datos...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DispositivoAlmacenamiento [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + "]";
    }
}

