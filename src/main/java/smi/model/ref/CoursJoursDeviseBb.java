/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "COURS_JOURS_DEVISE_BB", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "CoursJoursDeviseBb.findAll", query = "SELECT c FROM CoursJoursDeviseBb c")})
public class CoursJoursDeviseBb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CoursJoursDeviseBbPK coursJoursDeviseBbPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COURS_ACHAT_BB")
    private BigDecimal coursAchatBb;
    @Column(name = "COURS_VENTE_BB")
    private BigDecimal coursVenteBb;
    @Size(max = 1)
    @Column(name = "COURS_VALIDE")
    private String coursValide;
    @Column(name = "TOTAL_RETRAIT")
    private BigDecimal totalRetrait;
    @Column(name = "TOTAL_VERSEMENT")
    private BigDecimal totalVersement;
    @Column(name = "SOLDE")
    private BigDecimal solde;

    public CoursJoursDeviseBb() {
    }

    public CoursJoursDeviseBb(CoursJoursDeviseBbPK coursJoursDeviseBbPK) {
        this.coursJoursDeviseBbPK = coursJoursDeviseBbPK;
    }

    public CoursJoursDeviseBb(Date dateCours, short codeDevise) {
        this.coursJoursDeviseBbPK = new CoursJoursDeviseBbPK(dateCours, codeDevise);
    }

    public CoursJoursDeviseBbPK getCoursJoursDeviseBbPK() {
        return coursJoursDeviseBbPK;
    }

    public void setCoursJoursDeviseBbPK(CoursJoursDeviseBbPK coursJoursDeviseBbPK) {
        this.coursJoursDeviseBbPK = coursJoursDeviseBbPK;
    }

    public BigDecimal getCoursAchatBb() {
        return coursAchatBb;
    }

    public void setCoursAchatBb(BigDecimal coursAchatBb) {
        this.coursAchatBb = coursAchatBb;
    }

    public BigDecimal getCoursVenteBb() {
        return coursVenteBb;
    }

    public void setCoursVenteBb(BigDecimal coursVenteBb) {
        this.coursVenteBb = coursVenteBb;
    }

    public String getCoursValide() {
        return coursValide;
    }

    public void setCoursValide(String coursValide) {
        this.coursValide = coursValide;
    }

    public BigDecimal getTotalRetrait() {
        return totalRetrait;
    }

    public void setTotalRetrait(BigDecimal totalRetrait) {
        this.totalRetrait = totalRetrait;
    }

    public BigDecimal getTotalVersement() {
        return totalVersement;
    }

    public void setTotalVersement(BigDecimal totalVersement) {
        this.totalVersement = totalVersement;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coursJoursDeviseBbPK != null ? coursJoursDeviseBbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoursJoursDeviseBb)) {
            return false;
        }
        CoursJoursDeviseBb other = (CoursJoursDeviseBb) object;
        if ((this.coursJoursDeviseBbPK == null && other.coursJoursDeviseBbPK != null) || (this.coursJoursDeviseBbPK != null && !this.coursJoursDeviseBbPK.equals(other.coursJoursDeviseBbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.CoursJoursDeviseBb[ coursJoursDeviseBbPK=" + coursJoursDeviseBbPK + " ]";
    }
    
}
