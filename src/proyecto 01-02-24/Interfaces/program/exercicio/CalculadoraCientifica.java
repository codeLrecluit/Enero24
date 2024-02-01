package program.exercicio;

public class CalculadoraCientifica implements Calculadora{
    @Override
    public void Suma(double num1, double num2) {
        println((num1+num2)+"");
    }

    @Override
    public void Restar(double num1, double num2) {
        println((num1-num2)+"");
    }

    @Override
    public void Dividir(double num1, double num2) {
        println((num1/num2)+"");
    }

    @Override
    public void Multiplicar(double num1, double num2) {
        println((num1*num2)+"");
    }


    public void Potenciar(int num1, int potencia){
        int resultado = Potencia(num1, potencia);
        println(""+resultado);
    }

    public void raizCuadrada(int num){
        double resultado = Math.sqrt(num);
        println(""+resultado);
    }


    private int Potencia(int num1, int potencia){
        if(potencia <= 0)
            return 1;
        return num1 * Potencia(num1, potencia =- 1);
    }
    private void println(String msg){
        System.out.println(msg);
    }
}
