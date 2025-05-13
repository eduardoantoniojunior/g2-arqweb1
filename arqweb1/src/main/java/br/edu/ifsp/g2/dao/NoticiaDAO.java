package br.edu.ifsp.g2.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifsp.g2.model.Noticia;

public class NoticiaDAO {
	
	private ArrayList<Noticia> noticias;
	private static NoticiaDAO instance;
	
	private NoticiaDAO() {
		this.noticias = new ArrayList<>();
	}
	
	public NoticiaDAO getInstance() {
		if (instance == null) {
			instance = new NoticiaDAO();
		}
		return instance;
	}
	
	public void addNoticia(Noticia Noticia) {
		this.noticias.add(Noticia);
	}
	
	public ArrayList<Noticia> getnoticias(){
		return this.noticias;
	}
	
	public Noticia getNoticia(int id) throws Exception{
		for(Noticia n : this.noticias) {
			if(n.getId() == id) return n;
		}
		throw new Exception("Nenhum usuário encontrado!");
	}
	
	public void removeNoticia(int id) throws Exception{
		for(Noticia n : this.noticias) {
			if(n.getId() == id) {
				this.noticias.remove(n);
			}
		}
		throw new Exception("Nenhum usuário encontrado!");
	}
	
	
	public void updateNoticia(int id, String titulo, String texto, LocalDate dataPublicacao, String nomeAutor) {
		for(Noticia n : this.noticias) {
			if(n.getId() == id) {
				n.setTitulo(titulo);
				n.setTexto(texto);
				n.setDataPublicacao(dataPublicacao);
				n.setNomeAutor(nomeAutor);
			}
		}
	}
}
