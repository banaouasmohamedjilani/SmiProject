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

/**
 *
 * @author Djo-Workstation
 */
@Embeddable
public class ReglementTitrePK implements Serializable {

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
    @Column(name = "CODE_TITRE")
    private short codeTitre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOM")
    private int numDom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;

    public ReglementTitrePK() {
    }

    public ReglementTitrePK(long numDossier, Date dateDossier, short codeTitre, int numDom, Date dateDom) {
        this.numDossier = numDossier;
        this.dateDossier = dateDossier;
        this.codeTitre = codeTitre;
        this.numDom = numDom;
        this.dateDom = dateDom;
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

    public short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public int getNumDom() {
        return numDom;
    }

    public void setNumDom(int numDom) {
        this.numDom = numDom;
    }

    public Date getDateDom() {
        return dateDom;
    }

    public void setDateDom(Date dateDom) {
        this.dateDom = dateDom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numDossier;
        hash += (dateDossier != null ? dateDossier.hashCode() : 0);
        hash += (int) codeTitre;
        hash += (int) numDom;
        hash += (dateDom != null ? dateDom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementTitrePK)) {
            return false;
        }
        ReglementTitrePK other = (ReglementTitrePK) object;
        if (this.numDossier != other.numDossier) {
            return false;
        }
        if ((this.dateDossier == null && other.dateDossier != null) || (this.dateDossier != null && !this.dateDossier.equals(other.dateDossier))) {
            return false;
        }
        if (this.codeTitre != other.codeTitre) {
            return false;
        }
        if (this.numDom != other.numDom) {
            return false;
        }
        if ((this.dateDom == null && other.dateDom != null) || (this.dateDom != null && !this.dateDom.equals(other.dateDom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.ReglementTitrePK[ numDossier=" + numDossier + ", dateDossier=" + dateDossier + ", codeTitre=" + codeTitre + ", numDom=" + numDom + ", dateDom=" + dateDom + " ]";
    }
    
}
