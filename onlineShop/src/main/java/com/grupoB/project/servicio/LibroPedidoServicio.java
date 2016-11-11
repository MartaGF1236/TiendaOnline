package com.grupoB.project.servicio;

import java.util.List;

import com.grupoB.project.DAO.ImplLibroPedidoDAO;
import com.grupoB.project.modelo.LibroPedido;

public class LibroPedidoPedidoServicio {
	private static ImplLibroPedidoDAO libroPedidoDao;

	public LibroPedidoServicio() {
		libroPedidoDao = new ImplLibroPedidoDAO();
	}

	public void persist(LibroPedido libroPedido) {
		libroPedidoDao.openCurrentSessionwithTransaction();
		libroPedidoDao.persist(libroPedido);
		libroPedidoDao.closeCurrentSessionwithTransaction();
	}

	public void update(LibroPedido libroPedido) {
		libroPedidoDao.openCurrentSessionwithTransaction();
		libroPedidoDao.update(libroPedido);
		libroPedidoDao.closeCurrentSessionwithTransaction();
	}

	public LibroPedido findById(String id) {
		libroPedidoDao.openCurrentSession();
		LibroPedido book = libroPedidoDao.findById(id);
		libroPedidoDao.closeCurrentSession();
		return book;
	}

	public void delete(String id) {
		libroPedidoDao.openCurrentSessionwithTransaction();
		LibroPedido book = libroPedidoDao.findById(id);
		libroPedidoDao.delete(book);
		libroPedidoDao.closeCurrentSessionwithTransaction();
	}

	public List<LibroPedido> findAll() {
		libroPedidoDao.openCurrentSession();
		List<LibroPedido> books = libroPedidoDao.findAll();
		libroPedidoDao.closeCurrentSession();
		return books;
	}

	public void deleteAll() {
		libroPedidoDao.openCurrentSessionwithTransaction();
		libroPedidoDao.deleteAll();
		libroPedidoDao.closeCurrentSessionwithTransaction();
	}

	public ImplLibroPedidoDAO libroPedidoDao() {
		return libroPedidoDao;
	}
}
