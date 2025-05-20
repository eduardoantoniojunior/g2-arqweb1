package br.edu.ifsp.g2.dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class ImagensDAO {
	
	private static final String PATH = "img";
	private static ImagensDAO instance;
	
	private ImagensDAO() throws IOException {
		Path diretorio = Paths.get(PATH);
		if(!Files.exists(diretorio)) {
			Files.createDirectories(diretorio);
		}
	}
	
	public static ImagensDAO getInstance() throws IOException {
		if(instance == null) instance = new ImagensDAO();
		return instance;
	}
	
	public BufferedImage carregarImagem(String nomeImagem) throws IOException {
		File imagem = new File(PATH + File.separator + nomeImagem);
		return ImageIO.read(imagem);
	}
	
	public void salvarImagem(String nomeImagem, BufferedImage imagem) throws IOException {
		File arquivoSaida = new File(PATH + File.separator + nomeImagem);
		ImageIO.write(imagem, nomeImagem, arquivoSaida);
	}
	
	public boolean removeImagem(String nomeImagem) {
		File imagem = new File(PATH + nomeImagem);
		return imagem.delete();
	}
	
}
