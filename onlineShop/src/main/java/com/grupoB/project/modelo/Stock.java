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
import javax.persistence.Table;

/**
 * Stock generated by hbm2java
 */
@Entity
@Table(name = "stock", catalog = "tiendaonlinefinal")
public class Stock implements java.io.Serializable {

	private Integer idStock;
	private Libro libro;
	private Integer cantidadStock;

	public Stock() {
	}

	public Stock(Libro libro) {
		this.libro = libro;
	}

	public Stock(Libro libro, Integer cantidadStock) {
		this.libro = libro;
		this.cantidadStock = cantidadStock;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idStock", unique = true, nullable = false)
	public Integer getIdStock() {
		return this.idStock;
	}

	public void setIdStock(Integer idStock) {
		this.idStock = idStock;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro", nullable = false)
	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Column(name = "cantidadStock")
	public Integer getCantidadStock() {
		return this.cantidadStock;
	}

	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

}