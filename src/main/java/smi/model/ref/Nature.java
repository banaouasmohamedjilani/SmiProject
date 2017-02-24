/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "NATURE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Nature.findAll", query = "SELECT n FROM Nature n")})
public class Nature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_NATURE")
    private Short codeNature;
    @Size(max = 20)
    @Column(name = "LIBELLE_NATURE")
    private String libelleNature;
    @OneToMany(mappedBy = "natureTitre")
    private List<Titre> titreList;

    public Nature() {
    }

    public Nature(Short codeNature) {
        this.codeNature = codeNature;
    }

    public Short getCodeNature() {
        return codeNature;
    }

    public void setCodeNature(Short codeNature) {
        this.codeNature = codeNature;
    }

    public String getLibelleNature() {
        return libelleNature;
    }

    public void setLibelleNature(String libelleNature) {
        this.libelleNature = libelleNature;
    }

    public List<Titre> getTitreList() {
        return titreList;
    }

    public void setTitreList(List<Titre> titreList) {
        this.titreList = titreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeNature != null ? codeNature.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nature)) {
            return false;
        }
        Nature other = (Nature) object;
        if ((this.codeNature == null && other.codeNature != null) || (this.codeNature != null && !this.codeNature.equals(other.codeNature))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.Nature[ codeNature=" + codeNature + " ]";
    }
    
}
