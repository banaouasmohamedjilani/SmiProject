/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.controller.restconsume;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import smi.model.securite.Client;

/**
 *
 * @author Djo-Workstation
 */
public class refcontrollerrest {
    private String url = "http://169.254.223.24:7258/STB_Serveur";


    
    public Client getClientLogin(String login,String pwd) {
        Client client= new Client();
        ResteasyClient clients = new ResteasyClientBuilder().build();
        GenericType<Client> list = new GenericType<Client>() {
        };
//        String user = getUser();
        ResteasyWebTarget target = clients.target(url+"sec/getclientlogin")
                .queryParam("login", login);

        client = target.request(MediaType.APPLICATION_JSON).get(list);
//        String password = client.getPassword();
//        
//        if ((client!=null)&(password == pwd ))
//                return client;
//            
//            

        return client;
    }
}
