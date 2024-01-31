package program;

//Extends se usa para una herencia explicita
//tambien en java existe la clase object
public class Smartwatch extends Reloj{

    SistemaOperativo so;
    public Smartwatch(){}

    public Smartwatch(String tipo, int minutos, int horas, int segundos, String material, SistemaOperativo so) {
        super(tipo, minutos, horas, segundos, material);
        this.so = so;
    }
}
