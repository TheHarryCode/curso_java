package model;

import java.time.LocalDateTime;

public class Persona {
	
	private Long id;
	private String nombre;
	private String nombre2;
	private String apellido;
	private String apellido2;
	private String direccion;
	private String direccion2;
	private String celular;
	private String telefono;
	private String genero;
	private String tipoDocumento;
	private String documento;
	private String documentoEquivalente;
	private LocalDateTime fechaNacimiento;
	private LocalDateTime fechaExpedicionDocumento;
	private boolean personaPublica;
	private boolean declaraRenta;
	private Double salarioPromedio;
	private Double egresosMensuales;
	private Double ingresosMensuales;
	private String tieneHijos;
	private String peso;
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion2() {
		return direccion2;
	}

	public void setDireccion2(String direccion2) {
		this.direccion2 = direccion2;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumentoEquivalente() {
		return documentoEquivalente;
	}

	public void setDocumentoEquivalente(String documentoEquivalente) {
		this.documentoEquivalente = documentoEquivalente;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaExpedicionDocumento() {
		return fechaExpedicionDocumento;
	}

	public void setFechaExpedicionDocumento(LocalDateTime fechaExpedicionDocumento) {
		this.fechaExpedicionDocumento = fechaExpedicionDocumento;
	}

	public boolean isPersonaPublica() {
		return personaPublica;
	}

	public void setPersonaPublica(boolean personaPublica) {
		this.personaPublica = personaPublica;
	}

	public boolean isDeclaraRenta() {
		return declaraRenta;
	}

	public void setDeclaraRenta(boolean declaraRenta) {
		this.declaraRenta = declaraRenta;
	}

	public Double getSalarioPromedio() {
		return salarioPromedio;
	}

	public void setSalarioPromedio(Double salarioPromedio) {
		this.salarioPromedio = salarioPromedio;
	}

	public Double getEgresosMensuales() {
		return egresosMensuales;
	}

	public void setEgresosMensuales(Double egresosMensuales) {
		this.egresosMensuales = egresosMensuales;
	}

	public Double getIngresosMensuales() {
		return ingresosMensuales;
	}

	public void setIngresosMensuales(Double ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(String tieneHijos) {
		this.tieneHijos = tieneHijos;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}


}
