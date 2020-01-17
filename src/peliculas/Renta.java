package peliculas;

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
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
}
