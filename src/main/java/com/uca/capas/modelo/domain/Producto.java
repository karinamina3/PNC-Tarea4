package com.uca.capas.modelo.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	
	@Pattern(regexp="[\\d]{12}", message = "Debe tener una longitud de 12 dígitos exactamente")
	String  codigo;
	
	@Size(min=1, max=100, message = "Debe tener una longitud entre 1 y 100 caracteres")
	String nombre;
	
	@Size(min=1, max=100, message = "Debe tener una longitud entre 1 y 100 caracteres")
	String marca;
	
	@Size(min=1, max=500, message = "Debe tener una longitud entre 1 y 500 caracteres")
	String descripcion;
	
	@NotEmpty
	@Pattern(regexp="[0-9]+$", message = "Debe ser un número sin decimales")
	String existencia;
	
	@NotEmpty(message = "Debe ingresar una fecha")
	@DateTimeFormat(pattern = "dd/mm/yyyy",  style="Debe tener el formato dd/mm/yyyy")
	String fecha;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencia() {
		return existencia;
	}

	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
