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
public class TitreBpPK implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TITRE_BP")
    private short codeTitreBp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOM_BP")
    private int numDomBp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOM_BP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDomBp;

    public TitreBpPK() {
    }

    public TitreBpPK(long numDossier, Date dateDossier, String typeDossier, short codeTitreBp, int numDomBp, Date dateDomBp) {
        this.numDossier = numDossier;
        this.dateDossier = dateDossier;
        this.typeDossier = typeDossier;
        this.codeTitreBp = codeTitreBp;
        this.numDomBp = numDomBp;
        this.dateDomBp = dateDomBp;
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

    public short getCodeTitreBp() {
        return codeTitreBp;
    }

    public void setCodeTitreBp(short codeTitreBp) {
        this.codeTitreBp = codeTitreBp;
    }

    public int getNumDomBp() {
        return numDomBp;
    }

    public void setNumDomBp(int numDomBp) {
        this.numDomBp = numDomBp;
    }

    public Date getDateDomBp() {
        return dateDomBp;
    }

    public void setDateDomBp(Date dateDomBp) {
        this.dateDomBp = dateDomBp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numDossier;
        hash += (dateDossier != null ? dateDossier.hashCode() : 0);
        hash += (typeDossier != null ? typeDossier.hashCode() : 0);
        hash += (int) codeTitreBp;
        hash += (int) numDomBp;
        hash += (dateDomBp != null ? dateDomBp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitreBpPK)) {
            return false;
        }
        TitreBpPK other = (TitreBpPK) object;
        if (this.numDossier != other.numDossier) {
            return false;
        }
        if ((this.dateDossier == null && other.dateDossier != null) || (this.dateDossier != null && !this.dateDossier.equals(other.dateDossier))) {
            return false;
        }
        if ((this.typeDossier == null && other.typeDossier != null) || (this.typeDossier != null && !this.typeDossier.equals(other.typeDossier))) {
            return false;
        }
        if (this.codeTitreBp != other.codeTitreBp) {
            return false;
        }
        if (this.numDomBp != other.numDomBp) {
            return false;
        }
        if ((this.dateDomBp == null && other.dateDomBp != null) || (this.dateDomBp != null && !this.dateDomBp.equals(other.dateDomBp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.TitreBpPK[ numDossier=" + numDossier + ", dateDossier=" + dateDossier + ", typeDossier=" + typeDossier + ", codeTitreBp=" + codeTitreBp + ", numDomBp=" + numDomBp + ", dateDomBp=" + dateDomBp + " ]";
    }
    
}
