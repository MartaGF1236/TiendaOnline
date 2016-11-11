package com.grupoB.project.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private Map<String, IController> controllers = new HashMap<String, IController>();
       
    
	//Constructor vacio
    public FrontServlet() 
    {
       
    }

    //sobreescribir metodo init()
    public void init() throws ServletException 
	{

		super.init();

		//Coloacar el mapeado de los servidores y la insancia del controlador
		//tantos como controladores tenga...
		//controllers.put("/newVisitor.do", new NewVisitorController());
		//controllers.put("/searchVisitor.do", new SearchVisitorController());
		//controllers.put("/logout.do", new LogoutController());
	}
	
    
    //metodo doProcess
    private void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
    {
		// Comprueba la accion a realizar
		String action = request.getServletPath();
		// Ejecuta el controlador a partir de la accion
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
