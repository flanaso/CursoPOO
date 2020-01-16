package adivinarNumero.objetos;

public class Juego {
	private int numero;
	private int numeroIntentos;
	private boolean adivinado;
	
	public Juego() {
		numero = (int) (Math.random() * 10);
		numeroIntentos = 0;
		adivinado = false;
	}
	
	public void adivinar(int intento) {
		numeroIntentos++;
		if (intento == numero) {
			adivinado = true;
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

	public void setAdivinado(boolean adivinado) {
		this.adivinado = adivinado;
	}
}
