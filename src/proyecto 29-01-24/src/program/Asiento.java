package program;

public class Asiento {
    private String marca;
    private String tipo;
    private String material;

    public Asiento(String marca, String tipo, String material) {
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
