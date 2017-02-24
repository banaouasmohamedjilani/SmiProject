/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TITRE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Titre.findAll", query = "SELECT t FROM Titre t")})
public class Titre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TITRE")
    private Short codeTitre;
    @Size(max = 50)
    @Column(name = "LIB_TITRE")
    private String libTitre;
    @JoinColumn(name = "NATURE_TITRE", referencedColumnName = "CODE_NATURE")
    @ManyToOne
    private Nature natureTitre;

    public Titre() {
    }

    public Titre(Short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public String getLibTitre() {
        return libTitre;
    }

    public void setLibTitre(String libTitre) {
        this.libTitre = libTitre;
    }

    public Nature getNatureTitre() {
        return natureTitre;
    }

    public void setNatureTitre(Nature natureTitre) {
        this.natureTitre = natureTitre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTitre != null ? codeTitre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titre)) {
            return false;
        }
        Titre other = (Titre) object;
        if ((this.codeTitre == null && other.codeTitre != null) || (this.codeTitre != null && !this.codeTitre.equals(other.codeTitre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.Titre[ codeTitre=" + codeTitre + " ]";
    }
    
}
