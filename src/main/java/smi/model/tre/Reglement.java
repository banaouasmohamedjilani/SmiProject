/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.tre;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "REGLEMENT", catalog = "", schema = "TRE")
@NamedQueries({
    @NamedQuery(name = "Reglement.findAll", query = "SELECT r FROM Reglement r")})
public class Reglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReglementPK reglementPK;
    @Column(name = "DATE_JOURNEE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJournee;
    @Size(max = 16)
    @Column(name = "REF_ORDRE")
    private String refOrdre;
    @Column(name = "DATE_ORDRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrdre;
    @Column(name = "CODE_DEVISE_ORDRE")
    private Short codeDeviseOrdre;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Column(name = "COURS_CONVERSION")
    private BigDecimal coursConversion;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Short typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Column(name = "CODE_AGENCE_BCT")
    private Short codeAgenceBct;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;
    @Column(name = "CLE_RIB")
    private Short cleRib;
    @Column(name = "TAUX_COMPTE")
    private BigDecimal tauxCompte;
    @Column(name = "MNT_COMPTE")
    private BigDecimal mntCompte;
    @Column(name = "CODE_AGENCE_BCT_PROFESS")
    private Short codeAgenceBctProfess;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE_PROFESS")
    private String racineCompteProfess;
    @Column(name = "CLE_RIB_PROFESS")
    private Short cleRibProfess;
    @Column(name = "TAUX_COMPTE_PROFESS")
    private BigDecimal tauxCompteProfess;
    @Column(name = "MNT_COMPTE_PROFESS")
    private BigDecimal mntCompteProfess;
    @Size(max = 35)
    @Column(name = "NOM_DONNEUR_ORDRE")
    private String nomDonneurOrdre;
    @Size(max = 35)
    @Column(name = "ADR1_DONNEUR_ORDRE")
    private String adr1DonneurOrdre;
    @Size(max = 35)
    @Column(name = "ADR2_DONNEUR_ORDRE")
    private String adr2DonneurOrdre;
    @Column(name = "CODE_PAYS_DO")
    private Short codePaysDo;
    @Column(name = "CODE_POSTAL_DO")
    private Short codePostalDo;
    @Size(max = 30)
    @Column(name = "LIBELLE_POSTAL_DO")
    private String libellePostalDo;
    @Size(max = 1)
    @Column(name = "BANQUE_NEGOCIATION")
    private String banqueNegociation;
    @Column(name = "MNT_NEGOCIATION")
    private BigDecimal mntNegociation;
    @Column(name = "MNT_NEGOCIATION_BAQ")
    private BigDecimal mntNegociationBaq;
    @Column(name = "COURS_NEGOCIATION")
    private BigDecimal coursNegociation;
    @Size(max = 1)
    @Column(name = "FINANCEMENT")
    private String financement;
    @Column(name = "MNT_FINANCEMENT")
    private BigDecimal mntFinancement;
    @Size(max = 20)
    @Column(name = "REF_FINANCEMENT")
    private String refFinancement;
    @Size(max = 1)
    @Column(name = "ACHAT_A_TERME")
    private String achatATerme;
    @Column(name = "MNT_ACHAT_A_TERME")
    private BigDecimal mntAchatATerme;
    @Column(name = "COURS_ACHAT_A_TERME")
    private BigDecimal coursAchatATerme;
    @Size(max = 35)
    @Column(name = "NOM_BENEFICIAIRE")
    private String nomBeneficiaire;
    @Size(max = 35)
    @Column(name = "ADRESSE_BENEFICIAIRE")
    private String adresseBeneficiaire;
    @Size(max = 35)
    @Column(name = "ADRESSE_BENEFICIAIRE2")
    private String adresseBeneficiaire2;
    @Size(max = 35)
    @Column(name = "ADRESSE_BENEFICIAIRE3")
    private String adresseBeneficiaire3;
    @Size(max = 34)
    @Column(name = "COMPTE_BENEFICIAIRE")
    private String compteBeneficiaire;
    @Size(max = 1)
    @Column(name = "COMPTE_BENEF_DINARISE")
    private String compteBenefDinarise;
    @Column(name = "CODE_PAYS_BENEF")
    private Short codePaysBenef;
    @Size(max = 1)
    @Column(name = "TYPE_BNQ_BENEF")
    private String typeBnqBenef;
    @Column(name = "CODE_BNQ_BENEF")
    private Integer codeBnqBenef;
    @Column(name = "CODE_AGC_BNQ_BENEF")
    private Integer codeAgcBnqBenef;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_BENEF")
    private String nomBnqBenef;
    @Column(name = "CODE_BNQ_DEST")
    private Integer codeBnqDest;
    @Column(name = "CODE_AGC_BNQ_DEST")
    private Short codeAgcBnqDest;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_DEST")
    private String nomBnqDest;
    @Column(name = "CODE_BNQ_EXP")
    private Integer codeBnqExp;
    @Column(name = "CODE_AGC_BNQ_EXP")
    private Short codeAgcBnqExp;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_EXP")
    private String nomBnqExp;
    @Column(name = "CODE_BNQ_INTER")
    private Integer codeBnqInter;
    @Column(name = "CODE_AGC_BNQ_INTER")
    private Short codeAgcBnqInter;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_INTER")
    private String nomBnqInter;
    @Column(name = "CODE_BNQ_CRP")
    private Integer codeBnqCrp;
    @Column(name = "CODE_AGC_BNQ_CRP")
    private Short codeAgcBnqCrp;
    @Column(name = "DATE_ACHAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAchat;
    @Column(name = "DATE_CREDIT_CRP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreditCrp;
    @Column(name = "DATE_DEBIT_CLIENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebitClient;
    @Column(name = "MNT_COMMISSION")
    private BigDecimal mntCommission;
    @Column(name = "MNT_BLOCAGE")
    private BigDecimal mntBlocage;
    @Size(max = 1)
    @Column(name = "DOSSIER_WEB")
    private String dossierWeb;
    @Size(max = 1)
    @Column(name = "TRAITE")
    private String traite;
    @Size(max = 1)
    @Column(name = "ETAT_DOSSIER")
    private String etatDossier;
    @Column(name = "COURS")
    private BigDecimal cours;
    @Size(max = 8)
    @Column(name = "REF_BLOCAGE")
    private String refBlocage;
    @Column(name = "COMPTE_COM")
    private Short compteCom;
    @OneToMany(mappedBy = "reglement")
    private List<TitreBpMvt> titreBpMvtList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reglement")
    private List<DocOperationApportes> docOperationApportesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reglement")
    private List<TitreBp> titreBpList;

    public Reglement() {
    }

    public Reglement(ReglementPK reglementPK) {
        this.reglementPK = reglementPK;
    }

    public Reglement(long numDossier, Date dateDossier, String typeDossier) {
        this.reglementPK = new ReglementPK(numDossier, dateDossier, typeDossier);
    }

    public ReglementPK getReglementPK() {
        return reglementPK;
    }

    public void setReglementPK(ReglementPK reglementPK) {
        this.reglementPK = reglementPK;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public String getRefOrdre() {
        return refOrdre;
    }

    public void setRefOrdre(String refOrdre) {
        this.refOrdre = refOrdre;
    }

    public Date getDateOrdre() {
        return dateOrdre;
    }

    public void setDateOrdre(Date dateOrdre) {
        this.dateOrdre = dateOrdre;
    }

    public Short getCodeDeviseOrdre() {
        return codeDeviseOrdre;
    }

    public void setCodeDeviseOrdre(Short codeDeviseOrdre) {
        this.codeDeviseOrdre = codeDeviseOrdre;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public BigDecimal getCoursConversion() {
        return coursConversion;
    }

    public void setCoursConversion(BigDecimal coursConversion) {
        this.coursConversion = coursConversion;
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

    public Short getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(Short codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    public Short getCleRib() {
        return cleRib;
    }

    public void setCleRib(Short cleRib) {
        this.cleRib = cleRib;
    }

    public BigDecimal getTauxCompte() {
        return tauxCompte;
    }

    public void setTauxCompte(BigDecimal tauxCompte) {
        this.tauxCompte = tauxCompte;
    }

    public BigDecimal getMntCompte() {
        return mntCompte;
    }

    public void setMntCompte(BigDecimal mntCompte) {
        this.mntCompte = mntCompte;
    }

    public Short getCodeAgenceBctProfess() {
        return codeAgenceBctProfess;
    }

    public void setCodeAgenceBctProfess(Short codeAgenceBctProfess) {
        this.codeAgenceBctProfess = codeAgenceBctProfess;
    }

    public String getRacineCompteProfess() {
        return racineCompteProfess;
    }

    public void setRacineCompteProfess(String racineCompteProfess) {
        this.racineCompteProfess = racineCompteProfess;
    }

    public Short getCleRibProfess() {
        return cleRibProfess;
    }

    public void setCleRibProfess(Short cleRibProfess) {
        this.cleRibProfess = cleRibProfess;
    }

    public BigDecimal getTauxCompteProfess() {
        return tauxCompteProfess;
    }

    public void setTauxCompteProfess(BigDecimal tauxCompteProfess) {
        this.tauxCompteProfess = tauxCompteProfess;
    }

    public BigDecimal getMntCompteProfess() {
        return mntCompteProfess;
    }

    public void setMntCompteProfess(BigDecimal mntCompteProfess) {
        this.mntCompteProfess = mntCompteProfess;
    }

    public String getNomDonneurOrdre() {
        return nomDonneurOrdre;
    }

    public void setNomDonneurOrdre(String nomDonneurOrdre) {
        this.nomDonneurOrdre = nomDonneurOrdre;
    }

    public String getAdr1DonneurOrdre() {
        return adr1DonneurOrdre;
    }

    public void setAdr1DonneurOrdre(String adr1DonneurOrdre) {
        this.adr1DonneurOrdre = adr1DonneurOrdre;
    }

    public String getAdr2DonneurOrdre() {
        return adr2DonneurOrdre;
    }

    public void setAdr2DonneurOrdre(String adr2DonneurOrdre) {
        this.adr2DonneurOrdre = adr2DonneurOrdre;
    }

    public Short getCodePaysDo() {
        return codePaysDo;
    }

    public void setCodePaysDo(Short codePaysDo) {
        this.codePaysDo = codePaysDo;
    }

    public Short getCodePostalDo() {
        return codePostalDo;
    }

    public void setCodePostalDo(Short codePostalDo) {
        this.codePostalDo = codePostalDo;
    }

    public String getLibellePostalDo() {
        return libellePostalDo;
    }

    public void setLibellePostalDo(String libellePostalDo) {
        this.libellePostalDo = libellePostalDo;
    }

    public String getBanqueNegociation() {
        return banqueNegociation;
    }

    public void setBanqueNegociation(String banqueNegociation) {
        this.banqueNegociation = banqueNegociation;
    }

    public BigDecimal getMntNegociation() {
        return mntNegociation;
    }

    public void setMntNegociation(BigDecimal mntNegociation) {
        this.mntNegociation = mntNegociation;
    }

    public BigDecimal getMntNegociationBaq() {
        return mntNegociationBaq;
    }

    public void setMntNegociationBaq(BigDecimal mntNegociationBaq) {
        this.mntNegociationBaq = mntNegociationBaq;
    }

    public BigDecimal getCoursNegociation() {
        return coursNegociation;
    }

    public void setCoursNegociation(BigDecimal coursNegociation) {
        this.coursNegociation = coursNegociation;
    }

    public String getFinancement() {
        return financement;
    }

    public void setFinancement(String financement) {
        this.financement = financement;
    }

    public BigDecimal getMntFinancement() {
        return mntFinancement;
    }

    public void setMntFinancement(BigDecimal mntFinancement) {
        this.mntFinancement = mntFinancement;
    }

    public String getRefFinancement() {
        return refFinancement;
    }

    public void setRefFinancement(String refFinancement) {
        this.refFinancement = refFinancement;
    }

    public String getAchatATerme() {
        return achatATerme;
    }

    public void setAchatATerme(String achatATerme) {
        this.achatATerme = achatATerme;
    }

    public BigDecimal getMntAchatATerme() {
        return mntAchatATerme;
    }

    public void setMntAchatATerme(BigDecimal mntAchatATerme) {
        this.mntAchatATerme = mntAchatATerme;
    }

    public BigDecimal getCoursAchatATerme() {
        return coursAchatATerme;
    }

    public void setCoursAchatATerme(BigDecimal coursAchatATerme) {
        this.coursAchatATerme = coursAchatATerme;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getAdresseBeneficiaire() {
        return adresseBeneficiaire;
    }

    public void setAdresseBeneficiaire(String adresseBeneficiaire) {
        this.adresseBeneficiaire = adresseBeneficiaire;
    }

    public String getAdresseBeneficiaire2() {
        return adresseBeneficiaire2;
    }

    public void setAdresseBeneficiaire2(String adresseBeneficiaire2) {
        this.adresseBeneficiaire2 = adresseBeneficiaire2;
    }

    public String getAdresseBeneficiaire3() {
        return adresseBeneficiaire3;
    }

    public void setAdresseBeneficiaire3(String adresseBeneficiaire3) {
        this.adresseBeneficiaire3 = adresseBeneficiaire3;
    }

    public String getCompteBeneficiaire() {
        return compteBeneficiaire;
    }

    public void setCompteBeneficiaire(String compteBeneficiaire) {
        this.compteBeneficiaire = compteBeneficiaire;
    }

    public String getCompteBenefDinarise() {
        return compteBenefDinarise;
    }

    public void setCompteBenefDinarise(String compteBenefDinarise) {
        this.compteBenefDinarise = compteBenefDinarise;
    }

    public Short getCodePaysBenef() {
        return codePaysBenef;
    }

    public void setCodePaysBenef(Short codePaysBenef) {
        this.codePaysBenef = codePaysBenef;
    }

    public String getTypeBnqBenef() {
        return typeBnqBenef;
    }

    public void setTypeBnqBenef(String typeBnqBenef) {
        this.typeBnqBenef = typeBnqBenef;
    }

    public Integer getCodeBnqBenef() {
        return codeBnqBenef;
    }

    public void setCodeBnqBenef(Integer codeBnqBenef) {
        this.codeBnqBenef = codeBnqBenef;
    }

    public Integer getCodeAgcBnqBenef() {
        return codeAgcBnqBenef;
    }

    public void setCodeAgcBnqBenef(Integer codeAgcBnqBenef) {
        this.codeAgcBnqBenef = codeAgcBnqBenef;
    }

    public String getNomBnqBenef() {
        return nomBnqBenef;
    }

    public void setNomBnqBenef(String nomBnqBenef) {
        this.nomBnqBenef = nomBnqBenef;
    }

    public Integer getCodeBnqDest() {
        return codeBnqDest;
    }

    public void setCodeBnqDest(Integer codeBnqDest) {
        this.codeBnqDest = codeBnqDest;
    }

    public Short getCodeAgcBnqDest() {
        return codeAgcBnqDest;
    }

    public void setCodeAgcBnqDest(Short codeAgcBnqDest) {
        this.codeAgcBnqDest = codeAgcBnqDest;
    }

    public String getNomBnqDest() {
        return nomBnqDest;
    }

    public void setNomBnqDest(String nomBnqDest) {
        this.nomBnqDest = nomBnqDest;
    }

    public Integer getCodeBnqExp() {
        return codeBnqExp;
    }

    public void setCodeBnqExp(Integer codeBnqExp) {
        this.codeBnqExp = codeBnqExp;
    }

    public Short getCodeAgcBnqExp() {
        return codeAgcBnqExp;
    }

    public void setCodeAgcBnqExp(Short codeAgcBnqExp) {
        this.codeAgcBnqExp = codeAgcBnqExp;
    }

    public String getNomBnqExp() {
        return nomBnqExp;
    }

    public void setNomBnqExp(String nomBnqExp) {
        this.nomBnqExp = nomBnqExp;
    }

    public Integer getCodeBnqInter() {
        return codeBnqInter;
    }

    public void setCodeBnqInter(Integer codeBnqInter) {
        this.codeBnqInter = codeBnqInter;
    }

    public Short getCodeAgcBnqInter() {
        return codeAgcBnqInter;
    }

    public void setCodeAgcBnqInter(Short codeAgcBnqInter) {
        this.codeAgcBnqInter = codeAgcBnqInter;
    }

    public String getNomBnqInter() {
        return nomBnqInter;
    }

    public void setNomBnqInter(String nomBnqInter) {
        this.nomBnqInter = nomBnqInter;
    }

    public Integer getCodeBnqCrp() {
        return codeBnqCrp;
    }

    public void setCodeBnqCrp(Integer codeBnqCrp) {
        this.codeBnqCrp = codeBnqCrp;
    }

    public Short getCodeAgcBnqCrp() {
        return codeAgcBnqCrp;
    }

    public void setCodeAgcBnqCrp(Short codeAgcBnqCrp) {
        this.codeAgcBnqCrp = codeAgcBnqCrp;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Date getDateCreditCrp() {
        return dateCreditCrp;
    }

    public void setDateCreditCrp(Date dateCreditCrp) {
        this.dateCreditCrp = dateCreditCrp;
    }

    public Date getDateDebitClient() {
        return dateDebitClient;
    }

    public void setDateDebitClient(Date dateDebitClient) {
        this.dateDebitClient = dateDebitClient;
    }

    public BigDecimal getMntCommission() {
        return mntCommission;
    }

    public void setMntCommission(BigDecimal mntCommission) {
        this.mntCommission = mntCommission;
    }

    public BigDecimal getMntBlocage() {
        return mntBlocage;
    }

    public void setMntBlocage(BigDecimal mntBlocage) {
        this.mntBlocage = mntBlocage;
    }

    public String getDossierWeb() {
        return dossierWeb;
    }

    public void setDossierWeb(String dossierWeb) {
        this.dossierWeb = dossierWeb;
    }

    public String getTraite() {
        return traite;
    }

    public void setTraite(String traite) {
        this.traite = traite;
    }

    public String getEtatDossier() {
        return etatDossier;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
    }

    public BigDecimal getCours() {
        return cours;
    }

    public void setCours(BigDecimal cours) {
        this.cours = cours;
    }

    public String getRefBlocage() {
        return refBlocage;
    }

    public void setRefBlocage(String refBlocage) {
        this.refBlocage = refBlocage;
    }

    public Short getCompteCom() {
        return compteCom;
    }

    public void setCompteCom(Short compteCom) {
        this.compteCom = compteCom;
    }

    public List<TitreBpMvt> getTitreBpMvtList() {
        return titreBpMvtList;
    }

    public void setTitreBpMvtList(List<TitreBpMvt> titreBpMvtList) {
        this.titreBpMvtList = titreBpMvtList;
    }

    public List<DocOperationApportes> getDocOperationApportesList() {
        return docOperationApportesList;
    }

    public void setDocOperationApportesList(List<DocOperationApportes> docOperationApportesList) {
        this.docOperationApportesList = docOperationApportesList;
    }

    public List<TitreBp> getTitreBpList() {
        return titreBpList;
    }

    public void setTitreBpList(List<TitreBp> titreBpList) {
        this.titreBpList = titreBpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reglementPK != null ? reglementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reglement)) {
            return false;
        }
        Reglement other = (Reglement) object;
        if ((this.reglementPK == null && other.reglementPK != null) || (this.reglementPK != null && !this.reglementPK.equals(other.reglementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.tre.Reglement[ reglementPK=" + reglementPK + " ]";
    }
    
}
