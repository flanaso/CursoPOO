package libreria;

public class Libreria {
	private Prestamo[] prestamos;
	private int i;
	
	public Libreria() {
		prestamos = new Prestamo[20];
		i = 0;
	}
	
	public void prestarLibro(Usuario usuario, Libro libro) {
		Prestamo prestamo = new Prestamo();
		prestamo.setUsuario(usuario);
		prestamo.setLibro(libro);
		
		prestamos[i] = prestamo;
		i++;
	}
	
	public Prestamo[] getPrestamos() {
		return prestamos;
	}
}
