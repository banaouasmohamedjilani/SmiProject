/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "COMPTE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Compte.findAll", query = "SELECT c FROM Compte c")})
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComptePK comptePK;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Short typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    @Column(name = "NATURE_COMPTE")
    private Short natureCompte;
    @Column(name = "DATE_CREATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Column(name = "DATE_CLOTURE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCloture;
    @Column(name = "COMPTE_PROFESS_O_N")
    private Character compteProfessON;

    public Compte() {
    }

    public Compte(ComptePK comptePK) {
        this.comptePK = comptePK;
    }

    public Compte(short codeAgenceBct, short cleRib, String racineCompte) {
        this.comptePK = new ComptePK(codeAgenceBct, cleRib, racineCompte);
    }

    public ComptePK getComptePK() {
        return comptePK;
    }

    public void setComptePK(ComptePK comptePK) {
        this.comptePK = comptePK;
    }

    public Short getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(Short typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Short getNatureCompte() {
        return natureCompte;
    }

    public void setNatureCompte(Short natureCompte) {
        this.natureCompte = natureCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public Character getCompteProfessON() {
        return compteProfessON;
    }

    public void setCompteProfessON(Character compteProfessON) {
        this.compteProfessON = compteProfessON;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comptePK != null ? comptePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.comptePK == null && other.comptePK != null) || (this.comptePK != null && !this.comptePK.equals(other.comptePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.Compte[ comptePK=" + comptePK + " ]";
    }
    
}
