package blockbuster;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private ArrayList<Renta> rentas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Pelicula> peliculas;
	
	public Tienda() {
		rentas = new ArrayList<>();
		clientes = new ArrayList<>();
		peliculas = new ArrayList<>();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public List<Renta> getRentas() {
		return rentas;
	}
	
	public void setRentas(ArrayList<Renta> rentas) {
		this.rentas = rentas;
	}
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void registrarPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	public void registrarRenta(Renta renta) {
		rentas.add(renta);
	}
	
	public boolean hayClientes() {
		return clientes.size() > 0;
	}

	public boolean hayPeliculas() {
		return peliculas.size() > 0;
	}
}