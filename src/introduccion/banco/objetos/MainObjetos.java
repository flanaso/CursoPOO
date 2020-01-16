package introduccion.banco.objetos;

import java.util.Scanner;

public class MainObjetos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introduzca el no. de cuenta de Johan");
		int noCuentaJohan = entrada.nextInt();
		System.out.println("Introduzca el saldo inicial de Johan");
		int saldoJohan = entrada.nextInt();
		
		System.out.println("Introduzca el no. de cuenta de Aguirre");
		int noCuentaAguirre = entrada.nextInt();
		System.out.println("Introduzca el saldo inicial de Aguirre");
		int saldoAguirre = entrada.nextInt();
		entrada.close();
		
		Cuenta cuentaJohan = new Cuenta(20, 500);

		cuentaJohan.setSaldo(700);
		Cuenta cuentaAguirre = new Cuenta(noCuentaAguirre, saldoAguirre);

		cuentaJohan.mostrarEstadoCuenta();
		cuentaAguirre.mostrarEstadoCuenta();
	}
}
