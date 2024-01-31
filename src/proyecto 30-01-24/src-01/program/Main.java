package program;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Objetos de la "Clase"
        Reloj reloj = new Reloj();
        Smartwatch smartwatch = new Smartwatch();

        Cliente cliente = new Cliente("Josue Isaac", "Reyes Perez", "###-###-####");
        ClienteMiembro clienteMiembro = new ClienteMiembro("Josue", "Reyes", "###-###-####", 12345, "##/##/####", TipoMembresia.Basica);
        ClienteCasual clienteCasual = new ClienteCasual("Isaac", "Perez", "###-###-####", 5678);
    }
}

/*
    Especializacion de Objetos
    Es el motivo principal de la herencia es la especializacion de los objetos,
    las clases hijas deben tener algo que las hagan especiales a compracion del
    padre y no solo heredar, para que heredar sin un sentido.

    La herencia es un mecanismo que crea una gerarquia de clases y se usan generamelte
    cuando necesitas clases personalizadas o sobre-escribir metodos, en pocas palabrar
    definir algo nuevo.

 */