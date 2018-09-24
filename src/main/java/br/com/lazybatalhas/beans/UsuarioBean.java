package br.com.lazybatalhas.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.lazybatalhas.models.Usuario;

@Named
@RequestScoped
public class UsuarioBean {
	
	//@Inject
	//private FacesContext context; 
	
	private Usuario user = new Usuario();
	
	@Transactional
	public String salvar() {
		
		System.out.println(user.getNome());
		System.out.println(user.getSobreNome());
		
		//context.getExternalContext().getFlash().setKeepMessages(true);
		//context.addMessage(null, new FacesMessage("Usuario incluido com sucesso!"));
		
		return "/admin/user/lista?faces-redirect=true";
	}
	
	
	public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }


	public Usuario getUser() {
		return user;
	}


	public void setUser(Usuario user) {
		this.user = user;
	}
	
}
