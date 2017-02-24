/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.gen;

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
public class DocumentsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_LIGNE")
    private short numLigne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "REFERENCE_FICHIER_JOINT")
    private String referenceFichierJoint;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "PATH_ANNEE")
    private String pathAnnee;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "PATH_MOIS")
    private String pathMois;

    public DocumentsPK() {
    }

    public DocumentsPK(short numLigne, String referenceFichierJoint, String pathAnnee, String pathMois) {
        this.numLigne = numLigne;
        this.referenceFichierJoint = referenceFichierJoint;
        this.pathAnnee = pathAnnee;
        this.pathMois = pathMois;
    }

    public short getNumLigne() {
        return numLigne;
    }

    public void setNumLigne(short numLigne) {
        this.numLigne = numLigne;
    }

    public String getReferenceFichierJoint() {
        return referenceFichierJoint;
    }

    public void setReferenceFichierJoint(String referenceFichierJoint) {
        this.referenceFichierJoint = referenceFichierJoint;
    }

    public String getPathAnnee() {
        return pathAnnee;
    }

    public void setPathAnnee(String pathAnnee) {
        this.pathAnnee = pathAnnee;
    }

    public String getPathMois() {
        return pathMois;
    }

    public void setPathMois(String pathMois) {
        this.pathMois = pathMois;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numLigne;
        hash += (referenceFichierJoint != null ? referenceFichierJoint.hashCode() : 0);
        hash += (pathAnnee != null ? pathAnnee.hashCode() : 0);
        hash += (pathMois != null ? pathMois.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentsPK)) {
            return false;
        }
        DocumentsPK other = (DocumentsPK) object;
        if (this.numLigne != other.numLigne) {
            return false;
        }
        if ((this.referenceFichierJoint == null && other.referenceFichierJoint != null) || (this.referenceFichierJoint != null && !this.referenceFichierJoint.equals(other.referenceFichierJoint))) {
            return false;
        }
        if ((this.pathAnnee == null && other.pathAnnee != null) || (this.pathAnnee != null && !this.pathAnnee.equals(other.pathAnnee))) {
            return false;
        }
        if ((this.pathMois == null && other.pathMois != null) || (this.pathMois != null && !this.pathMois.equals(other.pathMois))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.gen.DocumentsPK[ numLigne=" + numLigne + ", referenceFichierJoint=" + referenceFichierJoint + ", pathAnnee=" + pathAnnee + ", pathMois=" + pathMois + " ]";
    }
    
}
