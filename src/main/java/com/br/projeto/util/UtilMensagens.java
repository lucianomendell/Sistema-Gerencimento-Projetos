package com.br.projeto.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UtilMensagens {
	
	public static void mensagemErro(String mensagem) {

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, "");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

	public static void mensagemInformacao(String mensagem) {

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, "");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

}
