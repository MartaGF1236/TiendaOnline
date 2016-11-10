// default package
// Generated 08-nov-2016 19:34:56 by Hibernate Tools 4.0.0.Final
package entidades;

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
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "tiendaonlinefinal")
public class Cliente implements java.io.Serializable {

	private Integer idCliente;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String pais;
	private int codigoPostal;
	private String email;
	private int telefono1;
	private Integer telefono2;
	private String password;
	private Date fechaNacimiento;
	private Integer idPedido;
	private Set pedidos = new HashSet(0);

	public Cliente() {
	}

	public Cliente(String nombre, String apellido1, String direccion, String ciudad, String provincia, String pais,
			int codigoPostal, String email, int telefono1, String password) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.email = email;
		this.telefono1 = telefono1;
		this.password = password;
	}

	public Cliente(String nombre, String apellido1, String apellido2, String direccion, String ciudad, String provincia,
			String pais, int codigoPostal, String email, int telefono1, Integer telefono2, String password,
			Date fechaNacimiento, Integer idPedido, Set pedidos) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.email = email;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.idPedido = idPedido;
		this.pedidos = pedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCliente", unique = true, nullable = false)
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido1", nullable = false, length = 45)
	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "apellido2", length = 45)
	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name = "direccion", nullable = false, length = 45)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "ciudad", nullable = false, length = 45)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "provincia", nullable = false, length = 45)
	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Column(name = "pais", nullable = false, length = 45)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(name = "codigoPostal", nullable = false)
	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telefono1", nullable = false)
	public int getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(int telefono1) {
		this.telefono1 = telefono1;
	}

	@Column(name = "telefono2")
	public Integer getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(Integer telefono2) {
		this.telefono2 = telefono2;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaNacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "idPedido")
	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set pedidos) {
		this.pedidos = pedidos;
	}

}
