/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.domi;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "IMAGE_DETAIL_P_DEPOT", catalog = "", schema = "DOMI")
@NamedQueries({
    @NamedQuery(name = "ImageDetailPDepot.findAll", query = "SELECT i FROM ImageDetailPDepot i")})
public class ImageDetailPDepot implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImageDetailPDepotPK imageDetailPDepotPK;
    @Column(name = "CODE_UNITE")
    private Short codeUnite;
    @Column(name = "CODE_NGP")
    private Long codeNgp;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_DVS_NGP")
    private BigDecimal montantDvsNgp;
    @Column(name = "QTE_NGP")
    private Long qteNgp;
    @Size(max = 1)
    @Column(name = "TEST_RESERVE")
    private String testReserve;
    @Column(name = "CODE_PAYS_ORIG_NGP")
    private Short codePaysOrigNgp;

    public ImageDetailPDepot() {
    }

    public ImageDetailPDepot(ImageDetailPDepotPK imageDetailPDepotPK) {
        this.imageDetailPDepotPK = imageDetailPDepotPK;
    }

    public ImageDetailPDepot(int numRbq, int refContrat, Date dateContrat, short uniteContrat) {
        this.imageDetailPDepotPK = new ImageDetailPDepotPK(numRbq, refContrat, dateContrat, uniteContrat);
    }

    public ImageDetailPDepotPK getImageDetailPDepotPK() {
        return imageDetailPDepotPK;
    }

    public void setImageDetailPDepotPK(ImageDetailPDepotPK imageDetailPDepotPK) {
        this.imageDetailPDepotPK = imageDetailPDepotPK;
    }

    public Short getCodeUnite() {
        return codeUnite;
    }

    public void setCodeUnite(Short codeUnite) {
        this.codeUnite = codeUnite;
    }

    public Long getCodeNgp() {
        return codeNgp;
    }

    public void setCodeNgp(Long codeNgp) {
        this.codeNgp = codeNgp;
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

    public BigDecimal getMontantDvsNgp() {
        return montantDvsNgp;
    }

    public void setMontantDvsNgp(BigDecimal montantDvsNgp) {
        this.montantDvsNgp = montantDvsNgp;
    }

    public Long getQteNgp() {
        return qteNgp;
    }

    public void setQteNgp(Long qteNgp) {
        this.qteNgp = qteNgp;
    }

    public String getTestReserve() {
        return testReserve;
    }

    public void setTestReserve(String testReserve) {
        this.testReserve = testReserve;
    }

    public Short getCodePaysOrigNgp() {
        return codePaysOrigNgp;
    }

    public void setCodePaysOrigNgp(Short codePaysOrigNgp) {
        this.codePaysOrigNgp = codePaysOrigNgp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imageDetailPDepotPK != null ? imageDetailPDepotPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageDetailPDepot)) {
            return false;
        }
        ImageDetailPDepot other = (ImageDetailPDepot) object;
        if ((this.imageDetailPDepotPK == null && other.imageDetailPDepotPK != null) || (this.imageDetailPDepotPK != null && !this.imageDetailPDepotPK.equals(other.imageDetailPDepotPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.ImageDetailPDepot[ imageDetailPDepotPK=" + imageDetailPDepotPK + " ]";
    }
    
}
