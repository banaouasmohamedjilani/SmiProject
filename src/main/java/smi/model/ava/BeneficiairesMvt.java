/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ava;

import java.io.Serializable;
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
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "BENEFICIAIRES_MVT", catalog = "", schema = "AVA")
@NamedQueries({
    @NamedQuery(name = "BeneficiairesMvt.findAll", query = "SELECT b FROM BeneficiairesMvt b")})
public class BeneficiairesMvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BeneficiairesMvtPK beneficiairesMvtPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNITE_OPERATION")
    private short uniteOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER")
    private int numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Column(name = "CODE_TYPE_DOS")
    private Short codeTypeDos;
    @Column(name = "CODE_BANQUE")
    private Short codeBanque;
    @Column(name = "CODE_AGENCE_AVA")
    private Short codeAgenceAva;
    @Column(name = "TYPE_PIECE_BENEF")
    private Short typePieceBenef;
    @Column(name = "DATE_PIECE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePiece;
    @Size(max = 50)
    @Column(name = "NOM_BENEF")
    private String nomBenef;
    @Size(max = 50)
    @Column(name = "ADRESSE_BENEF")
    private String adresseBenef;
    @Size(max = 30)
    @Column(name = "QUALITE")
    private String qualite;
    @Size(max = 2)
    @Column(name = "ETAT")
    private String etat;
    @Column(name = "DATE_CREATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Column(name = "DATE_SUPPRESSION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSuppression;

    public BeneficiairesMvt() {
    }

    public BeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK) {
        this.beneficiairesMvtPK = beneficiairesMvtPK;
    }

    public BeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK, short uniteOperation, int numDossier) {
        this.beneficiairesMvtPK = beneficiairesMvtPK;
        this.uniteOperation = uniteOperation;
        this.numDossier = numDossier;
    }

    public BeneficiairesMvt(short codeProduitService, short codeOperation, long refOperation, Date dateOperation, String noPieceBenef) {
        this.beneficiairesMvtPK = new BeneficiairesMvtPK(codeProduitService, codeOperation, refOperation, dateOperation, noPieceBenef);
    }

    public BeneficiairesMvtPK getBeneficiairesMvtPK() {
        return beneficiairesMvtPK;
    }

    public void setBeneficiairesMvtPK(BeneficiairesMvtPK beneficiairesMvtPK) {
        this.beneficiairesMvtPK = beneficiairesMvtPK;
    }

    public short getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(short uniteOperation) {
        this.uniteOperation = uniteOperation;
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

    public Short getCodeTypeDos() {
        return codeTypeDos;
    }

    public void setCodeTypeDos(Short codeTypeDos) {
        this.codeTypeDos = codeTypeDos;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public Short getCodeAgenceAva() {
        return codeAgenceAva;
    }

    public void setCodeAgenceAva(Short codeAgenceAva) {
        this.codeAgenceAva = codeAgenceAva;
    }

    public Short getTypePieceBenef() {
        return typePieceBenef;
    }

    public void setTypePieceBenef(Short typePieceBenef) {
        this.typePieceBenef = typePieceBenef;
    }

    public Date getDatePiece() {
        return datePiece;
    }

    public void setDatePiece(Date datePiece) {
        this.datePiece = datePiece;
    }

    public String getNomBenef() {
        return nomBenef;
    }

    public void setNomBenef(String nomBenef) {
        this.nomBenef = nomBenef;
    }

    public String getAdresseBenef() {
        return adresseBenef;
    }

    public void setAdresseBenef(String adresseBenef) {
        this.adresseBenef = adresseBenef;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateSuppression() {
        return dateSuppression;
    }

    public void setDateSuppression(Date dateSuppression) {
        this.dateSuppression = dateSuppression;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beneficiairesMvtPK != null ? beneficiairesMvtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiairesMvt)) {
            return false;
        }
        BeneficiairesMvt other = (BeneficiairesMvt) object;
        if ((this.beneficiairesMvtPK == null && other.beneficiairesMvtPK != null) || (this.beneficiairesMvtPK != null && !this.beneficiairesMvtPK.equals(other.beneficiairesMvtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ava.BeneficiairesMvt[ beneficiairesMvtPK=" + beneficiairesMvtPK + " ]";
    }
    
}
