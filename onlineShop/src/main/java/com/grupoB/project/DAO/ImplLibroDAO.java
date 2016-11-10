package com.grupoB.project.DAO;
import java.util.List;

import com.grupoB.project.modelo.*;
import com.grupoB.project.util.Sesion;
import com.grupoB.project.DAO.*;

public class ImplLibroDAO implements I_DAO<Libro,Integer> {
	private Sesion sesion;

	public ImplLibroDAO () {
		sesion=new Sesion();
	}

	public void persist(Libro entity) {
	sesion.getCurrentSession().save(entity);
	}
	
	public void update(Libro entity) {
		
		sesion.getCurrentSession().update(entity);
	}

	public Libro findById(Integer id) {
		Libro libro = (Libro) sesion.getCurrentSession().get(Libro.class, id);
		return libro;
	}

	public void delete(Libro entity) {
		sesion.getCurrentSession().delete(entity);
	}

	public void deleteById(Integer id) {
		Libro libro = findById(id);
		delete(libro);
	}

	@SuppressWarnings("unchecked")
	public List<Libro> findAll() {
		List<Libro> libros = (List<Libro>) sesion.getCurrentSession().createQuery("from Libro").list();
		return libros;
	}

	//usa el método de arriba
	public void deleteAll() {
		List<Libro> entityList = findAll();
		for (Libro entity : entityList) {
			delete(entity);
		}
	}

}
