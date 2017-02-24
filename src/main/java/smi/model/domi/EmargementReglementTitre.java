/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.domi;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "EMARGEMENT_REGLEMENT_TITRE", catalog = "", schema = "DOMI")
@NamedQueries({
    @NamedQuery(name = "EmargementReglementTitre.findAll", query = "SELECT e FROM EmargementReglementTitre e")})
public class EmargementReglementTitre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmargementReglementTitrePK emargementReglementTitrePK;
    @Column(name = "CODE_SERVICE")
    private Short codeService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER")
    private int numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_REGLEMENT")
    private BigDecimal mntReglement;
    @Column(name = "MNT_REGLEMENT_DT")
    private BigDecimal mntReglementDt;

    public EmargementReglementTitre() {
    }

    public EmargementReglementTitre(EmargementReglementTitrePK emargementReglementTitrePK) {
        this.emargementReglementTitrePK = emargementReglementTitrePK;
    }

    public EmargementReglementTitre(EmargementReglementTitrePK emargementReglementTitrePK, int numDossier) {
        this.emargementReglementTitrePK = emargementReglementTitrePK;
        this.numDossier = numDossier;
    }

    public EmargementReglementTitre(int numDom, Date dateDom, short codeTitre, Date dateOperation, short codeProduitService, short codeOperation, int refOperation) {
        this.emargementReglementTitrePK = new EmargementReglementTitrePK(numDom, dateDom, codeTitre, dateOperation, codeProduitService, codeOperation, refOperation);
    }

    public EmargementReglementTitrePK getEmargementReglementTitrePK() {
        return emargementReglementTitrePK;
    }

    public void setEmargementReglementTitrePK(EmargementReglementTitrePK emargementReglementTitrePK) {
        this.emargementReglementTitrePK = emargementReglementTitrePK;
    }

    public Short getCodeService() {
        return codeService;
    }

    public void setCodeService(Short codeService) {
        this.codeService = codeService;
    }

    public int getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(int numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntReglement() {
        return mntReglement;
    }

    public void setMntReglement(BigDecimal mntReglement) {
        this.mntReglement = mntReglement;
    }

    public BigDecimal getMntReglementDt() {
        return mntReglementDt;
    }

    public void setMntReglementDt(BigDecimal mntReglementDt) {
        this.mntReglementDt = mntReglementDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emargementReglementTitrePK != null ? emargementReglementTitrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmargementReglementTitre)) {
            return false;
        }
        EmargementReglementTitre other = (EmargementReglementTitre) object;
        if ((this.emargementReglementTitrePK == null && other.emargementReglementTitrePK != null) || (this.emargementReglementTitrePK != null && !this.emargementReglementTitrePK.equals(other.emargementReglementTitrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.EmargementReglementTitre[ emargementReglementTitrePK=" + emargementReglementTitrePK + " ]";
    }
    
}
