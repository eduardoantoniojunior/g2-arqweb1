package br.edu.ifsp.g2.model;

import java.time.LocalDate;

public class Noticia {
	
	private static int lastId = 0;
	private String titulo;
	private String texto;
	private LocalDate dataPublicacao;
	private String nomeAutor;
	private int id;
	
	public Noticia() {
		this.id = Noticia.lastId++;
	}
	
	public Noticia(String titulo, String texto, LocalDate dataPublicacao, String nomeAutor) {
		this();
		setTitulo(titulo);
		setTexto(texto);
		setDataPublicacao(dataPublicacao);
		setNomeAutor(nomeAutor);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public int getId() {
		return id;
	}
}
