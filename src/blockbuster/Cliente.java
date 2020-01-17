package blockbuster;

import java.time.LocalDate;

public class Cliente {
	private String nombre;
	private String direccion;
	private String telefono;
	private LocalDate fechaNacimiento;
	private LocalDate fechaRegistro;
	private LocalDate fechaVigencia;
	
	public Cliente() {
		
	}
	

	public Cliente(String nombre, String direccion, String telefono, LocalDate fechaNacimiento,
			LocalDate fechaRegistro, LocalDate fechaVigencia) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
		this.fechaVigencia = fechaVigencia;
	}

	public boolean esVigente() {
		if (LocalDate.now().isBefore(fechaVigencia)) {
			return true;
		} else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public LocalDate getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(LocalDate fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
}