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
@Table(name = "BANQUE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Banque.findAll", query = "SELECT b FROM Banque b")})
public class Banque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_BANQUE")
    private Short codeBanque;
    @Size(max = 50)
    @Column(name = "LIB_BANQUE")
    private String libBanque;
    @Size(max = 20)
    @Column(name = "SIGLE_BANQUE")
    private String sigleBanque;
    @Size(max = 30)
    @Column(name = "RESIDENCE_BANQUE")
    private String residenceBanque;
    @Size(max = 30)
    @Column(name = "NUMERO_RESIDENCE_BANQUE")
    private String numeroResidenceBanque;
    @Size(max = 30)
    @Column(name = "CITE_RESIDENCE_BANQUE")
    private String citeResidenceBanque;
    @Column(name = "CODE_POSTAL")
    private Short codePostal;
    @Size(max = 12)
    @Column(name = "TEL")
    private String tel;
    @Size(max = 12)
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Size(max = 50)
    @Column(name = "PERSONNE_A_CONTACTER")
    private String personneAContacter;
    @Size(max = 50)
    @Column(name = "PERSONNE_POUR_CORRESPONDANCE")
    private String personnePourCorrespondance;

    public Banque() {
    }

    public Banque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getLibBanque() {
        return libBanque;
    }

    public void setLibBanque(String libBanque) {
        this.libBanque = libBanque;
    }

    public String getSigleBanque() {
        return sigleBanque;
    }

    public void setSigleBanque(String sigleBanque) {
        this.sigleBanque = sigleBanque;
    }

    public String getResidenceBanque() {
        return residenceBanque;
    }

    public void setResidenceBanque(String residenceBanque) {
        this.residenceBanque = residenceBanque;
    }

    public String getNumeroResidenceBanque() {
        return numeroResidenceBanque;
    }

    public void setNumeroResidenceBanque(String numeroResidenceBanque) {
        this.numeroResidenceBanque = numeroResidenceBanque;
    }

    public String getCiteResidenceBanque() {
        return citeResidenceBanque;
    }

    public void setCiteResidenceBanque(String citeResidenceBanque) {
        this.citeResidenceBanque = citeResidenceBanque;
    }

    public Short getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Short codePostal) {
        this.codePostal = codePostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    public String getPersonneAContacter() {
        return personneAContacter;
    }

    public void setPersonneAContacter(String personneAContacter) {
        this.personneAContacter = personneAContacter;
    }

    public String getPersonnePourCorrespondance() {
        return personnePourCorrespondance;
    }

    public void setPersonnePourCorrespondance(String personnePourCorrespondance) {
        this.personnePourCorrespondance = personnePourCorrespondance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeBanque != null ? codeBanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banque)) {
            return false;
        }
        Banque other = (Banque) object;
        if ((this.codeBanque == null && other.codeBanque != null) || (this.codeBanque != null && !this.codeBanque.equals(other.codeBanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.Banque[ codeBanque=" + codeBanque + " ]";
    }
    
}
