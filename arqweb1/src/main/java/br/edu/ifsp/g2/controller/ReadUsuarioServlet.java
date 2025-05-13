package br.edu.ifsp.g2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifsp.g2.dao.UsuarioDAO;

/**
 * Servlet implementation class ReadNoticiaServlet
 */
@WebServlet("/listar-usuario")
public class ReadUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO dao = UsuarioDAO.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReadUsuarioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		int id = -1;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (id != -1) {
			try {
				session.setAttribute("usuarioAtual", dao.getUsuario(id));
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("erro", "Usuário não encontrado");
				request.getRequestDispatcher("index.jsp").forward(request, response); //TODO: Definir para qual rota vamos madar
			}
		} else {
			session.setAttribute("usuarios", dao.getUsuarios());
		}
		request.getRequestDispatcher("index.jsp").forward(request, response); //TODO: Definir para qual rota vamos madar

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
