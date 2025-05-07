package br.edu.ifsp.g2.model;

import java.time.LocalDate;

public class Noticia {
	
	private String titulo;
	private String texto;
	private LocalDate dataPublicacao;
	private String nomeAutor;
	
	//O nome do autor não é necessário por questões de tema da notícia e segurança do jornalista
	
	public Noticia(String titulo, String texto, LocalDate dataPublicacao) {
		setTitulo(titulo);
		setTexto(texto);
		setDataPublicacao(dataPublicacao);
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
}
