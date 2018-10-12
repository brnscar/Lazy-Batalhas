package br.com.lazybatalhas.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
<<<<<<< HEAD
=======
import javax.inject.Inject;
>>>>>>> a496b60c6128f256c03084c408072f680998a2ad
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
		
<<<<<<< HEAD
		return "/admin/user/form?faces-redirect=true";
	}

	@Transactional
	public String cadastrar() {
		
		System.out.println(user.getLogin().getEmail());
		System.out.println(user.getLogin().getSenha());
		
		//context.getExternalContext().getFlash().setKeepMessages(true);
		//context.addMessage(null, new FacesMessage("Usuario incluido com sucesso!"));
		
		return "/admin/index?faces-redirect=true";
=======
		return "/admin/user/lista?faces-redirect=true";
>>>>>>> a496b60c6128f256c03084c408072f680998a2ad
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
