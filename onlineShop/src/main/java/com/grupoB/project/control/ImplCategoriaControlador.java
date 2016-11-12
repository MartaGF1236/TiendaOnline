package com.grupoB.project.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.grupoB.project.modelo.*;
import com.grupoB.project.DAO.*;
import com.grupoB.project.servicio.*;

/**
 * Servlet implementation class controladorMartaCategoria
 */
public class ImplCategoriaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CategoriaServicio catServ= new CategoriaServicio();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImplCategoriaControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacion;
		
        try {

            // Comprobamos el tipo de accion que se solicita
            operacion = request.getParameter("operacion");
            //hay que añadirlo en los jsps
            DAOPais op = new DAOPais();

            if (operacion.equals("alta")) {
                //ALTA
                op.Alta(recogerDatos(request));
                response.sendRedirect("paises?operacion=listado");
            } else if (operacion.equals("baja")) {
                // BAJA
                op.Baja(request.getParameter("cod"));
                response.sendRedirect("paises?operacion=listado");
            } else if (operacion.equals("detalle")) {
                // DETALLE
                request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
                RequestDispatcher view = request.getRequestDispatcher("/detalle.jsp");
                view.forward(request, response);
            } else if (operacion.equals("modificacion")) {
                // MODIFICACION
                request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
                RequestDispatcher view = request.getRequestDispatcher("/update.jsp");
                view.forward(request, response);
            } else if (operacion.equals("update")) {
                // UPDATE
                op.Update(recogerDatos(request));
                response.sendRedirect("paises?operacion=listado");
            } else if (operacion.equals("listado")) {
                // LISTADO
                request.setAttribute("paises", op.Listado());
                RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
                view.forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }
    }

	}

}**/

/**
public Pais recogerDatos(HttpServletRequest request) {
    Pais p = new Pais();
    p.setCode(request.getParameter("code"));
    p.setNombre(request.getParameter("nombre"));
    p.setContinente(request.getParameter("continente"));
    p.setRegion(request.getParameter("region"));
    p.setPoblacion(Integer.parseInt(request.getParameter("poblacion")));
    p.setCapital(Integer.parseInt(request.getParameter("capital")));
    return p;
}**/
}