/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.controller.springsecurity;

/**
 *
 * @author SMI
 */
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.stereotype.Service;
import smi.model.securite.Client;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@Service
public class myUserDetailService implements UserDetailsService {

    String url = "http://localhost:7258/SMI_Server";

    @SuppressWarnings("deprecation")
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException {
        System.out.println("Getting access details from User dao !!");

// Ideally it should be fetched from database and populated instance of
// #org.springframework.security.core.userdetails.User should be returned from this method
        ResteasyClient client = new ResteasyClientBuilder().build();

        ResteasyWebTarget targets = client.target(url + "/sec/getclientlogin").queryParam("login", username);
        Client c = targets.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Client.class);
//if (targets.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get().getStatus() == 200)
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        UserDetails user = new User(c.getClientPK().getNoPiecePersonne(), c.getPassword(), true, true, true, true, authorities);
        System.out.println("sssssss " + user);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        sessionMap.put("user", user.getUsername());
        return user;
    }
}
