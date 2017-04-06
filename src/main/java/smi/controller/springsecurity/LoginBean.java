package smi.controller.springsecurity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
@ManagedBean
@RequestScoped
@Scope("request")
public class LoginBean {
	Log log = LogFactory.getLog(LoginBean.class);

	@Autowired
	private AuthenticationManager authenticationManager;

	@Setter
	@Getter
	private String username;

	@Setter
	@Getter
	private String password;

	public LoginBean() {
	}

	public String login() {
		try {
	            Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(
							this.username, this.password));
                      System.out.println("user "+this.username);
                      System.out.println("pass "+this.password);
                      System.out.println(authentication.getAuthorities());
			SecurityContextHolder.getContext()
					.setAuthentication(authentication);

		} catch (AuthenticationException ex) {
                    System.out.println("user "+this.username);
                      System.out.println("pass "+this.password);
			log.equals(ex.getMessage());
			Util.addMessage("Login Failed: " + ex.getMessage());
			return "";
		}

		return Util.getSavedUrl() + "?faces-redirect=true";
	}
}
