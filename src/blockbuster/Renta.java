package blockbuster;

public class Renta {
	private Cliente cliente;
	private Pelicula pelicula;
	
	public Renta(Cliente cliente, Pelicula pelicula) {
		this.cliente = cliente;
		this.pelicula = pelicula;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pelicula getPeliculas() {
		return pelicula;
	}
	public void setPeliculas(Pelicula peliculas) {
		this.pelicula = peliculas;
	}
}