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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "DOC_DOSSIER_SOR", catalog = "", schema = "DOMI")
@NamedQueries({
    @NamedQuery(name = "DocDossierSor.findAll", query = "SELECT d FROM DocDossierSor d")})
public class DocDossierSor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocDossierSorPK docDossierSorPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TITRE")
    private short codeTitre;
    @Column(name = "NUM_DEPOT")
    private Integer numDepot;
    @Column(name = "DATE_DEPOT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDepot;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;
    @Size(max = 35)
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Column(name = "DATE_DOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDoc;
    @Size(max = 5)
    @Column(name = "EXTENTION")
    private String extention;
    @Column(name = "GRP_IMAGE")
    private Short grpImage;
    @Size(max = 4)
    @Column(name = "PATH_ANNEE_TTN")
    private String pathAnneeTtn;
    @Size(max = 2)
    @Column(name = "PATH_MOIS")
    private String pathMois;

    public DocDossierSor() {
    }

    public DocDossierSor(DocDossierSorPK docDossierSorPK) {
        this.docDossierSorPK = docDossierSorPK;
    }

    public DocDossierSor(DocDossierSorPK docDossierSorPK, short codeTitre) {
        this.docDossierSorPK = docDossierSorPK;
        this.codeTitre = codeTitre;
    }

    public DocDossierSor(int refContrat, short uniteContrat, Date dateContrat, short codePiece, String referenceFichierJoint) {
        this.docDossierSorPK = new DocDossierSorPK(refContrat, uniteContrat, dateContrat, codePiece, referenceFichierJoint);
    }

    public DocDossierSorPK getDocDossierSorPK() {
        return docDossierSorPK;
    }

    public void setDocDossierSorPK(DocDossierSorPK docDossierSorPK) {
        this.docDossierSorPK = docDossierSorPK;
    }

    public short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Integer getNumDepot() {
        return numDepot;
    }

    public void setNumDepot(Integer numDepot) {
        this.numDepot = numDepot;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public Integer getNumDom() {
        return numDom;
    }

    public void setNumDom(Integer numDom) {
        this.numDom = numDom;
    }

    public Date getDateDom() {
        return dateDom;
    }

    public void setDateDom(Date dateDom) {
        this.dateDom = dateDom;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDateDoc() {
        return dateDoc;
    }

    public void setDateDoc(Date dateDoc) {
        this.dateDoc = dateDoc;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public Short getGrpImage() {
        return grpImage;
    }

    public void setGrpImage(Short grpImage) {
        this.grpImage = grpImage;
    }

    public String getPathAnneeTtn() {
        return pathAnneeTtn;
    }

    public void setPathAnneeTtn(String pathAnneeTtn) {
        this.pathAnneeTtn = pathAnneeTtn;
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
        hash += (docDossierSorPK != null ? docDossierSorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocDossierSor)) {
            return false;
        }
        DocDossierSor other = (DocDossierSor) object;
        if ((this.docDossierSorPK == null && other.docDossierSorPK != null) || (this.docDossierSorPK != null && !this.docDossierSorPK.equals(other.docDossierSorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.DocDossierSor[ docDossierSorPK=" + docDossierSorPK + " ]";
    }
    
}
