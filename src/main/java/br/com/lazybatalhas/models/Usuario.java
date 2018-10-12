package br.com.lazybatalhas.models;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String sobreNome;
	
<<<<<<< HEAD
	private Login login = new Login();
=======
	 
>>>>>>> a496b60c6128f256c03084c408072f680998a2ad
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	
<<<<<<< HEAD
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	
=======
>>>>>>> a496b60c6128f256c03084c408072f680998a2ad

}
