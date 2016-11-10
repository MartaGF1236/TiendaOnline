// default package
// Generated 10-nov-2016 13:42:43 by Hibernate Tools 4.0.0.Final
package com.grupoB.project.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Libro generated by hbm2java
 */
@Entity
@Table(name = "libro", catalog = "tiendaonlinefinal")
public class Libro implements java.io.Serializable {

	private Integer idLibro;
	private String isbn;
	private String titulo;
	private Integer edicion;
	private Date fechaPublicacion;
	private String descripcion;
	private String urlImagen;
	private Set autors = new HashSet(0);
	private Set libropedidos = new HashSet(0);
	private Set stocks = new HashSet(0);
	private Set editorials = new HashSet(0);
	private Set categorias = new HashSet(0);
	private Set precios = new HashSet(0);

	public Libro() {
	}

	public Libro(String isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}

	public Libro(String isbn, String titulo, Integer edicion, Date fechaPublicacion, String descripcion,
			String urlImagen, Set autors, Set libropedidos, Set stocks, Set editorials, Set categorias, Set precios) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicion = edicion;
		this.fechaPublicacion = fechaPublicacion;
		this.descripcion = descripcion;
		this.urlImagen = urlImagen;
		this.autors = autors;
		this.libropedidos = libropedidos;
		this.stocks = stocks;
		this.editorials = editorials;
		this.categorias = categorias;
		this.precios = precios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLibro", unique = true, nullable = false)
	public Integer getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	@Column(name = "isbn", nullable = false, length = 45)
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "titulo", nullable = false, length = 45)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "edicion")
	public Integer getEdicion() {
		return this.edicion;
	}

	public void setEdicion(Integer edicion) {
		this.edicion = edicion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaPublicacion", length = 10)
	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	@Column(name = "descripcion", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "urlImagen", length = 120)
	public String getUrlImagen() {
		return this.urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public Set getAutors() {
		return this.autors;
	}

	public void setAutors(Set autors) {
		this.autors = autors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public Set getLibropedidos() {
		return this.libropedidos;
	}

	public void setLibropedidos(Set libropedidos) {
		this.libropedidos = libropedidos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public Set getStocks() {
		return this.stocks;
	}

	public void setStocks(Set stocks) {
		this.stocks = stocks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public Set getEditorials() {
		return this.editorials;
	}

	public void setEditorials(Set editorials) {
		this.editorials = editorials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public Set getCategorias() {
		return this.categorias;
	}

	public void setCategorias(Set categorias) {
		this.categorias = categorias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public Set getPrecios() {
		return this.precios;
	}

	public void setPrecios(Set precios) {
		this.precios = precios;
	}

}
