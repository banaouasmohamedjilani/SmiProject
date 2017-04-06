//package smi.controller.restconsume;
//
//import javax.servlet.http.HttpSession;
//import javax.ws.rs.core.GenericType;
//import javax.ws.rs.core.MediaType;
//import org.jboss.resteasy.client.jaxrs.ResteasyClient;
//import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
//import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
//import smi.Utils.SessionUtils;
//import smi.model.securite.Client;
//
//public class seccontrollerrest {
//    
//    
//   public static boolean validate (String login , String pwd)
//{ 
//    try{
//        ResteasyClient clients = new ResteasyClientBuilder().build();
//        ResteasyWebTarget target = clients.target("http://localhost:7258/STB_Serveur/sec/getclientlogin")
//                .queryParam("login",login);
//       Client c  = target.request(MediaType.APPLICATION_JSON).get(Client.class);
//    if ((c != null )&&(c.getPassword().equals(pwd)))
//    {  System.out.println("Login success "+c.toString());
//    HttpSession session = SessionUtils.getSession();
//			session.setAttribute("user",c.getNom());
//        return true;
//   
//    
//    }}
//    catch (Exception ex){
//        
//       System.out.print("login "+login +"and "+pwd);
//        System.out.println("Login error "+ex.getMessage());
//        return false;
//    }
//    
//    return false;
// }
//   
//}
