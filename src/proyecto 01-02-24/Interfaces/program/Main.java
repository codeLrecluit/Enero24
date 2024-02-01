package program;

import program.exercicio.Calculadora;
import program.exercicio.CalculadoraBasica;
import program.exercicio.CalculadoraCientifica;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CalculadoraBasica calculadora = new CalculadoraBasica();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        calculadoraCientifica.Potenciar(2,2);
    }
}
