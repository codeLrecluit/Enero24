package EjercicioSt_JJNG;

public class Main {

	public static void main(String[] args) {
		// Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        CuentaBancaria cuenta2 = new CuentaBancaria(2000);

        // Mostrar saldos iniciales
        System.out.println("Saldo de cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo de cuenta2: " + cuenta2.getSaldo());

        // Cambiar la tasa de interés para todas las cuentas
        CuentaBancaria.setTasaInteresAnual(0.05);

        // Calcular el interés y aplicarlo
        cuenta1.calcularInteres();
        cuenta2.calcularInteres();

        // Mostrar saldos después de aplicar el interés
        System.out.println("Saldo de cuenta1 después de interés: " + cuenta1.getSaldo());
        System.out.println("Saldo de cuenta2 después de interés: " + cuenta2.getSaldo());
	}
	
}
