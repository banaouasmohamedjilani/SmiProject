/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.domi;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Embeddable
public class DocDossierSorPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_CONTRAT")
    private int refContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNITE_CONTRAT")
    private short uniteContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONTRAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PIECE")
    private short codePiece;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "REFERENCE_FICHIER_JOINT")
    private String referenceFichierJoint;

    public DocDossierSorPK() {
    }

    public DocDossierSorPK(int refContrat, short uniteContrat, Date dateContrat, short codePiece, String referenceFichierJoint) {
        this.refContrat = refContrat;
        this.uniteContrat = uniteContrat;
        this.dateContrat = dateContrat;
        this.codePiece = codePiece;
        this.referenceFichierJoint = referenceFichierJoint;
    }

    public int getRefContrat() {
        return refContrat;
    }

    public void setRefContrat(int refContrat) {
        this.refContrat = refContrat;
    }

    public short getUniteContrat() {
        return uniteContrat;
    }

    public void setUniteContrat(short uniteContrat) {
        this.uniteContrat = uniteContrat;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    public short getCodePiece() {
        return codePiece;
    }

    public void setCodePiece(short codePiece) {
        this.codePiece = codePiece;
    }

    public String getReferenceFichierJoint() {
        return referenceFichierJoint;
    }

    public void setReferenceFichierJoint(String referenceFichierJoint) {
        this.referenceFichierJoint = referenceFichierJoint;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) refContrat;
        hash += (int) uniteContrat;
        hash += (dateContrat != null ? dateContrat.hashCode() : 0);
        hash += (int) codePiece;
        hash += (referenceFichierJoint != null ? referenceFichierJoint.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocDossierSorPK)) {
            return false;
        }
        DocDossierSorPK other = (DocDossierSorPK) object;
        if (this.refContrat != other.refContrat) {
            return false;
        }
        if (this.uniteContrat != other.uniteContrat) {
            return false;
        }
        if ((this.dateContrat == null && other.dateContrat != null) || (this.dateContrat != null && !this.dateContrat.equals(other.dateContrat))) {
            return false;
        }
        if (this.codePiece != other.codePiece) {
            return false;
        }
        if ((this.referenceFichierJoint == null && other.referenceFichierJoint != null) || (this.referenceFichierJoint != null && !this.referenceFichierJoint.equals(other.referenceFichierJoint))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.DocDossierSorPK[ refContrat=" + refContrat + ", uniteContrat=" + uniteContrat + ", dateContrat=" + dateContrat + ", codePiece=" + codePiece + ", referenceFichierJoint=" + referenceFichierJoint + " ]";
    }
    
}
