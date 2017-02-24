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
@Table(name = "PRODUIT_SERVICE", catalog = "", schema = "SECURITE")
@NamedQueries({
    @NamedQuery(name = "ProduitService.findAll", query = "SELECT p FROM ProduitService p")})
public class ProduitService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;
    @Size(max = 50)
    @Column(name = "LIBELLE_PRODUIT_SERVICE")
    private String libelleProduitService;
    @Column(name = "PERIODE")
    private Short periode;
    @Column(name = "NBR_PERIODE")
    private Short nbrPeriode;

    public ProduitService() {
    }

    public ProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public String getLibelleProduitService() {
        return libelleProduitService;
    }

    public void setLibelleProduitService(String libelleProduitService) {
        this.libelleProduitService = libelleProduitService;
    }

    public Short getPeriode() {
        return periode;
    }

    public void setPeriode(Short periode) {
        this.periode = periode;
    }

    public Short getNbrPeriode() {
        return nbrPeriode;
    }

    public void setNbrPeriode(Short nbrPeriode) {
        this.nbrPeriode = nbrPeriode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProduitService != null ? codeProduitService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduitService)) {
            return false;
        }
        ProduitService other = (ProduitService) object;
        if ((this.codeProduitService == null && other.codeProduitService != null) || (this.codeProduitService != null && !this.codeProduitService.equals(other.codeProduitService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.ProduitService[ codeProduitService=" + codeProduitService + " ]";
    }
    
}
