package common;

public class Motosicleta extends Vehiculo {
	private boolean tieneSidecar;

    public Motosicleta(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    public void hacerCaballito() {
        System.out.println("Haciendo caballito con la motocicleta");
    }
}