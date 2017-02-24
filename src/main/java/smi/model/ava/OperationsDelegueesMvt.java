/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ava;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "OPERATIONS_DELEGUEES_MVT", catalog = "", schema = "AVA")
@NamedQueries({
    @NamedQuery(name = "OperationsDelegueesMvt.findAll", query = "SELECT o FROM OperationsDelegueesMvt o")})
public class OperationsDelegueesMvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperationsDelegueesMvtPK operationsDelegueesMvtPK;
    @Column(name = "CODE_TYPE_DOS_AVA")
    private Short codeTypeDosAva;
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Short typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Size(max = 15)
    @Column(name = "TEL")
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 15)
    @Column(name = "FAX")
    private String fax;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    @Column(name = "CODE_PAYS_BCT")
    private Short codePaysBct;
    @Size(max = 3)
    @Column(name = "CODE_TYPE_MVT_AVA")
    private String codeTypeMvtAva;
    @Column(name = "CODE_AGENCE_CHANGER")
    private Short codeAgenceChanger;
    @Column(name = "DATE_SORT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSort;
    @Column(name = "DATE_ENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Column(name = "CODE_PAYS_DEST")
    private Short codePaysDest;
    @Column(name = "NUM_MVT_AS")
    private Integer numMvtAs;
    @Column(name = "ECHEANCE_AS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date echeanceAs;
    @Column(name = "DATE_BCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBct;
    @Column(name = "NUMERO_BCT")
    private Integer numeroBct;
    @Column(name = "MONTANT_AUTRE")
    private BigDecimal montantAutre;
    @Column(name = "NUMERO_DECLARATION")
    private Long numeroDeclaration;
    @Column(name = "DATE_DECLARATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeclaration;
    @Size(max = 3)
    @Column(name = "MODE_DE_PAYEMENT_BB_CHQ")
    private String modeDePayementBbChq;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;
    @Column(name = "NUM_MVT_AVA")
    private Integer numMvtAva;
    @Column(name = "DATE_MVT_AVA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMvtAva;
    @Column(name = "MNT_RAP")
    private BigDecimal mntRap;
    @Column(name = "MNT_RRV_RAV")
    private BigDecimal mntRrvRav;
    @Column(name = "MNT_AUTORISE")
    private BigDecimal mntAutorise;
    @Column(name = "MNT_CA")
    private BigDecimal mntCa;
    @Column(name = "MNT_MVT_AVA")
    private BigDecimal mntMvtAva;
    @Column(name = "MNT_RETROCESSION")
    private BigDecimal mntRetrocession;
    @Column(name = "MNT_UTILISE")
    private BigDecimal mntUtilise;
    @Column(name = "MNT_AVANCE")
    private BigDecimal mntAvance;
    @Column(name = "MNT_TOT_TITRE")
    private BigInteger mntTotTitre;
    @Size(max = 1)
    @Column(name = "CA_IMPORTATEUR")
    private String caImportateur;
    @Column(name = "MNT_CA_FISCAL")
    private BigDecimal mntCaFiscal;
    @Column(name = "SOLDE")
    private BigDecimal solde;
    @Column(name = "ECHEANCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date echeance;
    @Size(max = 2)
    @Column(name = "CODE_MODE_PAIEMENT")
    private String codeModePaiement;
    @Column(name = "TYPE_PIECE_BENEF")
    private Short typePieceBenef;
    @Size(max = 13)
    @Column(name = "NO_PIECE_BENEF")
    private String noPieceBenef;
    @Size(max = 100)
    @Column(name = "MOTIF_BLOCAGE")
    private String motifBlocage;
    @Size(max = 1)
    @Column(name = "ETAT_BLOCAGE")
    private String etatBlocage;
    @Column(name = "DATE_BLOCAGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBlocage;
    @Column(name = "DATE_DEBLOCAGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeblocage;
    @Size(max = 7)
    @Column(name = "REF_BCT")
    private String refBct;
    @Column(name = "DATE_ACCORD_BCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAccordBct;
    @Column(name = "DATE_CLOTURE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCloture;
    @Size(max = 100)
    @Column(name = "MOTIF_CLOTURE")
    private String motifCloture;
    @Size(max = 1)
    @Column(name = "ETAT_CLOTURE")
    private String etatCloture;
    @Column(name = "DATE_REACTIVATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReactivation;
    @Column(name = "DATE_AGENCE_CHANGER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAgenceChanger;
    @Column(name = "CODE_TITRE")
    private Short codeTitre;
    @Column(name = "MNT_DOM")
    private BigDecimal mntDom;
    @Column(name = "NUM_DOS_RAP")
    private Integer numDosRap;
    @Column(name = "DATE_DOS_RAP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDosRap;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER_RAP")
    private String typeDossierRap;
    @Column(name = "CODE_SERVICE")
    private Short codeService;
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Column(name = "DATE_ALIMENTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAlimentation;
    @Column(name = "MNT_ALIMENTATION")
    private BigDecimal mntAlimentation;
    @Column(name = "DATE_JOURNEE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJournee;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Size(max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Column(name = "ANNEE")
    private Short annee;
    @Size(max = 1)
    @Column(name = "DECLARATION_FISCALE")
    private String declarationFiscale;
    @Size(max = 1000)
    @Column(name = "AVIS_AGENCE")
    private String avisAgence;
    @Size(max = 1000)
    @Column(name = "AVIS_SIEGE")
    private String avisSiege;
    @Column(name = "DATE_VALIDATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateValidation;
    @Size(max = 1)
    @Column(name = "DESTINATAIRE")
    private String destinataire;
    @Size(max = 1)
    @Column(name = "ETAT_DOSSIER")
    private String etatDossier;
    @Column(name = "CODE_AGENCE_BCT")
    private Short codeAgenceBct;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;
    @Column(name = "CLE_RIB")
    private Short cleRib;
    @Column(name = "CODE_AGENCE_AVA")
    private Short codeAgenceAva;
    @Column(name = "CODE_ACTIVITE")
    private Integer codeActivite;

    public OperationsDelegueesMvt() {
    }

    public OperationsDelegueesMvt(OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        this.operationsDelegueesMvtPK = operationsDelegueesMvtPK;
    }

    public OperationsDelegueesMvt(short codeProduitService, int codeOperation, long refOperation, Date dateOperation, short uniteOperation) {
        this.operationsDelegueesMvtPK = new OperationsDelegueesMvtPK(codeProduitService, codeOperation, refOperation, dateOperation, uniteOperation);
    }

    public OperationsDelegueesMvtPK getOperationsDelegueesMvtPK() {
        return operationsDelegueesMvtPK;
    }

    public void setOperationsDelegueesMvtPK(OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        this.operationsDelegueesMvtPK = operationsDelegueesMvtPK;
    }

    public Short getCodeTypeDosAva() {
        return codeTypeDosAva;
    }

    public void setCodeTypeDosAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Short getCodePaysBct() {
        return codePaysBct;
    }

    public void setCodePaysBct(Short codePaysBct) {
        this.codePaysBct = codePaysBct;
    }

    public String getCodeTypeMvtAva() {
        return codeTypeMvtAva;
    }

    public void setCodeTypeMvtAva(String codeTypeMvtAva) {
        this.codeTypeMvtAva = codeTypeMvtAva;
    }

    public Short getCodeAgenceChanger() {
        return codeAgenceChanger;
    }

    public void setCodeAgenceChanger(Short codeAgenceChanger) {
        this.codeAgenceChanger = codeAgenceChanger;
    }

    public Date getDateSort() {
        return dateSort;
    }

    public void setDateSort(Date dateSort) {
        this.dateSort = dateSort;
    }

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Short getCodePaysDest() {
        return codePaysDest;
    }

    public void setCodePaysDest(Short codePaysDest) {
        this.codePaysDest = codePaysDest;
    }

    public Integer getNumMvtAs() {
        return numMvtAs;
    }

    public void setNumMvtAs(Integer numMvtAs) {
        this.numMvtAs = numMvtAs;
    }

    public Date getEcheanceAs() {
        return echeanceAs;
    }

    public void setEcheanceAs(Date echeanceAs) {
        this.echeanceAs = echeanceAs;
    }

    public Date getDateBct() {
        return dateBct;
    }

    public void setDateBct(Date dateBct) {
        this.dateBct = dateBct;
    }

    public Integer getNumeroBct() {
        return numeroBct;
    }

    public void setNumeroBct(Integer numeroBct) {
        this.numeroBct = numeroBct;
    }

    public BigDecimal getMontantAutre() {
        return montantAutre;
    }

    public void setMontantAutre(BigDecimal montantAutre) {
        this.montantAutre = montantAutre;
    }

    public Long getNumeroDeclaration() {
        return numeroDeclaration;
    }

    public void setNumeroDeclaration(Long numeroDeclaration) {
        this.numeroDeclaration = numeroDeclaration;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public String getModeDePayementBbChq() {
        return modeDePayementBbChq;
    }

    public void setModeDePayementBbChq(String modeDePayementBbChq) {
        this.modeDePayementBbChq = modeDePayementBbChq;
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

    public Integer getNumMvtAva() {
        return numMvtAva;
    }

    public void setNumMvtAva(Integer numMvtAva) {
        this.numMvtAva = numMvtAva;
    }

    public Date getDateMvtAva() {
        return dateMvtAva;
    }

    public void setDateMvtAva(Date dateMvtAva) {
        this.dateMvtAva = dateMvtAva;
    }

    public BigDecimal getMntRap() {
        return mntRap;
    }

    public void setMntRap(BigDecimal mntRap) {
        this.mntRap = mntRap;
    }

    public BigDecimal getMntRrvRav() {
        return mntRrvRav;
    }

    public void setMntRrvRav(BigDecimal mntRrvRav) {
        this.mntRrvRav = mntRrvRav;
    }

    public BigDecimal getMntAutorise() {
        return mntAutorise;
    }

    public void setMntAutorise(BigDecimal mntAutorise) {
        this.mntAutorise = mntAutorise;
    }

    public BigDecimal getMntCa() {
        return mntCa;
    }

    public void setMntCa(BigDecimal mntCa) {
        this.mntCa = mntCa;
    }

    public BigDecimal getMntMvtAva() {
        return mntMvtAva;
    }

    public void setMntMvtAva(BigDecimal mntMvtAva) {
        this.mntMvtAva = mntMvtAva;
    }

    public BigDecimal getMntRetrocession() {
        return mntRetrocession;
    }

    public void setMntRetrocession(BigDecimal mntRetrocession) {
        this.mntRetrocession = mntRetrocession;
    }

    public BigDecimal getMntUtilise() {
        return mntUtilise;
    }

    public void setMntUtilise(BigDecimal mntUtilise) {
        this.mntUtilise = mntUtilise;
    }

    public BigDecimal getMntAvance() {
        return mntAvance;
    }

    public void setMntAvance(BigDecimal mntAvance) {
        this.mntAvance = mntAvance;
    }

    public BigInteger getMntTotTitre() {
        return mntTotTitre;
    }

    public void setMntTotTitre(BigInteger mntTotTitre) {
        this.mntTotTitre = mntTotTitre;
    }

    public String getCaImportateur() {
        return caImportateur;
    }

    public void setCaImportateur(String caImportateur) {
        this.caImportateur = caImportateur;
    }

    public BigDecimal getMntCaFiscal() {
        return mntCaFiscal;
    }

    public void setMntCaFiscal(BigDecimal mntCaFiscal) {
        this.mntCaFiscal = mntCaFiscal;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }

    public String getCodeModePaiement() {
        return codeModePaiement;
    }

    public void setCodeModePaiement(String codeModePaiement) {
        this.codeModePaiement = codeModePaiement;
    }

    public Short getTypePieceBenef() {
        return typePieceBenef;
    }

    public void setTypePieceBenef(Short typePieceBenef) {
        this.typePieceBenef = typePieceBenef;
    }

    public String getNoPieceBenef() {
        return noPieceBenef;
    }

    public void setNoPieceBenef(String noPieceBenef) {
        this.noPieceBenef = noPieceBenef;
    }

    public String getMotifBlocage() {
        return motifBlocage;
    }

    public void setMotifBlocage(String motifBlocage) {
        this.motifBlocage = motifBlocage;
    }

    public String getEtatBlocage() {
        return etatBlocage;
    }

    public void setEtatBlocage(String etatBlocage) {
        this.etatBlocage = etatBlocage;
    }

    public Date getDateBlocage() {
        return dateBlocage;
    }

    public void setDateBlocage(Date dateBlocage) {
        this.dateBlocage = dateBlocage;
    }

    public Date getDateDeblocage() {
        return dateDeblocage;
    }

    public void setDateDeblocage(Date dateDeblocage) {
        this.dateDeblocage = dateDeblocage;
    }

    public String getRefBct() {
        return refBct;
    }

    public void setRefBct(String refBct) {
        this.refBct = refBct;
    }

    public Date getDateAccordBct() {
        return dateAccordBct;
    }

    public void setDateAccordBct(Date dateAccordBct) {
        this.dateAccordBct = dateAccordBct;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public String getMotifCloture() {
        return motifCloture;
    }

    public void setMotifCloture(String motifCloture) {
        this.motifCloture = motifCloture;
    }

    public String getEtatCloture() {
        return etatCloture;
    }

    public void setEtatCloture(String etatCloture) {
        this.etatCloture = etatCloture;
    }

    public Date getDateReactivation() {
        return dateReactivation;
    }

    public void setDateReactivation(Date dateReactivation) {
        this.dateReactivation = dateReactivation;
    }

    public Date getDateAgenceChanger() {
        return dateAgenceChanger;
    }

    public void setDateAgenceChanger(Date dateAgenceChanger) {
        this.dateAgenceChanger = dateAgenceChanger;
    }

    public Short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public BigDecimal getMntDom() {
        return mntDom;
    }

    public void setMntDom(BigDecimal mntDom) {
        this.mntDom = mntDom;
    }

    public Integer getNumDosRap() {
        return numDosRap;
    }

    public void setNumDosRap(Integer numDosRap) {
        this.numDosRap = numDosRap;
    }

    public Date getDateDosRap() {
        return dateDosRap;
    }

    public void setDateDosRap(Date dateDosRap) {
        this.dateDosRap = dateDosRap;
    }

    public String getTypeDossierRap() {
        return typeDossierRap;
    }

    public void setTypeDossierRap(String typeDossierRap) {
        this.typeDossierRap = typeDossierRap;
    }

    public Short getCodeService() {
        return codeService;
    }

    public void setCodeService(Short codeService) {
        this.codeService = codeService;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public Date getDateAlimentation() {
        return dateAlimentation;
    }

    public void setDateAlimentation(Date dateAlimentation) {
        this.dateAlimentation = dateAlimentation;
    }

    public BigDecimal getMntAlimentation() {
        return mntAlimentation;
    }

    public void setMntAlimentation(BigDecimal mntAlimentation) {
        this.mntAlimentation = mntAlimentation;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Short getAnnee() {
        return annee;
    }

    public void setAnnee(Short annee) {
        this.annee = annee;
    }

    public String getDeclarationFiscale() {
        return declarationFiscale;
    }

    public void setDeclarationFiscale(String declarationFiscale) {
        this.declarationFiscale = declarationFiscale;
    }

    public String getAvisAgence() {
        return avisAgence;
    }

    public void setAvisAgence(String avisAgence) {
        this.avisAgence = avisAgence;
    }

    public String getAvisSiege() {
        return avisSiege;
    }

    public void setAvisSiege(String avisSiege) {
        this.avisSiege = avisSiege;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getEtatDossier() {
        return etatDossier;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
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

    public Short getCodeAgenceAva() {
        return codeAgenceAva;
    }

    public void setCodeAgenceAva(Short codeAgenceAva) {
        this.codeAgenceAva = codeAgenceAva;
    }

    public Integer getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(Integer codeActivite) {
        this.codeActivite = codeActivite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationsDelegueesMvtPK != null ? operationsDelegueesMvtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationsDelegueesMvt)) {
            return false;
        }
        OperationsDelegueesMvt other = (OperationsDelegueesMvt) object;
        if ((this.operationsDelegueesMvtPK == null && other.operationsDelegueesMvtPK != null) || (this.operationsDelegueesMvtPK != null && !this.operationsDelegueesMvtPK.equals(other.operationsDelegueesMvtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ava.OperationsDelegueesMvt[ operationsDelegueesMvtPK=" + operationsDelegueesMvtPK + " ]";
    }
    
}
