/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.tre;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "TITRE_BP", catalog = "", schema = "TRE")
@NamedQueries({
    @NamedQuery(name = "TitreBp.findAll", query = "SELECT t FROM TitreBp t")})
public class TitreBp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TitreBpPK titreBpPK;
    @Column(name = "CODE_DVS_TITRE_BP")
    private Short codeDvsTitreBp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_TITRE_BP")
    private BigDecimal mntTitreBp;
    @Column(name = "CODE_PAYS_TITRE_BP")
    private Short codePaysTitreBp;
    @JoinColumns({
        @JoinColumn(name = "NUM_DOSSIER", referencedColumnName = "NUM_DOSSIER", insertable = false, updatable = false)
        , @JoinColumn(name = "DATE_DOSSIER", referencedColumnName = "DATE_DOSSIER", insertable = false, updatable = false)
        , @JoinColumn(name = "TYPE_DOSSIER", referencedColumnName = "TYPE_DOSSIER", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Reglement reglement;

    public TitreBp() {
    }

    public TitreBp(TitreBpPK titreBpPK) {
        this.titreBpPK = titreBpPK;
    }

    public TitreBp(long numDossier, Date dateDossier, String typeDossier, short codeTitreBp, int numDomBp, Date dateDomBp) {
        this.titreBpPK = new TitreBpPK(numDossier, dateDossier, typeDossier, codeTitreBp, numDomBp, dateDomBp);
    }

    public TitreBpPK getTitreBpPK() {
        return titreBpPK;
    }

    public void setTitreBpPK(TitreBpPK titreBpPK) {
        this.titreBpPK = titreBpPK;
    }

    public Short getCodeDvsTitreBp() {
        return codeDvsTitreBp;
    }

    public void setCodeDvsTitreBp(Short codeDvsTitreBp) {
        this.codeDvsTitreBp = codeDvsTitreBp;
    }

    public BigDecimal getMntTitreBp() {
        return mntTitreBp;
    }

    public void setMntTitreBp(BigDecimal mntTitreBp) {
        this.mntTitreBp = mntTitreBp;
    }

    public Short getCodePaysTitreBp() {
        return codePaysTitreBp;
    }

    public void setCodePaysTitreBp(Short codePaysTitreBp) {
        this.codePaysTitreBp = codePaysTitreBp;
    }

    public Reglement getReglement() {
        return reglement;
    }

    public void setReglement(Reglement reglement) {
        this.reglement = reglement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (titreBpPK != null ? titreBpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitreBp)) {
            return false;
        }
        TitreBp other = (TitreBp) object;
        if ((this.titreBpPK == null && other.titreBpPK != null) || (this.titreBpPK != null && !this.titreBpPK.equals(other.titreBpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.TitreBp[ titreBpPK=" + titreBpPK + " ]";
    }
    
}
