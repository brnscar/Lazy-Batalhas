package br.com.lazybatalhas.models;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String sobreNome;
	
	 
	
	
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
	
	

}
