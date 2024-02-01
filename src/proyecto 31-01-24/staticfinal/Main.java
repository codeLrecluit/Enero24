package program;

import program.vehiculos.Vehiculo;
import program.vehiculos.VehiculoAereo;
import program.vehiculos.VehiculoTerrestre;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        VehiculoTerrestre.avanzar();
        VehiculoAereo.retroceder();
    }
}

//Modificadores de Comportamiento Static y Final
//Hay dos ambitos, ambito de objeto y el ambito de clase,
//esto es lo que hace stactic, hace que las propiedades y metodos cambien al ambito de clase
//lo que da como resultado que puedan ser accedidos sin necesidad de un objecto, sino solo con
//el nombre de al case.

//Nota
//Los propiedades sticas puedes ser accedidos y modificadas mediante mecanismos de acceso, pero no se recomienda
//si son estaticas son por algo, el modificar el valor de una propiedad estica afectara a todos los objetos relacionados
//y lo mismo para acceder al valor, no se recomienda el uso de los mecanismo de accesos, sino entrar mejor con el nombre de
//la clase.