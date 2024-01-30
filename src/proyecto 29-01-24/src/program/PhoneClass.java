package program;


public class PhoneClass {
    //Las clases son plantillas o modelos de objetos.
    //Las clases de componen de
    //Atributos
        //Definen el estado de la clase
    String marca;
    double tamanoPantalla;
    String model;
    double price;
    boolean cargaInalambrinca;


    //Medotodos
        //Definen el comportamiento de la clase y hay tres formas en que las
        //clases pueden adquirir comportamientos
        //metodos nativos
        //metodos heredaros (comunmente sobreescritos)
        //metodos implementados ( implementados de interfaces)


    //Todas las clases tienen un metodo contructor, mismo que inicializan los atributos
    public PhoneClass(String marca, String model, double price, boolean cargaInalambrinca, double tamanoPantalla){
                     //Argumentos de clases.
        this.cargaInalambrinca = cargaInalambrinca;
        this.marca = marca;
        this.price = price;
        this.model = model;
        this.tamanoPantalla = tamanoPantalla;
    }

    public PhoneClass(){}

    //Tambien tienen metodos getter y setter
    //son mecanismo para la entrada y salida de datos de los objetos
    //forman parte de un objeto

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCargaInalambrinca() {
        return cargaInalambrinca;
    }

    public void setCargaInalambrinca(boolean cargaInalambrinca) {
        this.cargaInalambrinca = cargaInalambrinca;
    }


    //ToString no es muy usado, pero se sobre escribe
    //Permite renderizar el valor del objeto o convertir el objeto en un string
    //SI se implementa se retorna la direccion de memoria

    @Override
    public String toString() {
        return "PhoneClass{" +
                "marca='" + marca + '\'' +
                ", tamanoPantalla=" + tamanoPantalla +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", cargaInalambrinca=" + cargaInalambrinca +
                '}';
    }


}
