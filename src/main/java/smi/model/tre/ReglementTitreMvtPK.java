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
public class ReglementTitreMvtPK implements Serializable {

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

    public ReglementTitreMvtPK() {
    }

    public ReglementTitreMvtPK(short codeProduitService, short codeOperation, int refOperation, short codeTitre, int numDom, Date dateDom) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
        this.refOperation = refOperation;
        this.codeTitre = codeTitre;
        this.numDom = numDom;
        this.dateDom = dateDom;
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
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        hash += (int) refOperation;
        hash += (int) codeTitre;
        hash += (int) numDom;
        hash += (dateDom != null ? dateDom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementTitreMvtPK)) {
            return false;
        }
        ReglementTitreMvtPK other = (ReglementTitreMvtPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if (this.codeOperation != other.codeOperation) {
            return false;
        }
        if (this.refOperation != other.refOperation) {
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
        return "smi.model.tre.ReglementTitreMvtPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + ", refOperation=" + refOperation + ", codeTitre=" + codeTitre + ", numDom=" + numDom + ", dateDom=" + dateDom + " ]";
    }
    
}
