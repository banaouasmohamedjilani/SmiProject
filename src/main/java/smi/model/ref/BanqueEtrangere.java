/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "BANQUE_ETRANGERE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "BanqueEtrangere.findAll", query = "SELECT b FROM BanqueEtrangere b")})
public class BanqueEtrangere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_BNQ_ETR")
    private Integer codeBnqEtr;
    @Size(max = 100)
    @Column(name = "LIB_LONG")
    private String libLong;
    @Size(max = 25)
    @Column(name = "LIB_COURT")
    private String libCourt;
    @Column(name = "CODE_PAYS")
    private Short codePays;
    @Size(max = 1)
    @Column(name = "CORRESP")
    private String corresp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PLAFOND_LC")
    private BigDecimal plafondLc;
    @Column(name = "DATE_LC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLc;
    @Column(name = "DUREE_LC")
    private Short dureeLc;
    @Column(name = "PLAFOND_LCHC")
    private BigDecimal plafondLchc;
    @Column(name = "DATE_LCHC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLchc;
    @Column(name = "DUREE_LCHC")
    private Short dureeLchc;
    @Column(name = "PLAFOND_LCHT")
    private BigDecimal plafondLcht;
    @Column(name = "DATE_LCHT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLcht;
    @Column(name = "DUREE_LCHT")
    private Short dureeLcht;
    @Column(name = "PLAFOND_LTCT")
    private BigDecimal plafondLtct;
    @Column(name = "DATE_LTCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLtct;
    @Column(name = "DUREE_LTCT")
    private Short dureeLtct;
    @Column(name = "PLAFOND_LTMT")
    private BigDecimal plafondLtmt;
    @Column(name = "DATE_LTMT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLtmt;
    @Column(name = "DUREE_LTMT")
    private Short dureeLtmt;
    @Column(name = "UTILISE_LC")
    private BigDecimal utiliseLc;
    @Column(name = "UTILISE_LCHC")
    private BigDecimal utiliseLchc;
    @Column(name = "UTILISE_LCHT")
    private BigDecimal utiliseLcht;
    @Column(name = "UTILISE_LTCT")
    private BigDecimal utiliseLtct;
    @Column(name = "UTILISE_LTMT")
    private BigDecimal utiliseLtmt;
    @Column(name = "DELAI_REGLEMENT")
    private Short delaiReglement;
    @Size(max = 60)
    @Column(name = "LIB")
    private String lib;
    @Size(max = 1)
    @Column(name = "UMA")
    private String uma;
    @Column(name = "COMPTE_MDCAA")
    private Short compteMdcaa;
    @Column(name = "SOUS_COMPTE_MDCAA")
    private Integer sousCompteMdcaa;
    @Column(name = "COMPTE_RECOUV_ETR")
    private Short compteRecouvEtr;
    @Column(name = "SOUS_COMPTE_RECOUV_ETR")
    private Integer sousCompteRecouvEtr;
    @Column(name = "COMPTE_RECOUV_ETR_ESC")
    private Short compteRecouvEtrEsc;
    @Column(name = "SOUS_COMPTE_RECOUV_ETR_ESC")
    private Integer sousCompteRecouvEtrEsc;
    @Size(max = 1)
    @Column(name = "DELAI_REG_JOURS_OUV")
    private String delaiRegJoursOuv;
    @Column(name = "DELAI_REGLEMENT_BNQ")
    private Short delaiReglementBnq;
    @Column(name = "AGC_CPT_MDCAA")
    private Short agcCptMdcaa;
    @Column(name = "AGC_CPT_RECOUV_ETR")
    private Short agcCptRecouvEtr;
    @Column(name = "AGC_CPT_RECOUV_ETR_ESC")
    private Short agcCptRecouvEtrEsc;
    @Size(max = 13)
    @Column(name = "NUM_SWIFT_AGENCE_MERE")
    private String numSwiftAgenceMere;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "banqueEtrangere")
    private List<AgenceEtrangere> agenceEtrangereList;

    public BanqueEtrangere() {
    }

    public BanqueEtrangere(Integer codeBnqEtr) {
        this.codeBnqEtr = codeBnqEtr;
    }

    public Integer getCodeBnqEtr() {
        return codeBnqEtr;
    }

    public void setCodeBnqEtr(Integer codeBnqEtr) {
        this.codeBnqEtr = codeBnqEtr;
    }

    public String getLibLong() {
        return libLong;
    }

    public void setLibLong(String libLong) {
        this.libLong = libLong;
    }

    public String getLibCourt() {
        return libCourt;
    }

    public void setLibCourt(String libCourt) {
        this.libCourt = libCourt;
    }

    public Short getCodePays() {
        return codePays;
    }

    public void setCodePays(Short codePays) {
        this.codePays = codePays;
    }

    public String getCorresp() {
        return corresp;
    }

    public void setCorresp(String corresp) {
        this.corresp = corresp;
    }

    public BigDecimal getPlafondLc() {
        return plafondLc;
    }

    public void setPlafondLc(BigDecimal plafondLc) {
        this.plafondLc = plafondLc;
    }

    public Date getDateLc() {
        return dateLc;
    }

    public void setDateLc(Date dateLc) {
        this.dateLc = dateLc;
    }

    public Short getDureeLc() {
        return dureeLc;
    }

    public void setDureeLc(Short dureeLc) {
        this.dureeLc = dureeLc;
    }

    public BigDecimal getPlafondLchc() {
        return plafondLchc;
    }

    public void setPlafondLchc(BigDecimal plafondLchc) {
        this.plafondLchc = plafondLchc;
    }

    public Date getDateLchc() {
        return dateLchc;
    }

    public void setDateLchc(Date dateLchc) {
        this.dateLchc = dateLchc;
    }

    public Short getDureeLchc() {
        return dureeLchc;
    }

    public void setDureeLchc(Short dureeLchc) {
        this.dureeLchc = dureeLchc;
    }

    public BigDecimal getPlafondLcht() {
        return plafondLcht;
    }

    public void setPlafondLcht(BigDecimal plafondLcht) {
        this.plafondLcht = plafondLcht;
    }

    public Date getDateLcht() {
        return dateLcht;
    }

    public void setDateLcht(Date dateLcht) {
        this.dateLcht = dateLcht;
    }

    public Short getDureeLcht() {
        return dureeLcht;
    }

    public void setDureeLcht(Short dureeLcht) {
        this.dureeLcht = dureeLcht;
    }

    public BigDecimal getPlafondLtct() {
        return plafondLtct;
    }

    public void setPlafondLtct(BigDecimal plafondLtct) {
        this.plafondLtct = plafondLtct;
    }

    public Date getDateLtct() {
        return dateLtct;
    }

    public void setDateLtct(Date dateLtct) {
        this.dateLtct = dateLtct;
    }

    public Short getDureeLtct() {
        return dureeLtct;
    }

    public void setDureeLtct(Short dureeLtct) {
        this.dureeLtct = dureeLtct;
    }

    public BigDecimal getPlafondLtmt() {
        return plafondLtmt;
    }

    public void setPlafondLtmt(BigDecimal plafondLtmt) {
        this.plafondLtmt = plafondLtmt;
    }

    public Date getDateLtmt() {
        return dateLtmt;
    }

    public void setDateLtmt(Date dateLtmt) {
        this.dateLtmt = dateLtmt;
    }

    public Short getDureeLtmt() {
        return dureeLtmt;
    }

    public void setDureeLtmt(Short dureeLtmt) {
        this.dureeLtmt = dureeLtmt;
    }

    public BigDecimal getUtiliseLc() {
        return utiliseLc;
    }

    public void setUtiliseLc(BigDecimal utiliseLc) {
        this.utiliseLc = utiliseLc;
    }

    public BigDecimal getUtiliseLchc() {
        return utiliseLchc;
    }

    public void setUtiliseLchc(BigDecimal utiliseLchc) {
        this.utiliseLchc = utiliseLchc;
    }

    public BigDecimal getUtiliseLcht() {
        return utiliseLcht;
    }

    public void setUtiliseLcht(BigDecimal utiliseLcht) {
        this.utiliseLcht = utiliseLcht;
    }

    public BigDecimal getUtiliseLtct() {
        return utiliseLtct;
    }

    public void setUtiliseLtct(BigDecimal utiliseLtct) {
        this.utiliseLtct = utiliseLtct;
    }

    public BigDecimal getUtiliseLtmt() {
        return utiliseLtmt;
    }

    public void setUtiliseLtmt(BigDecimal utiliseLtmt) {
        this.utiliseLtmt = utiliseLtmt;
    }

    public Short getDelaiReglement() {
        return delaiReglement;
    }

    public void setDelaiReglement(Short delaiReglement) {
        this.delaiReglement = delaiReglement;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getUma() {
        return uma;
    }

    public void setUma(String uma) {
        this.uma = uma;
    }

    public Short getCompteMdcaa() {
        return compteMdcaa;
    }

    public void setCompteMdcaa(Short compteMdcaa) {
        this.compteMdcaa = compteMdcaa;
    }

    public Integer getSousCompteMdcaa() {
        return sousCompteMdcaa;
    }

    public void setSousCompteMdcaa(Integer sousCompteMdcaa) {
        this.sousCompteMdcaa = sousCompteMdcaa;
    }

    public Short getCompteRecouvEtr() {
        return compteRecouvEtr;
    }

    public void setCompteRecouvEtr(Short compteRecouvEtr) {
        this.compteRecouvEtr = compteRecouvEtr;
    }

    public Integer getSousCompteRecouvEtr() {
        return sousCompteRecouvEtr;
    }

    public void setSousCompteRecouvEtr(Integer sousCompteRecouvEtr) {
        this.sousCompteRecouvEtr = sousCompteRecouvEtr;
    }

    public Short getCompteRecouvEtrEsc() {
        return compteRecouvEtrEsc;
    }

    public void setCompteRecouvEtrEsc(Short compteRecouvEtrEsc) {
        this.compteRecouvEtrEsc = compteRecouvEtrEsc;
    }

    public Integer getSousCompteRecouvEtrEsc() {
        return sousCompteRecouvEtrEsc;
    }

    public void setSousCompteRecouvEtrEsc(Integer sousCompteRecouvEtrEsc) {
        this.sousCompteRecouvEtrEsc = sousCompteRecouvEtrEsc;
    }

    public String getDelaiRegJoursOuv() {
        return delaiRegJoursOuv;
    }

    public void setDelaiRegJoursOuv(String delaiRegJoursOuv) {
        this.delaiRegJoursOuv = delaiRegJoursOuv;
    }

    public Short getDelaiReglementBnq() {
        return delaiReglementBnq;
    }

    public void setDelaiReglementBnq(Short delaiReglementBnq) {
        this.delaiReglementBnq = delaiReglementBnq;
    }

    public Short getAgcCptMdcaa() {
        return agcCptMdcaa;
    }

    public void setAgcCptMdcaa(Short agcCptMdcaa) {
        this.agcCptMdcaa = agcCptMdcaa;
    }

    public Short getAgcCptRecouvEtr() {
        return agcCptRecouvEtr;
    }

    public void setAgcCptRecouvEtr(Short agcCptRecouvEtr) {
        this.agcCptRecouvEtr = agcCptRecouvEtr;
    }

    public Short getAgcCptRecouvEtrEsc() {
        return agcCptRecouvEtrEsc;
    }

    public void setAgcCptRecouvEtrEsc(Short agcCptRecouvEtrEsc) {
        this.agcCptRecouvEtrEsc = agcCptRecouvEtrEsc;
    }

    public String getNumSwiftAgenceMere() {
        return numSwiftAgenceMere;
    }

    public void setNumSwiftAgenceMere(String numSwiftAgenceMere) {
        this.numSwiftAgenceMere = numSwiftAgenceMere;
    }

    public List<AgenceEtrangere> getAgenceEtrangereList() {
        return agenceEtrangereList;
    }

    public void setAgenceEtrangereList(List<AgenceEtrangere> agenceEtrangereList) {
        this.agenceEtrangereList = agenceEtrangereList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeBnqEtr != null ? codeBnqEtr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BanqueEtrangere)) {
            return false;
        }
        BanqueEtrangere other = (BanqueEtrangere) object;
        if ((this.codeBnqEtr == null && other.codeBnqEtr != null) || (this.codeBnqEtr != null && !this.codeBnqEtr.equals(other.codeBnqEtr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.BanqueEtrangere[ codeBnqEtr=" + codeBnqEtr + " ]";
    }
    
}
