package libreria;

public class Libro {
	private String codigo;
	private String titulo;
	private String editorial;
	private String autor;
	private int añoImpresion;
	private int noCopias;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAñoImpresion() {
		return añoImpresion;
	}
	
	public void setAñoImpresion(int añoImpresion) {
		this.añoImpresion = añoImpresion;
	}
	
	public int getNoCopias() {
		return noCopias;
	}
	
	public void setNoCopias(int noCopias) {
		this.noCopias = noCopias;
	}
}
