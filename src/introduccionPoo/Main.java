package introduccionPoo;

public class Main {

	public static void main(String[] args) {
		Trabajador trabajadorUno = new Trabajador();
		Trabajador trabajadorDos = new Trabajador();

		int salario1 = trabajadorUno.cobrarSalario();
		int salario2 = trabajadorDos.cobrarSalario();
		System.out.println("El salario del trabadjor 1 es: " + salario1);
		System.out.println("El salario del trabadjor 2 es: " + salario2);
		
		
		Coche ferrari = new Coche();
		ferrari.acelerar();
		ferrari.darVuelta();
		ferrari.frenar();
	}
	
}
