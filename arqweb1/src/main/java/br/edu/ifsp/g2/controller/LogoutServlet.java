package br.edu.ifsp.g2.controller;

import java.io.IOException;
import java.util.NoSuchElementException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifsp.g2.dao.UsuarioDAO;
import br.edu.ifsp.g2.model.Usuario;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("usuarioLogado", null);
		session.invalidate();
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}

}
