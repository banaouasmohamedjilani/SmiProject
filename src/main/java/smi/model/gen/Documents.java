/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.gen;

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
@Table(name = "DOCUMENTS", catalog = "", schema = "GEN")
@NamedQueries({
    @NamedQuery(name = "Documents.findAll", query = "SELECT d FROM Documents d")})
public class Documents implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentsPK documentsPK;
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;
    @Column(name = "REF_OPERATION")
    private Long refOperation;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Column(name = "UNITE_OPERATION")
    private Short uniteOperation;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;

    public Documents() {
    }

    public Documents(DocumentsPK documentsPK) {
        this.documentsPK = documentsPK;
    }

    public Documents(short numLigne, String referenceFichierJoint, String pathAnnee, String pathMois) {
        this.documentsPK = new DocumentsPK(numLigne, referenceFichierJoint, pathAnnee, pathMois);
    }

    public DocumentsPK getDocumentsPK() {
        return documentsPK;
    }

    public void setDocumentsPK(DocumentsPK documentsPK) {
        this.documentsPK = documentsPK;
    }

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public Long getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Long refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Short getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Short uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Long numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentsPK != null ? documentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documents)) {
            return false;
        }
        Documents other = (Documents) object;
        if ((this.documentsPK == null && other.documentsPK != null) || (this.documentsPK != null && !this.documentsPK.equals(other.documentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.gen.Documents[ documentsPK=" + documentsPK + " ]";
    }
    
}
