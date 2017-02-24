/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

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
public class ComptePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_AGENCE_BCT")
    private short codeAgenceBct;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLE_RIB")
    private short cleRib;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;

    public ComptePK() {
    }

    public ComptePK(short codeAgenceBct, short cleRib, String racineCompte) {
        this.codeAgenceBct = codeAgenceBct;
        this.cleRib = cleRib;
        this.racineCompte = racineCompte;
    }

    public short getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(short codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    public short getCleRib() {
        return cleRib;
    }

    public void setCleRib(short cleRib) {
        this.cleRib = cleRib;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeAgenceBct;
        hash += (int) cleRib;
        hash += (racineCompte != null ? racineCompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComptePK)) {
            return false;
        }
        ComptePK other = (ComptePK) object;
        if (this.codeAgenceBct != other.codeAgenceBct) {
            return false;
        }
        if (this.cleRib != other.cleRib) {
            return false;
        }
        if ((this.racineCompte == null && other.racineCompte != null) || (this.racineCompte != null && !this.racineCompte.equals(other.racineCompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.ComptePK[ codeAgenceBct=" + codeAgenceBct + ", cleRib=" + cleRib + ", racineCompte=" + racineCompte + " ]";
    }
    
}
