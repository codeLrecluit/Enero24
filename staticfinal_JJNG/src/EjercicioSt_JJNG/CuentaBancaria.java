package EjercicioSt_JJNG;

public class CuentaBancaria {

    private static double tasaInteresAnual = 0.03;
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void setTasaInteresAnual(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void calcularInteres() {
        double interes = saldo * tasaInteresAnual;
        saldo += interes;
    }
}
