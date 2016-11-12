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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedido generated by hbm2java
 */
@Entity
@Table(name = "pedido", catalog = "tiendaonlinefinal3")
public class Pedido implements java.io.Serializable {


	public Pedido(Integer idPedido, Cliente cliente, Date fechaPedido, Date fechaEntrega, Date horaPedido,
			Float precioTotal, String formaPago, Set<Libropedido> libropedidos) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.horaPedido = horaPedido;
		this.precioTotal = precioTotal;
		this.formaPago = formaPago;
		this.libropedidos = libropedidos;
	}

	private static final long serialVersionUID = 1L;
	private Integer idPedido;
	private Cliente cliente;
	private Date fechaPedido;
	private Date fechaEntrega;
	private Date horaPedido;
	private Float precioTotal;
	private String formaPago;
	private Set<Libropedido> libropedidos = new HashSet<Libropedido>();

	public Pedido() {
	}

	public Pedido(Cliente cliente, Date fechaPedido, Date horaPedido, String formaPago) {
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
		this.horaPedido = horaPedido;
		this.formaPago = formaPago;
	}

	public Pedido(Cliente cliente, Date fechaPedido, Date fechaEntrega, Date horaPedido, Float precioTotal,
			String formaPago, Set<Libropedido> libropedidos) {
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.horaPedido = horaPedido;
		this.precioTotal = precioTotal;
		this.formaPago = formaPago;
		this.libropedidos = libropedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idPedido", unique = true, nullable = false)
	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaPedido", nullable = false, length = 10)
	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaEntrega", length = 10)
	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "horaPedido", nullable = false, length = 19)
	public Date getHoraPedido() {
		return this.horaPedido;
	}

	public void setHoraPedido(Date horaPedido) {
		this.horaPedido = horaPedido;
	}

	@Column(name = "precioTotal", precision = 12, scale = 0)
	public Float getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(Float precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Column(name = "formaPago", nullable = false, length = 45)
	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	public Set<Libropedido> getLibropedidos() {
		return this.libropedidos;
	}

	public void setLibropedidos(Set<Libropedido> libropedidos) {
		this.libropedidos = libropedidos;
	}

}