package common;

public class CalculadoraCientifica extends Metodosbasicos implements MetodosCientificos{
	
    public double seno(double angulo) {
        return Math.sin(angulo);
    }

    public double coseno(double angulo) {
        return Math.cos(angulo);
    }

    public double logaritmo(double base, double numero) {
        return Math.log(numero) / Math.log(base);
    }

}
