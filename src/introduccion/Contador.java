package introduccion;

public class Contador {
	private int numero;
	
	public Contador() {
		
	}
	
	public Contador(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incrementar(int incremento) {
		numero += incremento;
	}
	
	public void decrementar(int decremento) {
		numero -= decremento;
	}
	
	public static void main(String[] args) {
		Contador miContador = new Contador(10);
		
		miContador.incrementar(1);
		miContador.incrementar(1);
		miContador.incrementar(1);
		System.out.println(miContador.getNumero());
		miContador.decrementar(4);
		System.out.println(miContador.getNumero());
		miContador.setNumero(3);
		System.out.println(miContador.getNumero());
	}
}
