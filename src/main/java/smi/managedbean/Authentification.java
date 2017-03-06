/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import smi.controller.restconsume.refcontrollerrest;
import smi.model.securite.Client;

/**
 *
 * @author Djo-Workstation
 */
@ManagedBean
@RequestScoped
public class Authentification {
    private Client client;
    private refcontrollerrest clientrest;
    private String login;
    private String password;

     public Client getClientLogin(String login) {
       String url = "http://169.254.223.24:7258/STB_Serveur";
        ResteasyClient clients = new ResteasyClientBuilder().build();
        GenericType<Client> list = new GenericType<Client>() {
        };
//        String user = getUser();
        ResteasyWebTarget target = clients.target(url+"sec/getclientlogin")
                .queryParam("login",login);

        Client c  = target.request(MediaType.APPLICATION_JSON).get(list);
//        String password = client.getPassword();
//        
//        if ((client!=null)&(password == pwd ))
//                return client;
//            
//            
System.out.println("le client est "+c);
        return c;
    }
    
    
      public String logon(){
          System.out.println("aaaaa");
        Client C = getClientLogin(login);
        if(C != null)
        return "Acceuil.xhtml";
    return null;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    
    public Client getClient() {
        return client;
    }

    public refcontrollerrest getClientrest() {
        return clientrest;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setClientrest(refcontrollerrest clientrest) {
        this.clientrest = clientrest;
    }
    
    
}
