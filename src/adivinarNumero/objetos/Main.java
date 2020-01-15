package adivinarNumero.objetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Juego adivinarNumero = new Juego();
		
		while (adivinarNumero.estaAdivinado() == false) {
			System.out.println("Adivina el número del 0 al 10 que estoy pensando: ");
			int intento = entrada.nextInt();

			adivinarNumero.adivinar(intento);
			if (adivinarNumero.estaAdivinado()) {
				System.out.println("Felicidades! Lo lograste en " + adivinarNumero.getNumeroIntentos() + " intentos");
			} else {
				System.out.println("Lo siento! No es el número, intenta nuevamente");
			}
		}
	}

}
