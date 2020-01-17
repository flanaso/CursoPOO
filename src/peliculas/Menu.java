package peliculas;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
	private Scanner entrada;
	private Tienda blockbuster = new Tienda();
	
	public Menu() {
		entrada = new Scanner(System.in);
	}
	
	public void mostrarMenuPrincipal() {
		System.out.println("**** Menú Principal ****");
		System.out.println("1.- Registrar cliente");
		System.out.println("2.- Registrar película");
		System.out.println("3.- Registrar renta");
		System.out.println("4.- Mostrar lista de películas");
		System.out.println("5.- Mostrar lista de clientes");
		System.out.println("6.- Mostrar lista de rentas");
		
		System.out.print("Selecciona una opción: ");
		int opcion = Integer.parseInt(entrada.nextLine());
		
		switch(opcion) {
		case 1: pedirDatosCliente();
			break;
		case 2: pedirDatosPelicula();
			break;
		case 3: pedirDatosRenta();
			break;
		case 4: mostrarListaPeliculas();
			break;
		case 5: mostrarListaClientes();
			break;
		case 6: mostrarListaRentas();
			break;
		}
	}
	
	private void pedirDatosPelicula() {
		System.out.print("Nombre de la película: ");
		String nombre = entrada.nextLine();
		System.out.print("Precio de la película: ");
		double precio = Double.parseDouble(entrada.nextLine());
		System.out.print("Categoría de la película: ");
		String categoria = entrada.nextLine();
		
		Pelicula pelicula = new Pelicula(nombre, precio, categoria);
		blockbuster.registrarPelicula(pelicula);
		System.out.println("Pelicula registra!!");
		mostrarMenuPrincipal();
	}

	private void pedirDatosCliente() {
		System.out.print("Nombre del cliente: ");
		String nombre = entrada.nextLine();
		System.out.print("Dirección del cliente: ");
		String direccion = entrada.nextLine();
		System.out.print("Teléfono del cliente: ");
		String telefono = entrada.nextLine();
		System.out.print("Fecha de nacimiento del cliente: ");
		LocalDate fechaNacimiento = LocalDate.parse(entrada.nextLine());
		
		Cliente cliente = new Cliente(nombre, direccion, telefono, fechaNacimiento);
		blockbuster.registrarCliente(cliente);
		System.out.println("Cliente registrado!!");
		mostrarMenuPrincipal();
	}
	
	private void pedirDatosRenta() {
		mostrarListaClientes();
		int indiceCliente = Integer.parseInt(entrada.nextLine());
		Cliente cliente = blockbuster.getClientes().get(indiceCliente);
		
		mostrarListaPeliculas();
		int indicePelicula = Integer.parseInt(entrada.nextLine());
		Pelicula pelicula = blockbuster.getPeliculas().get(indicePelicula);
		
		Renta renta = new Renta(cliente, pelicula);
		blockbuster.registrarRenta(renta);
		System.out.println("Renta registrada!!");
		mostrarMenuPrincipal();
	}
	
	private void mostrarListaPeliculas() {
		if (blockbuster.getPeliculas().size() == 0) {
			System.out.println("No hay películas registradas!!");
		} else {
			System.out.println("*** Lista de Peliculas ***");
			for (int i = 0; i < blockbuster.getPeliculas().size(); i++) {
				Pelicula pelicula = blockbuster.getPeliculas().get(i);
				System.out.println(i + ".- " + pelicula.getNombre());
			}
		}
		mostrarMenuPrincipal();
	}

	private void mostrarListaClientes() {
		if (blockbuster.getClientes().size() == 0) {
			System.out.println("No hay clientes registrados!!");
		} else {
			System.out.println("*** Lista de clientes ***");
			for (int i = 0; i < blockbuster.getClientes().size(); i++) {
				Cliente cliente = blockbuster.getClientes().get(i);
				System.out.println(i + ".- " + cliente.getNombre());
			}
		}
		mostrarMenuPrincipal();
	}
	
	private void mostrarListaRentas() {
		if (blockbuster.getRentas().size() == 0) {
			System.out.println("No hay rentas registradas!!");
		} else {
			System.out.println("*** Lista de rentas ***");
			for (int i = 0; i < blockbuster.getRentas().size(); i++) {
				Renta renta = blockbuster.getRentas().get(i);
				Cliente cliente = renta.getCliente();
				Pelicula pelicula = renta.getPelicula();
				System.out.println(i + ".- Cliente: " + cliente.getNombre() + " Pelicula: " + pelicula.getNombre());
			}
		}
		mostrarMenuPrincipal();
	}
}