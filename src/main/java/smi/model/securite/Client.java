/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "CLIENT", catalog = "", schema = "SECURITE")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientPK clientPK;
    @Size(max = 10)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 40)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 40)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 60)
    @Column(name = "ADR_RES_1")
    private String adrRes1;
    @Size(max = 60)
    @Column(name = "ADR_RES_2")
    private String adrRes2;
    @Size(max = 30)
    @Column(name = "ADR_RES_3")
    private String adrRes3;
    @Size(max = 20)
    @Column(name = "TELEPHONE")
    private String telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "EMAIL")
    private String email;

    public Client() {
    }

    public Client(ClientPK clientPK) {
        this.clientPK = clientPK;
    }

    public Client(BigInteger typePiecePersonne, String noPiecePersonne) {
        this.clientPK = new ClientPK(typePiecePersonne, noPiecePersonne);
    }

    public ClientPK getClientPK() {
        return clientPK;
    }

    public void setClientPK(ClientPK clientPK) {
        this.clientPK = clientPK;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdrRes1() {
        return adrRes1;
    }

    public void setAdrRes1(String adrRes1) {
        this.adrRes1 = adrRes1;
    }

    public String getAdrRes2() {
        return adrRes2;
    }

    public void setAdrRes2(String adrRes2) {
        this.adrRes2 = adrRes2;
    }

    public String getAdrRes3() {
        return adrRes3;
    }

    public void setAdrRes3(String adrRes3) {
        this.adrRes3 = adrRes3;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientPK != null ? clientPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.clientPK == null && other.clientPK != null) || (this.clientPK != null && !this.clientPK.equals(other.clientPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.Client[ clientPK=" + clientPK + " ]";
    }
    
}
