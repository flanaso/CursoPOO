package repaso;

public class Bisiesto {
	public static void main(String[] args) {
		int contador = 0;
		
		int año = 2021;
		while (contador < 20) {
			
			if (año % 4 == 0) {
				System.out.println("El año " + año + " es bisiesto.");
				contador++;
			}
			año++;
		}
	}
}
