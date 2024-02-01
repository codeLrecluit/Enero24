package program.exercicio;

import java.util.Scanner;

public class CalculadoraBasica implements Calculadora{
    @Override
    public void Suma(double num1, double num2) {
       if(num1 >= 100000 || num2 >= 100000)
           println("Cantidad de digitos superada");

       println((num1+num2)+"");
    }

    @Override
    public void Restar(double num1, double num2) {
        if(num1 >= 100000 || num2 >= 100000)
            println("Cantidad de digitos superada");

        println((num1-num2)+"");
    }

    @Override
    public void Dividir(double num1, double num2) {
        if(num1 >= 100000 || num2 >= 100000)
            println("Cantidad de digitos superada");

        println((num1/num2)+"");
    }

    @Override
    public void Multiplicar(double num1, double num2) {
        if(num1 >= 100000 || num2 >= 100000)
            println("Cantidad de digitos superada");

        println((num1*num2)+"");
    }

    private void println(String msg){
        System.out.println(msg);
    }
}
