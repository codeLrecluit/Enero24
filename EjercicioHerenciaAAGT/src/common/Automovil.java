package common;

public class Automovil extends Vehiculo {

	private int puertas;

    public Automovil(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.setPuertas(puertas);
    }
    
    public void conducir() {
        System.out.println("Conduciendo el automóvil");
    }

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
}