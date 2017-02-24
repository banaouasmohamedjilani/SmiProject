/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.tre;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "DOC_OPERATION_APPORTES", catalog = "", schema = "TRE")
@NamedQueries({
    @NamedQuery(name = "DocOperationApportes.findAll", query = "SELECT d FROM DocOperationApportes d")})
public class DocOperationApportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocOperationApportesPK docOperationApportesPK;
    @Column(name = "CODE_TYPE_OPERATION")
    private Short codeTypeOperation;
    @Column(name = "CODE_DETAIL_OPERATION")
    private Short codeDetailOperation;
    @JoinColumns({
        @JoinColumn(name = "NUM_DOSSIER", referencedColumnName = "NUM_DOSSIER", insertable = false, updatable = false)
        , @JoinColumn(name = "DATE_DOSSIER", referencedColumnName = "DATE_DOSSIER", insertable = false, updatable = false)
        , @JoinColumn(name = "TYPE_DOSSIER", referencedColumnName = "TYPE_DOSSIER", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Reglement reglement;

    public DocOperationApportes() {
    }

    public DocOperationApportes(DocOperationApportesPK docOperationApportesPK) {
        this.docOperationApportesPK = docOperationApportesPK;
    }

    public DocOperationApportes(int numDossier, Date dateDossier, String typeDossier, short codeDocument) {
        this.docOperationApportesPK = new DocOperationApportesPK(numDossier, dateDossier, typeDossier, codeDocument);
    }

    public DocOperationApportesPK getDocOperationApportesPK() {
        return docOperationApportesPK;
    }

    public void setDocOperationApportesPK(DocOperationApportesPK docOperationApportesPK) {
        this.docOperationApportesPK = docOperationApportesPK;
    }

    public Short getCodeTypeOperation() {
        return codeTypeOperation;
    }

    public void setCodeTypeOperation(Short codeTypeOperation) {
        this.codeTypeOperation = codeTypeOperation;
    }

    public Short getCodeDetailOperation() {
        return codeDetailOperation;
    }

    public void setCodeDetailOperation(Short codeDetailOperation) {
        this.codeDetailOperation = codeDetailOperation;
    }

    public Reglement getReglement() {
        return reglement;
    }

    public void setReglement(Reglement reglement) {
        this.reglement = reglement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docOperationApportesPK != null ? docOperationApportesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocOperationApportes)) {
            return false;
        }
        DocOperationApportes other = (DocOperationApportes) object;
        if ((this.docOperationApportesPK == null && other.docOperationApportesPK != null) || (this.docOperationApportesPK != null && !this.docOperationApportesPK.equals(other.docOperationApportesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.DocOperationApportes[ docOperationApportesPK=" + docOperationApportesPK + " ]";
    }
    
}
