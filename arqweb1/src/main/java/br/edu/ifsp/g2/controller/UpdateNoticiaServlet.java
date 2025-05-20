package br.edu.ifsp.g2.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import br.edu.ifsp.g2.dao.NoticiaDAO;
import br.edu.ifsp.g2.model.Noticia;

@WebServlet("/editar-noticia")
public class UpdateNoticiaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private NoticiaDAO dao = NoticiaDAO.getInstance();

    public UpdateNoticiaServlet() {
        super();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");

            String idParam      = request.getParameter("id");
            String titulo       = request.getParameter("titulo");
            String texto        = request.getParameter("texto");
            String dataPubStr   = request.getParameter("dataPublicacao");
            String nomeAutor    = request.getParameter("nomeAutor");

            if (idParam == null || idParam.isEmpty() ||
                titulo == null || titulo.isEmpty() ||
                texto  == null || texto.isEmpty()  ||
                dataPubStr == null || dataPubStr.isEmpty() ||
                nomeAutor  == null || nomeAutor.isEmpty()) {
                throw new RuntimeException("Todos os campos são obrigatórios.");
            }

            int id = Integer.parseInt(idParam);
            LocalDate dataPublicacao = LocalDate.parse(dataPubStr);

            dao.updateNoticia(id, titulo, texto, dataPublicacao, nomeAutor);

            response.sendRedirect(request.getContextPath() + "/listar-noticia");
            return;
        }
        catch (NumberFormatException | DateTimeParseException ex) {
            request.setAttribute("erro", "Parâmetro inválido: " + ex.getMessage());
        }
        catch (RuntimeException ex) {
            request.setAttribute("erro", ex.getMessage());
        }
        catch (Exception ex) {
            request.setAttribute("erro", "Erro ao atualizar notícia: " + ex.getMessage());
        }

        request.getRequestDispatcher("changeNoticia.jsp").forward(request, response);
    }
}
