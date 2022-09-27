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
		String valorPeticion = peticion.getParameter("numeroPeticion");
		
		Long numeroPeticion;
		
		if (valorPeticion == "") {
			numeroPeticion = 0L;
		} else {
			numeroPeticion = Long.parseLong(valorPeticion);
		}
		numeroPeticion = numeroPeticion+1;
		valorPeticion = numeroPeticion.toString();
		
		peticion.setAttribute("numeroPeticion", valorPeticion);
		RequestDispatcher rqd = peticion.getRequestDispatcher("/jsp/contadorPeticiones.jsp");
		rqd.include(peticion, respuesta);
	}

}
