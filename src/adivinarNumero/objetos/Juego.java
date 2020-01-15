package adivinarNumero.objetos;

public class Juego {
	private int numero;
	private int numeroIntentos;
	private boolean adivinado;
	
	public Juego() {
		numero = (int) (Math.random() * 10);
		numeroIntentos = 1;
		adivinado = false;
	}
	
	public void adivinar(int intento) {
		if (intento == numero) {
			adivinado = true;
		} else {
			numeroIntentos++;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroIntentos() {
		return numeroIntentos;
	}

	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

	public boolean estaAdivinado() {
		return adivinado;
	}

	public void estaAdivinado(boolean adivinado) {
		this.adivinado = adivinado;
	}
}
