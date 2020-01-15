package introduccion.banco.estructurado;

public class MainEstructurado {
	public static void main(String[] args) {
		int numeroCuenta = 20;
		int saldo = 100;
		
		saldo += 100; // Supongamos que se hace un depósito

		// Mostramos la cuenta y el saldo después de haber hecho el depósito
		imprimirEstadoCuenta(numeroCuenta, saldo);

		saldo -= 50; // Supongamos que se hace un retiro

		// Mostramos nuevamente la cuenta y el saldo después de haber hecho el retiro
		imprimirEstadoCuenta(numeroCuenta, saldo);
		
		saldo += 500;
		imprimirEstadoCuenta(numeroCuenta, saldo);
		
		// IMPLEMENTAR RETIRO
	}
	
	static void imprimirEstadoCuenta(int numeroCuenta, int saldo) {
		System.out.println("No. de cuenta: " + numeroCuenta);
		System.out.println("Saldo de cuenta: " + saldo);
	}
}
