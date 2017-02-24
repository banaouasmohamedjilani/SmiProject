/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.domi;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Djo-Workstation
 */
@Embeddable
public class ApurementPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_APUREMENT")
    private short codeApurement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NATURE_TITRE")
    private short natureTitre;

    public ApurementPK() {
    }

    public ApurementPK(short codeApurement, short natureTitre) {
        this.codeApurement = codeApurement;
        this.natureTitre = natureTitre;
    }

    public short getCodeApurement() {
        return codeApurement;
    }

    public void setCodeApurement(short codeApurement) {
        this.codeApurement = codeApurement;
    }

    public short getNatureTitre() {
        return natureTitre;
    }

    public void setNatureTitre(short natureTitre) {
        this.natureTitre = natureTitre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeApurement;
        hash += (int) natureTitre;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApurementPK)) {
            return false;
        }
        ApurementPK other = (ApurementPK) object;
        if (this.codeApurement != other.codeApurement) {
            return false;
        }
        if (this.natureTitre != other.natureTitre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.ApurementPK[ codeApurement=" + codeApurement + ", natureTitre=" + natureTitre + " ]";
    }
    
}
