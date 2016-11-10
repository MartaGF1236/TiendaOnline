
package com.grupoB.project.DAO;
import java.util.List;

import com.grupoB.project.modelo.*;
import com.grupoB.project.util.Sesion;
import com.grupoB.project.DAO.*;

public class ImplEditorialDAO implements I_DAO<Editorial,Integer> {
	private Sesion sesion;

	public ImplEditorialDAO () {
		sesion=new Sesion();
	}

	public void persist(Editorial entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Editorial entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Editorial findById(Integer id) {
		Editorial editorial = (Editorial) sesion.getCurrentSession().get(Editorial.class, id);
		return editorial;
	}

	public void delete(Editorial entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Editorial editorial = findById(id);
		delete(editorial);
	}

	@SuppressWarnings("unchecked")
	public List<Editorial> findAll() {
		List<Editorial> editoriales = (List<Editorial>) sesion.getCurrentSession().createQuery("from Editorial").list();
		return editoriales;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Editorial> entityList = findAll();
		for (Editorial entity : entityList) {
			delete(entity);
		}
	}

}
