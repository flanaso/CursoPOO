package libreria;

public class Libreria {
	private Prestamo[] prestamos;
	private Usuario[] usuarios;
	private Libro[] libros;
	private int i;
	
	public Libreria() {
		prestamos = new Prestamo[20];
		usuarios = new Usuario[50];
		libros = new Libro[200];
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
