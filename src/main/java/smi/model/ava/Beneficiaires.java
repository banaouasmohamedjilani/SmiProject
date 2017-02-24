/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ava;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "BENEFICIAIRES", catalog = "", schema = "AVA")
@NamedQueries({
    @NamedQuery(name = "Beneficiaires.findAll", query = "SELECT b FROM Beneficiaires b")})
public class Beneficiaires implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BeneficiairesPK beneficiairesPK;
    @Column(name = "CODE_BANQUE")
    private Short codeBanque;
    @Column(name = "CODE_AGENCE_AVA")
    private BigInteger codeAgenceAva;
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

    public Beneficiaires() {
    }

    public Beneficiaires(BeneficiairesPK beneficiairesPK) {
        this.beneficiairesPK = beneficiairesPK;
    }

    public Beneficiaires(int numDossier, Date dateDossier, short codeTypeDos, String noPieceBenef) {
        this.beneficiairesPK = new BeneficiairesPK(numDossier, dateDossier, codeTypeDos, noPieceBenef);
    }

    public BeneficiairesPK getBeneficiairesPK() {
        return beneficiairesPK;
    }

    public void setBeneficiairesPK(BeneficiairesPK beneficiairesPK) {
        this.beneficiairesPK = beneficiairesPK;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public BigInteger getCodeAgenceAva() {
        return codeAgenceAva;
    }

    public void setCodeAgenceAva(BigInteger codeAgenceAva) {
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
        hash += (beneficiairesPK != null ? beneficiairesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiaires)) {
            return false;
        }
        Beneficiaires other = (Beneficiaires) object;
        if ((this.beneficiairesPK == null && other.beneficiairesPK != null) || (this.beneficiairesPK != null && !this.beneficiairesPK.equals(other.beneficiairesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ava.Beneficiaires[ beneficiairesPK=" + beneficiairesPK + " ]";
    }
    
}
