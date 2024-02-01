package common;

public class Cientifica extends  Basica implements OperacionCientificas{

	@Override
    public double elevar(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    @Override
    public double raizCuadrada(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
    }
}