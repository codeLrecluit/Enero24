package program;

public class Reloj {
    String tipo;
    int minutos;
    int horas;
    int segundos;
    String material;

    public Reloj(){}

    public Reloj(String tipo, int minutos, int horas, int segundos, String material) {
        this.tipo = tipo;
        this.minutos = minutos;
        this.horas = horas;
        this.segundos = segundos;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "tipo='" + tipo + '\'' +
                ", minutos=" + minutos +
                ", horas=" + horas +
                ", segundos=" + segundos +
                ", material='" + material + '\'' +
                '}';
    }
}
//En este ejercicio se explico que es la herencia
