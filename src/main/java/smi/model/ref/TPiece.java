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
@Table(name = "T_PIECE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "TPiece.findAll", query = "SELECT t FROM TPiece t")})
public class TPiece implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_PIECE")
    private Short codeTypePiece;
    @Size(max = 30)
    @Column(name = "LIBELLE_TYPE_PIECE")
    private String libelleTypePiece;
    @Size(max = 5)
    @Column(name = "SIGLE")
    private String sigle;

    public TPiece() {
    }

    public TPiece(Short codeTypePiece) {
        this.codeTypePiece = codeTypePiece;
    }

    public Short getCodeTypePiece() {
        return codeTypePiece;
    }

    public void setCodeTypePiece(Short codeTypePiece) {
        this.codeTypePiece = codeTypePiece;
    }

    public String getLibelleTypePiece() {
        return libelleTypePiece;
    }

    public void setLibelleTypePiece(String libelleTypePiece) {
        this.libelleTypePiece = libelleTypePiece;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypePiece != null ? codeTypePiece.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TPiece)) {
            return false;
        }
        TPiece other = (TPiece) object;
        if ((this.codeTypePiece == null && other.codeTypePiece != null) || (this.codeTypePiece != null && !this.codeTypePiece.equals(other.codeTypePiece))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.TPiece[ codeTypePiece=" + codeTypePiece + " ]";
    }
    
}
