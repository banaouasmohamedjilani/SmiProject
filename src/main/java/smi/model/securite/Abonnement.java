/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "ABONNEMENT", catalog = "", schema = "SECURITE")
@NamedQueries({
    @NamedQuery(name = "Abonnement.findAll", query = "SELECT a FROM Abonnement a")})
public class Abonnement implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AbonnementPK abonnementPK;
    @Column(name = "DATE_DEBUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    public Abonnement() {
    }

    public Abonnement(AbonnementPK abonnementPK) {
        this.abonnementPK = abonnementPK;
    }

    public Abonnement(short codeProduitService, String noPiecePersonne) {
        this.abonnementPK = new AbonnementPK(codeProduitService, noPiecePersonne);
    }

    public AbonnementPK getAbonnementPK() {
        return abonnementPK;
    }

    public void setAbonnementPK(AbonnementPK abonnementPK) {
        this.abonnementPK = abonnementPK;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abonnementPK != null ? abonnementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abonnement)) {
            return false;
        }
        Abonnement other = (Abonnement) object;
        if ((this.abonnementPK == null && other.abonnementPK != null) || (this.abonnementPK != null && !this.abonnementPK.equals(other.abonnementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.Abonnement[ abonnementPK=" + abonnementPK + " ]";
    }
    
}
