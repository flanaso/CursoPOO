package adivinarNumero.estructurado;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // Para leer por teclado

		int numero = (int) (Math.random() * 10);
		
		int numeroIntentos = 0;
		boolean adivinado = false;
		
		while (adivinado == false) {
			System.out.println("Adivina el número del 0 al 10 que estoy pensando:");
			int intento = entrada.nextInt();
			
			numeroIntentos++;

			if (intento == numero) {
				System.out.println("Felicidades, lo lograste en " + numeroIntentos + " intentos");
				adivinado = true;
			} else {
				System.out.println("Lo siento! No es el número, intenta nuevamente");
			}
		}
	}
}
