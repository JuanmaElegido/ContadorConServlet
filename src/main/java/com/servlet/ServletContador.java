package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContador
 */
@WebServlet(name = "contadorPeticiones", description = "Contador de peticiones", urlPatterns = { "/contadorPeticiones" })
public class ServletContador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		Object valorPeticion = peticion.getSession().getAttribute("numeroPeticion");
		
		Long numeroPeticion;
		
		if (valorPeticion == null) {
			numeroPeticion = 1L;
			valorPeticion = numeroPeticion.toString();
			peticion.getSession().setAttribute("numeroPeticion", valorPeticion);
		} else {
			numeroPeticion = Long.parseUnsignedLong((String) valorPeticion);
			numeroPeticion = numeroPeticion+1;
			valorPeticion = numeroPeticion.toString();
			peticion.getSession().setAttribute("numeroPeticion", valorPeticion);
		}
		
		RequestDispatcher rqd = peticion.getRequestDispatcher("/jsp/contadorPeticiones.jsp");
		rqd.include(peticion, respuesta);
	}

}
