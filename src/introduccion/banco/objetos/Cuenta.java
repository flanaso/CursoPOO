package introduccion.banco.objetos;

public class Cuenta {
	private int numeroCuenta ;
	private int saldo;
	
	public Cuenta() {
		
	}

	public Cuenta(int numeroCuenta, int saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	// Getters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	
	// Setters
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo - 100;
	}
	

	void depositar(int deposito) {
		saldo += deposito;
	}
	
	void retirar(int retiro) {
		saldo -= retiro;
	}
	
	void transferir(int monto, Cuenta cuenta) {
		cuenta.depositar(monto);
		retirar(monto);
	}
	
	void mostrarEstadoCuenta() {
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("Saldo de cuenta: " + saldo);
	}
}
