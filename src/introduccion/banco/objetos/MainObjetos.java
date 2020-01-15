package introduccion.banco.objetos;

public class MainObjetos {
	public static void main(String[] args) {
		Cuenta cuentaJohan = new Cuenta(10, 200);
		Cuenta cuentaAguirre = new Cuenta(11, 600);
		

		cuentaJohan.transferir(50, cuentaAguirre);
		
		System.out.println("Johan ........");
		cuentaJohan.mostrarEstadoCuenta();
		System.out.println("Aguirre ........");
		cuentaAguirre.mostrarEstadoCuenta();
	}
}
