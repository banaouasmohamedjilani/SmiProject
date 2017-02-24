/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.domi;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "AVOIR_TITRE", catalog = "", schema = "DOMI")
@NamedQueries({
    @NamedQuery(name = "AvoirTitre.findAll", query = "SELECT a FROM AvoirTitre a")})
public class AvoirTitre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvoirTitrePK avoirTitrePK;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Column(name = "REF_AVOIR")
    private Integer refAvoir;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Column(name = "MNT_TND")
    private BigDecimal mntTnd;
    @Size(max = 2)
    @Column(name = "TYPE_COMP")
    private String typeComp;

    public AvoirTitre() {
    }

    public AvoirTitre(AvoirTitrePK avoirTitrePK) {
        this.avoirTitrePK = avoirTitrePK;
    }

    public AvoirTitre(short codeTitre, int numDom, Date dateDom) {
        this.avoirTitrePK = new AvoirTitrePK(codeTitre, numDom, dateDom);
    }

    public AvoirTitrePK getAvoirTitrePK() {
        return avoirTitrePK;
    }

    public void setAvoirTitrePK(AvoirTitrePK avoirTitrePK) {
        this.avoirTitrePK = avoirTitrePK;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Integer getRefAvoir() {
        return refAvoir;
    }

    public void setRefAvoir(Integer refAvoir) {
        this.refAvoir = refAvoir;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public BigDecimal getMntTnd() {
        return mntTnd;
    }

    public void setMntTnd(BigDecimal mntTnd) {
        this.mntTnd = mntTnd;
    }

    public String getTypeComp() {
        return typeComp;
    }

    public void setTypeComp(String typeComp) {
        this.typeComp = typeComp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avoirTitrePK != null ? avoirTitrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvoirTitre)) {
            return false;
        }
        AvoirTitre other = (AvoirTitre) object;
        if ((this.avoirTitrePK == null && other.avoirTitrePK != null) || (this.avoirTitrePK != null && !this.avoirTitrePK.equals(other.avoirTitrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.AvoirTitre[ avoirTitrePK=" + avoirTitrePK + " ]";
    }
    
}
