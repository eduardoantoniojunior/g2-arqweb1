package br.edu.ifsp.g2.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifsp.g2.model.Noticia;

public class NoticiaDAO {
	
	private ArrayList<Noticia> noticias;
	private static NoticiaDAO instance;
	
	private NoticiaDAO() {
		this.noticias = new ArrayList<>();
        // alguns mocks :)
        noticias.add(new Noticia(
            "Exploração Espacial Comercial decola no Brasil",
            "Agência aeroespacial nacional anuncia novos contratos com startups de satélites privados.",
            LocalDate.of(2025, 1, 15),
            "Mariana Silva"
        ));
        noticias.add(new Noticia(
            "Feira de Tecnologia em São Paulo reúne mais de 200 expositores",
            "Evento traz inovações em IA, IoT e sustentabilidade até o fim do mês no Expo Center Norte.",
            LocalDate.of(2025, 2, 10),
            "Carlos Pereira"
        ));
        noticias.add(new Noticia(
            "Startup local lança app de finanças pessoais com foco em investimentos",
            "A FinTrack promete ajudar usuários a controlar gastos e projetar carteiras diversificadas.",
            LocalDate.of(2025, 3, 5),
            "Ana Costa"
        ));
        noticias.add(new Noticia(
            "Novo recorde de público no campeonato nacional de e-sports",
            "Final do torneio de jogos eletrônicos atraiu mais de 50 mil espectadores online.",
            LocalDate.of(2025, 4, 22),
            "Rafael Souza"
        ));		
	}
	
	public static NoticiaDAO getInstance() {
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
