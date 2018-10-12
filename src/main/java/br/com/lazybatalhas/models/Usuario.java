package br.com.lazybatalhas.models;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {

	@NotBlank
	private String nome;

	@NotBlank
	private String sobreNome;

	private Login login = new Login();

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

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
