/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TYPE_DOSSIER_AVA", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "TypeDossierAva.findAll", query = "SELECT t FROM TypeDossierAva t")})
public class TypeDossierAva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_DOS_AVA")
    private Short codeTypeDosAva;
    @Size(max = 30)
    @Column(name = "LIB_TYPE_DOS_AVA")
    private String libTypeDosAva;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SEUIL_MINIMUM")
    private BigDecimal seuilMinimum;
    @Column(name = "SEUIL_MAXIMUM")
    private BigDecimal seuilMaximum;
    @Column(name = "DROIT_MINIMUM")
    private BigDecimal droitMinimum;
    @Column(name = "TAUX_AVA")
    private BigDecimal tauxAva;
    @Column(name = "DROIT_MAXIMUM")
    private BigDecimal droitMaximum;
    @Size(max = 1)
    @Column(name = "AVANCE_O_N")
    private String avanceON;
    @Column(name = "DATE_AVANCE_MAX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAvanceMax;
    @Column(name = "ANNEE_CIRCULAIRE")
    private Short anneeCirculaire;
    @Column(name = "NUMERO_CIRCULAIRE")
    private BigInteger numeroCirculaire;
    @Column(name = "DATE_APPLICATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApplication;
    @Column(name = "DATE_FIN_APPLICATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinApplication;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "NBR_AVANCE")
    private BigInteger nbrAvance;
    @Column(name = "TAUX_AVANCE_MAX")
    private BigDecimal tauxAvanceMax;

    public TypeDossierAva() {
    }

    public TypeDossierAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
    }

    public Short getCodeTypeDosAva() {
        return codeTypeDosAva;
    }

    public void setCodeTypeDosAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
    }

    public String getLibTypeDosAva() {
        return libTypeDosAva;
    }

    public void setLibTypeDosAva(String libTypeDosAva) {
        this.libTypeDosAva = libTypeDosAva;
    }

    public BigDecimal getSeuilMinimum() {
        return seuilMinimum;
    }

    public void setSeuilMinimum(BigDecimal seuilMinimum) {
        this.seuilMinimum = seuilMinimum;
    }

    public BigDecimal getSeuilMaximum() {
        return seuilMaximum;
    }

    public void setSeuilMaximum(BigDecimal seuilMaximum) {
        this.seuilMaximum = seuilMaximum;
    }

    public BigDecimal getDroitMinimum() {
        return droitMinimum;
    }

    public void setDroitMinimum(BigDecimal droitMinimum) {
        this.droitMinimum = droitMinimum;
    }

    public BigDecimal getTauxAva() {
        return tauxAva;
    }

    public void setTauxAva(BigDecimal tauxAva) {
        this.tauxAva = tauxAva;
    }

    public BigDecimal getDroitMaximum() {
        return droitMaximum;
    }

    public void setDroitMaximum(BigDecimal droitMaximum) {
        this.droitMaximum = droitMaximum;
    }

    public String getAvanceON() {
        return avanceON;
    }

    public void setAvanceON(String avanceON) {
        this.avanceON = avanceON;
    }

    public Date getDateAvanceMax() {
        return dateAvanceMax;
    }

    public void setDateAvanceMax(Date dateAvanceMax) {
        this.dateAvanceMax = dateAvanceMax;
    }

    public Short getAnneeCirculaire() {
        return anneeCirculaire;
    }

    public void setAnneeCirculaire(Short anneeCirculaire) {
        this.anneeCirculaire = anneeCirculaire;
    }

    public BigInteger getNumeroCirculaire() {
        return numeroCirculaire;
    }

    public void setNumeroCirculaire(BigInteger numeroCirculaire) {
        this.numeroCirculaire = numeroCirculaire;
    }

    public Date getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(Date dateApplication) {
        this.dateApplication = dateApplication;
    }

    public Date getDateFinApplication() {
        return dateFinApplication;
    }

    public void setDateFinApplication(Date dateFinApplication) {
        this.dateFinApplication = dateFinApplication;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getNbrAvance() {
        return nbrAvance;
    }

    public void setNbrAvance(BigInteger nbrAvance) {
        this.nbrAvance = nbrAvance;
    }

    public BigDecimal getTauxAvanceMax() {
        return tauxAvanceMax;
    }

    public void setTauxAvanceMax(BigDecimal tauxAvanceMax) {
        this.tauxAvanceMax = tauxAvanceMax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypeDosAva != null ? codeTypeDosAva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeDossierAva)) {
            return false;
        }
        TypeDossierAva other = (TypeDossierAva) object;
        if ((this.codeTypeDosAva == null && other.codeTypeDosAva != null) || (this.codeTypeDosAva != null && !this.codeTypeDosAva.equals(other.codeTypeDosAva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.TypeDossierAva[ codeTypeDosAva=" + codeTypeDosAva + " ]";
    }
    
}
