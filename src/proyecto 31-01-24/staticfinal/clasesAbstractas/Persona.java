package program.clasesAbstractas;

//POJO | Plain Old Java Object
// Estas clases se utilizan comúnmente para representar datos de manera sencilla,
// sin lógica de negocio compleja
public class Persona {

    String nombre;
    String apellido;


    public Persona() {

    }


    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}