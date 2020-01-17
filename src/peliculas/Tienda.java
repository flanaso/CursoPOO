package peliculas;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Renta> rentas;
	
	public Tienda() {
		peliculas = new ArrayList<>();
		clientes = new ArrayList<>();
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public ArrayList<Renta> getRentas() {
		return rentas;
	}
	
	public void registrarPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void registrarRenta(Renta renta) {
		rentas.add(renta);
	}
}
