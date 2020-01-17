package blockbuster;

public class Pelicula {
	private String nombre;
	private double precio;
	private int categoria;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String nombre, double precio, int categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getCategoria() {
		return categoria;
	}
	
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}