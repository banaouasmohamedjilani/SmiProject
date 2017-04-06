/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

/**
 *
 * @author SMI
 */
public class AbnClient {
 private String login;
 private String codepds;
 private String dateDebut;
 private String dateFin;
  private String libelleOperation;

    public AbnClient() {
    }

    public AbnClient(String login, String codepds, String dateDebut, String dateFin, String libelleOperation) {
        this.login = login;
        this.codepds = codepds;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.libelleOperation = libelleOperation;
    }

    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCodepds() {
        return codepds;
    }

    public void setCodepds(String codepds) {
        this.codepds = codepds;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }
  
  
  
}
