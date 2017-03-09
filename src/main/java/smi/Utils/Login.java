/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.Utils;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;


import smi.Utils.SessionUtils;
import smi.controller.restconsume.seccontrollerrest;
import smi.model.securite.Client;

@ManagedBean
@SessionScoped
public class Login implements Serializable {

	private static final long serialVersionUID = 1094801825228386363L;
	@ManagedProperty(value="#{pwd}")
	private String pwd;
	private String msg;
        @ManagedProperty(value="#{user}")
	private String user;
        private Client c;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Client getC() {
        return c;
    }

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

    public void setC(Client c) {
        this.c = c;
    }

	//validate login
	public String validateUsernamePassword() {
		boolean valid = seccontrollerrest.validate(user, pwd);
		if (valid) {
			clientInfo();
			return "Acceuil";
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							"Please enter correct username and Password"));
			return "login";
		}
	}

	//logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login.xhtml";
	}
        private Client cl = null;
        
        public Client clientInfo(){
            HttpSession session = SessionUtils.getSession();
            cl = (Client)session.getAttribute("user");
            System.out.print(cl.getNom()+"aaaa");
        return cl;
        }

    public Client getCl() {
        return cl;
    }

    public void setCl(Client cl) {
        this.cl = cl;
    }
        
        
        
}
