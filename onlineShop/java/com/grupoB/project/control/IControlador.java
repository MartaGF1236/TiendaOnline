package com.grupoB.project.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//La interfaz b�sica de un controlador tiene un solo m�todo para procesar la petici�n, 
//que recibe los objetos HttpServletRequest y HttpServletResponse y devuelve un String 
//con el nombre del archivo .jsp que mostrar� el resultado -vista- correspondiente. 
//Este nombre de archivo se lo pasaremos como par�metro al objeto RequestDispatcher para 
//redirigir el controlador a la vista.

public interface IControlador 
{

	String process(HttpServletRequest request, HttpServletResponse response);

}
