package com.grupoB.project.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImplCategoriaControlador")


//El �nico servlet de la aplicaci�n es el FrontServlet, que se encarga de recoger 
//la acci�n realizada por el usuario y pasar el control al Controller adecuado.
public class FrontServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private Map<String, IControlador> controllers = new HashMap<String, IControlador>();
       
    
	//Constructor vacio
    public FrontServlet() 
    {
       
    }

    //sobreescribir metodo init()
    public void init() throws ServletException 
	{

		super.init();

		//Colocar el mapeado de los servidores y la insancia del controlador
		controllers.put("/categoriasctrl", new ImplCategoriaControlador());
		//coloca el objeto que implementa la interfaz IControlador
	}
	
    
    //metodo doProcess
    private void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
    {
		// Comprueba la accion a realizar.
    	//getServletPath() devuelve lo que se escribe en el jsp en action.
    	//Returns: a String containing the name or path of the servlet being called, as specified in the request URL, decoded, or an empty string if the servlet used to process the request is matched using the "/*" pattern.
        //action va a ser=ImplCategoriaControlador
		String action = request.getServletPath();
		// Ejecuta el controlador a partir de la accion
		//process es un método de ImplCategoriaControlador, no del Map ni del FrontServlet
		//process devuelve ("/listado.jsp")(está sin hacer)
		String view = controllers.get(action).process(request, response);
		// Crea la vista que viene a continuacion
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		// Redirige la peticion
		dispatcher.forward(request, response);
	}

    //metodo doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doProcess(request, response);
	}


	//metodo doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		doProcess(request, response);
	}
	
	
	

}
