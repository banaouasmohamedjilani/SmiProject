/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.domi;

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
public class ImageDetailPDepotPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_RBQ")
    private int numRbq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_CONTRAT")
    private int refContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONTRAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNITE_CONTRAT")
    private short uniteContrat;

    public ImageDetailPDepotPK() {
    }

    public ImageDetailPDepotPK(int numRbq, int refContrat, Date dateContrat, short uniteContrat) {
        this.numRbq = numRbq;
        this.refContrat = refContrat;
        this.dateContrat = dateContrat;
        this.uniteContrat = uniteContrat;
    }

    public int getNumRbq() {
        return numRbq;
    }

    public void setNumRbq(int numRbq) {
        this.numRbq = numRbq;
    }

    public int getRefContrat() {
        return refContrat;
    }

    public void setRefContrat(int refContrat) {
        this.refContrat = refContrat;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    public short getUniteContrat() {
        return uniteContrat;
    }

    public void setUniteContrat(short uniteContrat) {
        this.uniteContrat = uniteContrat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numRbq;
        hash += (int) refContrat;
        hash += (dateContrat != null ? dateContrat.hashCode() : 0);
        hash += (int) uniteContrat;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageDetailPDepotPK)) {
            return false;
        }
        ImageDetailPDepotPK other = (ImageDetailPDepotPK) object;
        if (this.numRbq != other.numRbq) {
            return false;
        }
        if (this.refContrat != other.refContrat) {
            return false;
        }
        if ((this.dateContrat == null && other.dateContrat != null) || (this.dateContrat != null && !this.dateContrat.equals(other.dateContrat))) {
            return false;
        }
        if (this.uniteContrat != other.uniteContrat) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.ImageDetailPDepotPK[ numRbq=" + numRbq + ", refContrat=" + refContrat + ", dateContrat=" + dateContrat + ", uniteContrat=" + uniteContrat + " ]";
    }
    
}
