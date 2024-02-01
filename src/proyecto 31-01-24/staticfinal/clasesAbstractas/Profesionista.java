package program.clasesAbstractas;

public abstract class Profesionista extends Persona{
    //Las clases abstractas son aquellas clases que tienen almenos un metodo abstracto
    //No pueden ser instanciadas dado a los metodos abstractos
    //Su unica funcion es ser heredaras

    String titulo;
    String carrera;

    public Profesionista() {

    }

    public Profesionista(String nombre, String apellido, String titulo, String carrera) {
        super(nombre, apellido);
        this.titulo = titulo;
        this.carrera = carrera;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    //Metodo abstracto
    //Son metodos que solo estan definidos pero no implementados
    public abstract void trabajar();

}