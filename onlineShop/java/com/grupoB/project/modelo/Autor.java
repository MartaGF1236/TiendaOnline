// default package
// Generated 10-nov-2016 13:42:43 by Hibernate Tools 4.0.0.Final
package com.grupoB.project.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Autor generated by hbm2java
 */

@Entity
@Table(name = "autor", catalog = "tiendaonlinefinal3")

public class Autor implements java.io.Serializable {

	private Integer idAutor;
	private Libro libro;
	private String nombre;

	public Autor() {
	}

	public Autor(Libro libro, String nombre) {
		this.libro = libro;
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAutor", unique = true, nullable = false)
	public Integer getIdAutor() {
		return this.idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro", nullable = false)
	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", libro=" + libro + ", nombre=" + nombre + "]";
	}*/

}
