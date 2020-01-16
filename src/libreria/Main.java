package libreria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Libreria libreriaTec = new Libreria();
		
		Usuario esteban = new Usuario();
		esteban.setNombre("Esteban");
		esteban.setDireccion("Algún lugar de coatza");
		esteban.setTelefono("921000000");
		esteban.setFechaNacimiento(LocalDate.of(00, 9, 14));
		esteban.setFechaInscripcion(LocalDate.of(2020, 1, 16));
		esteban.setFechaVigencia(LocalDate.of(2021, 1, 16));
		
		Libro java = new Libro();
		java.setCodigo("A00");
		java.setTitulo("Java Desde Cero");
		java.setAutor("Oracle");
		java.setEditorial("Porrua");
		java.setAñoImpresion(1990);
		java.setNoCopias(500);

		libreriaTec.prestarLibro(esteban, java);
		
		Prestamo[] prestamos = libreriaTec.getPrestamos();
		
		System.out.println(prestamos[0].getUsuario().getNombre());
		System.out.println(prestamos[0].getLibro().getTitulo());
	}

}
