package repaso;

public class Metodos {
	public static void main(String[] args) {
		saludar("Johan");
		imprimirDosNumeros(1,2);
		System.out.println(sumar(5,5));
	}
	
	static void saludar() {
		System.out.println("Hola");
	}
	
	static void saludar(String nombre) {
		System.out.println("Hola " + nombre);
	}
	
	static void imprimirDosNumeros(int a, int b) {
		System.out.println("El número 1 es: " + a);
		System.out.println("El número 2 es: " + b);
	}
	
	static int sumar(int a, int b) {
		int suma = a + b;
		return suma;
	}
	
	static int dividir(int a, int b) {
		return a / b;
	}
	
	static int numeroMayor(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static boolean menorQue100(int n) {
		if (n < 100) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean mayorQue200(int n) {
		return n > 200;
	}
	
	static double salarioAumentado(int salario, int aumento) {
		return salario * aumento;
	}
}
