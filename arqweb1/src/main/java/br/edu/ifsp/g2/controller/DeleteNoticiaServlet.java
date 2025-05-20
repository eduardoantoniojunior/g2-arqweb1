package br.edu.ifsp.g2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import br.edu.ifsp.g2.dao.NoticiaDAO;

@WebServlet("/excluir-noticia")
public class DeleteNoticiaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private NoticiaDAO dao = NoticiaDAO.getInstance();

    public DeleteNoticiaServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String errorMessage = "";
        String idParam = request.getParameter("id");

        try {
            if (idParam == null || idParam.isEmpty()) {
                throw new IllegalArgumentException("ID da notícia não fornecido.");
            }
            int id = Integer.parseInt(idParam);
            dao.removeNoticia(id);
            response.sendRedirect(request.getContextPath() + "/listar-noticia");
            return;
        }
        catch (NumberFormatException ex) {
            errorMessage = "ID inválido. Deve ser um número inteiro.";
        }
        catch (Exception ex) {
            errorMessage = "Erro ao excluir notícia: " + ex.getMessage();
        }

        request.setAttribute("erro", errorMessage);
        request.getRequestDispatcher("index.jsp")
               .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
