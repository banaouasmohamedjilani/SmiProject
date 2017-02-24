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
@Table(name = "REGIME_STAT", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "RegimeStat.findAll", query = "SELECT r FROM RegimeStat r")})
public class RegimeStat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_REGIME_STAT")
    private Short codeRegimeStat;
    @Size(max = 100)
    @Column(name = "LIB_REGIME_STAT")
    private String libRegimeStat;

    public RegimeStat() {
    }

    public RegimeStat(Short codeRegimeStat) {
        this.codeRegimeStat = codeRegimeStat;
    }

    public Short getCodeRegimeStat() {
        return codeRegimeStat;
    }

    public void setCodeRegimeStat(Short codeRegimeStat) {
        this.codeRegimeStat = codeRegimeStat;
    }

    public String getLibRegimeStat() {
        return libRegimeStat;
    }

    public void setLibRegimeStat(String libRegimeStat) {
        this.libRegimeStat = libRegimeStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeRegimeStat != null ? codeRegimeStat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimeStat)) {
            return false;
        }
        RegimeStat other = (RegimeStat) object;
        if ((this.codeRegimeStat == null && other.codeRegimeStat != null) || (this.codeRegimeStat != null && !this.codeRegimeStat.equals(other.codeRegimeStat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.RegimeStat[ codeRegimeStat=" + codeRegimeStat + " ]";
    }
    
}
