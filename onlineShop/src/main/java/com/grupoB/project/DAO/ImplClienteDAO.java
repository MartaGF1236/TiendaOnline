package com.grupoB.project.DAO;
import java.util.List;

import com.grupoB.project.modelo.*;
import com.grupoB.project.util.Sesion;
import com.grupoB.project.DAO.*;

public class ImplClienteDAO implements I_DAO<Cliente,Integer> {
	private Sesion sesion;

	public ImplClienteDAO () {
		sesion=new Sesion();
	}

	public void persist(Cliente entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Cliente entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Cliente findById(Integer id) {
		Cliente cliente = (Cliente) sesion.getCurrentSession().get(Cliente.class, id);
		return cliente;
	}

	public void delete(Cliente entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Cliente cliente = findById(id);
		delete(cliente);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		List<Cliente> clientes = (List<Cliente>) sesion.getCurrentSession().createQuery("from Cliente").list();
		return clientes;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Cliente> entityList = findAll();
		for (Cliente entity : entityList) {
			delete(entity);
		}
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

}
