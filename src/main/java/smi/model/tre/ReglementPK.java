/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.tre;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Embeddable
public class ReglementPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER")
    private long numDossier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;

    public ReglementPK() {
    }

    public ReglementPK(long numDossier, Date dateDossier, String typeDossier) {
        this.numDossier = numDossier;
        this.dateDossier = dateDossier;
        this.typeDossier = typeDossier;
    }

    public long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(long numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numDossier;
        hash += (dateDossier != null ? dateDossier.hashCode() : 0);
        hash += (typeDossier != null ? typeDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementPK)) {
            return false;
        }
        ReglementPK other = (ReglementPK) object;
        if (this.numDossier != other.numDossier) {
            return false;
        }
        if ((this.dateDossier == null && other.dateDossier != null) || (this.dateDossier != null && !this.dateDossier.equals(other.dateDossier))) {
            return false;
        }
        if ((this.typeDossier == null && other.typeDossier != null) || (this.typeDossier != null && !this.typeDossier.equals(other.typeDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.ReglementPK[ numDossier=" + numDossier + ", dateDossier=" + dateDossier + ", typeDossier=" + typeDossier + " ]";
    }
    
}
