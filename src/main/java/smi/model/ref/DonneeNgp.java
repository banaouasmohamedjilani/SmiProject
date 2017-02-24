/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
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
@Table(name = "DONNEE_NGP", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "DonneeNgp.findAll", query = "SELECT d FROM DonneeNgp d")})
public class DonneeNgp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_NGP")
    private Long codeNgp;
    @Size(max = 250)
    @Column(name = "LIB_NGP")
    private String libNgp;
    @Size(max = 2)
    @Column(name = "CODE_PROH_IMP")
    private String codeProhImp;
    @Size(max = 2)
    @Column(name = "CODE_PROH_EXP")
    private String codeProhExp;
    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @Size(max = 1)
    @Column(name = "RESTRICTION_IMPORTATEUR")
    private String restrictionImportateur;
    @Column(name = "FLAG_INSERT")
    private Short flagInsert;

    public DonneeNgp() {
    }

    public DonneeNgp(Long codeNgp) {
        this.codeNgp = codeNgp;
    }

    public Long getCodeNgp() {
        return codeNgp;
    }

    public void setCodeNgp(Long codeNgp) {
        this.codeNgp = codeNgp;
    }

    public String getLibNgp() {
        return libNgp;
    }

    public void setLibNgp(String libNgp) {
        this.libNgp = libNgp;
    }

    public String getCodeProhImp() {
        return codeProhImp;
    }

    public void setCodeProhImp(String codeProhImp) {
        this.codeProhImp = codeProhImp;
    }

    public String getCodeProhExp() {
        return codeProhExp;
    }

    public void setCodeProhExp(String codeProhExp) {
        this.codeProhExp = codeProhExp;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getRestrictionImportateur() {
        return restrictionImportateur;
    }

    public void setRestrictionImportateur(String restrictionImportateur) {
        this.restrictionImportateur = restrictionImportateur;
    }

    public Short getFlagInsert() {
        return flagInsert;
    }

    public void setFlagInsert(Short flagInsert) {
        this.flagInsert = flagInsert;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeNgp != null ? codeNgp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonneeNgp)) {
            return false;
        }
        DonneeNgp other = (DonneeNgp) object;
        if ((this.codeNgp == null && other.codeNgp != null) || (this.codeNgp != null && !this.codeNgp.equals(other.codeNgp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.DonneeNgp[ codeNgp=" + codeNgp + " ]";
    }
    
}
