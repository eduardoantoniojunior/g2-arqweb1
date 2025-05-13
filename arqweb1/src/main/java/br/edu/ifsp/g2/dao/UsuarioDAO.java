package br.edu.ifsp.g2.dao;

import java.util.ArrayList;

import br.edu.ifsp.g2.model.Usuario;

public class UsuarioDAO {
	
	private ArrayList<Usuario> usuarios;
	private static UsuarioDAO instance;
	
	private UsuarioDAO() {
		this.usuarios = new ArrayList<>();
	}
	
	public static UsuarioDAO getInstance() {
		if (instance == null) {
			instance = new UsuarioDAO();
		}
		return instance;
	}
	
	public void addUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public Usuario getUsuario(int id) throws Exception{
		for(Usuario u : this.usuarios) {
			if(u.getId() == id) return u;
		}
		throw new Exception("Nenhum usuário encontrado!");
	}
	
	public void removeUsuario(int id) throws Exception{
		for(Usuario u : this.usuarios) {
			if(u.getId() == id) {
				this.usuarios.remove(u);
			}
		}
		throw new Exception("Nenhum usuário encontrado!");
	}
	
	
	public void updateUsuario(int id, String usuario, String senha, String nome, int idade) {
		for(Usuario u : this.usuarios) {
			if(u.getId() == id) {
				u.setUsuario(usuario);
				u.setSenha(senha);
				u.setNome(nome);
				u.setIdade(idade);
			}
		}
	}

}
