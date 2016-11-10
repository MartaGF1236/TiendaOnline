package com.grupoB.project.DAO;
import java.util.List;

import com.grupoB.project.modelo.*;
import com.grupoB.project.DAO.*;

public class ImplPedidoDAO implements I_DAO<Pedido,Integer> {
	private Sesion sesion;

	public ImplPedidoDAO () {
		sesion=new Sesion();
	}

	public void persist(Pedido entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Pedido entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Pedido findById(Integer id) {
		Pedido pedido = (Pedido) sesion.getCurrentSession().get(Pedido.class, id);
		return pedido;
	}

	public void delete(Pedido entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Pedido pedido = findById(id);
		delete(pedido);
	}

	@SuppressWarnings("unchecked")
	public List<Pedido> findAll() {
		List<Pedido> pedidos = (List<Pedido>) sesion.getCurrentSession().createQuery("from Pedido").list();
		return pedidos;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Pedido> entityList = findAll();
		for (Pedido entity : entityList) {
			delete(entity);
		}
	}

}
