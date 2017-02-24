/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "NIVEAU_IMPORTANCE", catalog = "", schema = "SECURITE")
@NamedQueries({
    @NamedQuery(name = "NiveauImportance.findAll", query = "SELECT n FROM NiveauImportance n")})
public class NiveauImportance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_NIVEAU_IMP")
    private Short codeNiveauImp;
    @Size(max = 20)
    @Column(name = "LIB_NIVEAU")
    private String libNiveau;
    @Size(max = 7)
    @Column(name = "COULEUR")
    private String couleur;

    public NiveauImportance() {
    }

    public NiveauImportance(Short codeNiveauImp) {
        this.codeNiveauImp = codeNiveauImp;
    }

    public Short getCodeNiveauImp() {
        return codeNiveauImp;
    }

    public void setCodeNiveauImp(Short codeNiveauImp) {
        this.codeNiveauImp = codeNiveauImp;
    }

    public String getLibNiveau() {
        return libNiveau;
    }

    public void setLibNiveau(String libNiveau) {
        this.libNiveau = libNiveau;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeNiveauImp != null ? codeNiveauImp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NiveauImportance)) {
            return false;
        }
        NiveauImportance other = (NiveauImportance) object;
        if ((this.codeNiveauImp == null && other.codeNiveauImp != null) || (this.codeNiveauImp != null && !this.codeNiveauImp.equals(other.codeNiveauImp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.NiveauImportance[ codeNiveauImp=" + codeNiveauImp + " ]";
    }
    
}
