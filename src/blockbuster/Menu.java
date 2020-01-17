package blockbuster;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
	private Scanner entrada;
	private Tienda blockbuster;
	
	public Menu() {
		entrada = new Scanner(System.in);
		blockbuster = new Tienda();
	}

	public void mostrarMenuPrincipal() {
		System.out.println("***Seleccione una opcion***");
		System.out.println("1.- Registrar cliente");
		System.out.println("2.- Registrar película");
		System.out.println("3.- Registrar prestamo");
		
		int opcion = Integer.parseInt(entrada.nextLine());
		switch (opcion) {
		case 1: pedirDatosCliente();
		break;
		case 2: pedirDatosPelicula();
		break;
		case 3: pedirDatosRenta();
		break;
		}
	}
	
	private void pedirDatosCliente() {
		System.out.print("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("Dirección: ");
		String direccion = entrada.nextLine();
		System.out.print("Teléfono: ");
		String telefono = entrada.nextLine();
		System.out.print("Fecha de nacimiento: ");
		LocalDate fechaNacimiento = LocalDate.parse(entrada.nextLine());
		System.out.print("Fecha de registro: ");
		LocalDate fechaRegistro = LocalDate.parse(entrada.nextLine());
		System.out.print("Fecha de vigencia: ");
		LocalDate fechaVigencia = LocalDate.parse(entrada.nextLine());
		
		Cliente cliente = new Cliente(nombre,direccion,telefono,fechaNacimiento,fechaRegistro,fechaVigencia);
		blockbuster.registrarCliente(cliente);
		System.out.println("Cliente registrado!!");
		mostrarMenuPrincipal();
	}
	
	private void pedirDatosPelicula() {
		System.out.print("Nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("Precio: ");
		double precio = Double.parseDouble(entrada.nextLine());
		System.out.print("Categoría: ");
		int categoria = Integer.parseInt(entrada.nextLine());
		
		Pelicula pelicula = new Pelicula(nombre,precio,categoria);
		blockbuster.registrarPelicula(pelicula);
		System.out.println("Pelicula registrada!!");
		mostrarMenuPrincipal();
	}
	
	private void pedirDatosRenta() {
		if (blockbuster.hayClientes() == false) { // Si no hay clientes, mandar alerta
			System.out.println("No hay clientes registrados!!");
			mostrarMenuPrincipal();
		} else if (blockbuster.hayPeliculas() == false) { // Si no hay películas, mandar alerta
			System.out.println("No hay películas registradas!!");
			mostrarMenuPrincipal();
		} else { // Si hay clientes y películas entonces se puede hacer una renta
			mostrarClientes();
			System.out.print("Seleccione el cliente: ");
			int indiceCliente = Integer.parseInt(entrada.nextLine());
			Cliente cliente = blockbuster.getClientes().get(indiceCliente); // Recuperamos el cliente

			mostrarPeliculas();
			System.out.print("Seleccione la película: ");
			int indicePelicula = Integer.parseInt(entrada.nextLine());
			Pelicula pelicula = blockbuster.getPeliculas().get(indicePelicula); // Recuperamos la película
		
			if (cliente.esVigente()) {
				Renta renta = new Renta(cliente, pelicula);
				blockbuster.registrarRenta(renta);
				System.out.println("Renta registrada!!");
				mostrarMenuPrincipal();
			} else {
				System.out.println("El cliente no está vigente!!");
				mostrarMenuPrincipal();
			}
		}
	}
	
	private void mostrarClientes() {
		int i = 0;
		for (Cliente cliente : blockbuster.getClientes()) {
			System.out.println(i + ".- " + cliente.getNombre());
			i++;
		}
	}
	
	private void mostrarPeliculas() {
		int i = 0;
		for (Pelicula pelicula : blockbuster.getPeliculas()) {
			System.out.println(i + ".- " + pelicula.getNombre());
			i++;
		}
	}
}
