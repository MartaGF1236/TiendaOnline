package com.grupoB.project.servicio;

import java.util.List;
import com.grupoB.project.DAO.ImplCategoriaDAO;
import com.grupoB.project.modelo.Categoria;


public class CategoriaServicio 
{
	private static ImplCategoriaDAO categoriaDao;

	public CategoriaServicio() 
	{
		categoriaDao = new ImplCategoriaDAO();
	}

	public void persist(Categoria categoria) 
	{
		categoriaDao.getSesion().openCurrentSessionwithTransaction();
		categoriaDao.persist(categoria);
		categoriaDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public void update(Categoria categoria) 
	{
		categoriaDao.getSesion().openCurrentSessionwithTransaction();
		categoriaDao.update(categoria);
		categoriaDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public Categoria findById(Integer id) 
	{
		categoriaDao.getSesion().openCurrentSession();
		Categoria book = categoriaDao.findById(id);
		categoriaDao.getSesion().closeCurrentSession();
		return book;
	}

	public void delete(Integer id) 
	{
		categoriaDao.getSesion().openCurrentSessionwithTransaction();
		Categoria book = categoriaDao.findById(id);
		categoriaDao.delete(book);
		categoriaDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public List<Categoria> findAll() 
	{
		categoriaDao.getSesion().openCurrentSession();
		List<Categoria> books = categoriaDao.findAll();
		categoriaDao.getSesion().closeCurrentSession();
		return books;
	}

	public void deleteAll() 
	{
		categoriaDao.getSesion().openCurrentSessionwithTransaction();
		categoriaDao.deleteAll();
		categoriaDao.getSesion().closeCurrentSessionwithTransaction();
	}

	public ImplCategoriaDAO categoriaDao() 
	{
		return categoriaDao;
	}
}
