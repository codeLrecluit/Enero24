package program;

public class Motor {
    private String modelo;
    private String marca;
    private int numCilindros;

    public Motor(String modelo, String marca, int numCilindros) {
        this.modelo = modelo;
        this.marca = marca;
        this.numCilindros = numCilindros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }
}
