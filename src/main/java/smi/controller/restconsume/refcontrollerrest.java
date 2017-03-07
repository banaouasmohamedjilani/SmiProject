package smi.controller.restconsume;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import smi.model.securite.Client;

public class refcontrollerrest {
   public static boolean validate (String login , String pwd)
{ 
    try{
        ResteasyClient clients = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = clients.target("http://169.254.223.24:7258/STB_Serveur/sec/getclientlogin")
                .queryParam("login",login);
       Client c  = target.request(MediaType.APPLICATION_JSON).get(Client.class);
       System.out.print(c.getClientPK().getTypePiecePersonne()+"  " +c.getPassword());
    if (c != null )
    {  System.out.println("Login success "+c.toString());
        return true;
   
    
    }}
    catch (Exception ex){
        
       System.out.print("login "+login +"and "+pwd);
        System.out.println("Login error "+ex.getMessage());
        return false;
    }
    
    return false;
 }
}
