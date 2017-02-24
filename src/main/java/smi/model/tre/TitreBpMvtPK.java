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
public class TitreBpMvtPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION")
    private short codeOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_OPERATION")
    private int refOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
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

    public TitreBpMvtPK() {
    }

    public TitreBpMvtPK(short codeProduitService, short codeOperation, int refOperation, Date dateOperation, short codeTitreBp, int numDomBp, Date dateDomBp) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
        this.refOperation = refOperation;
        this.dateOperation = dateOperation;
        this.codeTitreBp = codeTitreBp;
        this.numDomBp = numDomBp;
        this.dateDomBp = dateDomBp;
    }

    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public int getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(int refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
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
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        hash += (int) refOperation;
        hash += (dateOperation != null ? dateOperation.hashCode() : 0);
        hash += (int) codeTitreBp;
        hash += (int) numDomBp;
        hash += (dateDomBp != null ? dateDomBp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitreBpMvtPK)) {
            return false;
        }
        TitreBpMvtPK other = (TitreBpMvtPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if (this.codeOperation != other.codeOperation) {
            return false;
        }
        if (this.refOperation != other.refOperation) {
            return false;
        }
        if ((this.dateOperation == null && other.dateOperation != null) || (this.dateOperation != null && !this.dateOperation.equals(other.dateOperation))) {
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
        return "smi.model.tre.TitreBpMvtPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + ", refOperation=" + refOperation + ", dateOperation=" + dateOperation + ", codeTitreBp=" + codeTitreBp + ", numDomBp=" + numDomBp + ", dateDomBp=" + dateDomBp + " ]";
    }
    
}
