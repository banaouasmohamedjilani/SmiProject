/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Embeddable
public class AbonnementPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "NO_PIECE_PERSONNE")
    private String noPiecePersonne;

    public AbonnementPK() {
    }

    public AbonnementPK(short codeProduitService, String noPiecePersonne) {
        this.codeProduitService = codeProduitService;
        this.noPiecePersonne = noPiecePersonne;
    }

    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public String getNoPiecePersonne() {
        return noPiecePersonne;
    }

    public void setNoPiecePersonne(String noPiecePersonne) {
        this.noPiecePersonne = noPiecePersonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (noPiecePersonne != null ? noPiecePersonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbonnementPK)) {
            return false;
        }
        AbonnementPK other = (AbonnementPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if ((this.noPiecePersonne == null && other.noPiecePersonne != null) || (this.noPiecePersonne != null && !this.noPiecePersonne.equals(other.noPiecePersonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.AbonnementPK[ codeProduitService=" + codeProduitService + ", noPiecePersonne=" + noPiecePersonne + " ]";
    }
    
}
