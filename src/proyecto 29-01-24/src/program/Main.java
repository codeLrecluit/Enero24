package program;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        PhoneClass phoneClass = new PhoneClass("Honor", "Honor View 10", 6700, false, 7);
        PhoneClass phone = new PhoneClass();
        phone.model = "Example";
        System.out.println(phone.model);

        Auto auto = new Auto();
        auto.setEstandar(true);
        auto.setMarca("Nissan");
        auto.setPrecio(100000);
        auto.setLitrosGasolina(150);
        auto.setModelo("tsuru");

        System.out.println(auto);
        auto.Encender();
        auto.Apagar();

        Asiento[] asientos = {new Asiento("RECARO", "Delantero", "Tela"), new Asiento("Bilstein", "Trasero", "Piel")};


        Auto camioneta = new Auto("Ford", "Ranger", true, 250, 20000.0,  new Motor("Ranger", "Ford", 4), asientos);
        System.out.println(camioneta);
    }

}