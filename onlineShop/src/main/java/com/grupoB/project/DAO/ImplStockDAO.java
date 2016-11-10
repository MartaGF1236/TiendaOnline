package com.grupoB.project.DAO;
import java.util.List;

import com.grupoB.project.modelo.*;
import com.grupoB.project.util.Sesion;
import com.grupoB.project.DAO.*;

public class ImplStockDAO implements I_DAO<Stock,Integer> {
	private Sesion sesion;

	public ImplStockDAO () {
		sesion=new Sesion();
	}

	public void persist(Stock entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Stock entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Stock findById(Integer id) {
		Stock stock = (Stock) sesion.getCurrentSession().get(Stock.class, id);
		return stock;
	}

	public void delete(Stock entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Stock stock = findById(id);
		delete(stock);
	}

	@SuppressWarnings("unchecked")
	public List<Stock> findAll() {
		List<Stock> stocks= (List<Stock>) sesion.getCurrentSession().createQuery("from Stock").list();
		return stocks;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Stock> entityList = findAll();
		for (Stock entity : entityList) {
			delete(entity);
		}
	}
}