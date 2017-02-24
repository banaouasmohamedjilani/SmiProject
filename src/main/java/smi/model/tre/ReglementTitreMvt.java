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
@Table(name = "REGLEMENT_TITRE_MVT", catalog = "", schema = "TRE")
@NamedQueries({
    @NamedQuery(name = "ReglementTitreMvt.findAll", query = "SELECT r FROM ReglementTitreMvt r")})
public class ReglementTitreMvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReglementTitreMvtPK reglementTitreMvtPK;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Column(name = "CODE_DEVISE_TITRE")
    private Short codeDeviseTitre;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_TITRE")
    private BigDecimal mntTitre;
    @Column(name = "CONTRE_VALEUR_TND")
    private BigDecimal contreValeurTnd;
    @Size(max = 20)
    @Column(name = "REF_FACTURE")
    private String refFacture;
    @Column(name = "DATE_FACTURE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFacture;
    @Column(name = "NATURE_OPERATION")
    private Integer natureOperation;
    @Column(name = "CODE_MOD_REG")
    private Short codeModReg;
    @Column(name = "MNT_FRAIS_TND")
    private BigDecimal mntFraisTnd;
    @Column(name = "COD_PAY_ORIG")
    private Short codPayOrig;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;

    public ReglementTitreMvt() {
    }

    public ReglementTitreMvt(ReglementTitreMvtPK reglementTitreMvtPK) {
        this.reglementTitreMvtPK = reglementTitreMvtPK;
    }

    public ReglementTitreMvt(short codeProduitService, short codeOperation, int refOperation, short codeTitre, int numDom, Date dateDom) {
        this.reglementTitreMvtPK = new ReglementTitreMvtPK(codeProduitService, codeOperation, refOperation, codeTitre, numDom, dateDom);
    }

    public ReglementTitreMvtPK getReglementTitreMvtPK() {
        return reglementTitreMvtPK;
    }

    public void setReglementTitreMvtPK(ReglementTitreMvtPK reglementTitreMvtPK) {
        this.reglementTitreMvtPK = reglementTitreMvtPK;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Long numDossier) {
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

    public Short getCodeDeviseTitre() {
        return codeDeviseTitre;
    }

    public void setCodeDeviseTitre(Short codeDeviseTitre) {
        this.codeDeviseTitre = codeDeviseTitre;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntTitre() {
        return mntTitre;
    }

    public void setMntTitre(BigDecimal mntTitre) {
        this.mntTitre = mntTitre;
    }

    public BigDecimal getContreValeurTnd() {
        return contreValeurTnd;
    }

    public void setContreValeurTnd(BigDecimal contreValeurTnd) {
        this.contreValeurTnd = contreValeurTnd;
    }

    public String getRefFacture() {
        return refFacture;
    }

    public void setRefFacture(String refFacture) {
        this.refFacture = refFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Integer getNatureOperation() {
        return natureOperation;
    }

    public void setNatureOperation(Integer natureOperation) {
        this.natureOperation = natureOperation;
    }

    public Short getCodeModReg() {
        return codeModReg;
    }

    public void setCodeModReg(Short codeModReg) {
        this.codeModReg = codeModReg;
    }

    public BigDecimal getMntFraisTnd() {
        return mntFraisTnd;
    }

    public void setMntFraisTnd(BigDecimal mntFraisTnd) {
        this.mntFraisTnd = mntFraisTnd;
    }

    public Short getCodPayOrig() {
        return codPayOrig;
    }

    public void setCodPayOrig(Short codPayOrig) {
        this.codPayOrig = codPayOrig;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reglementTitreMvtPK != null ? reglementTitreMvtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementTitreMvt)) {
            return false;
        }
        ReglementTitreMvt other = (ReglementTitreMvt) object;
        if ((this.reglementTitreMvtPK == null && other.reglementTitreMvtPK != null) || (this.reglementTitreMvtPK != null && !this.reglementTitreMvtPK.equals(other.reglementTitreMvtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.ReglementTitreMvt[ reglementTitreMvtPK=" + reglementTitreMvtPK + " ]";
    }
    
}
