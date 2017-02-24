/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "AGENCE_ETRANGERE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "AgenceEtrangere.findAll", query = "SELECT a FROM AgenceEtrangere a")})
public class AgenceEtrangere implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgenceEtrangerePK agenceEtrangerePK;
    @Size(max = 50)
    @Column(name = "ADR_EMAIL")
    private String adrEmail;
    @Size(max = 20)
    @Column(name = "CITE")
    private String cite;
    @Size(max = 20)
    @Column(name = "CITE1")
    private String cite1;
    @Size(max = 20)
    @Column(name = "CITE2")
    private String cite2;
    @Size(max = 20)
    @Column(name = "CITE3")
    private String cite3;
    @Size(max = 1)
    @Column(name = "CLE_SWIFT")
    private String cleSwift;
    @Size(max = 1)
    @Column(name = "CODE_BNQ_REG")
    private String codeBnqReg;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    @Column(name = "CODE_PAYS")
    private Short codePays;
    @Size(max = 30)
    @Column(name = "CONTACT1")
    private String contact1;
    @Size(max = 30)
    @Column(name = "CONTACT2")
    private String contact2;
    @Size(max = 30)
    @Column(name = "CONTACT3")
    private String contact3;
    @Size(max = 50)
    @Column(name = "EMAIL1")
    private String email1;
    @Size(max = 50)
    @Column(name = "EMAIL2")
    private String email2;
    @Size(max = 50)
    @Column(name = "EMAIL3")
    private String email3;
    @Size(max = 13)
    @Column(name = "FAX1")
    private String fax1;
    @Size(max = 13)
    @Column(name = "FAX2")
    private String fax2;
    @Size(max = 13)
    @Column(name = "FAX3")
    private String fax3;
    @Size(max = 30)
    @Column(name = "FONCTION1")
    private String fonction1;
    @Size(max = 30)
    @Column(name = "FONCTION2")
    private String fonction2;
    @Size(max = 30)
    @Column(name = "FONCTION3")
    private String fonction3;
    @Size(max = 29)
    @Column(name = "IMM")
    private String imm;
    @Size(max = 29)
    @Column(name = "IMM1")
    private String imm1;
    @Size(max = 29)
    @Column(name = "IMM2")
    private String imm2;
    @Size(max = 29)
    @Column(name = "IMM3")
    private String imm3;
    @Size(max = 40)
    @Column(name = "LIB_AGENCE_ETR")
    private String libAgenceEtr;
    @Size(max = 13)
    @Column(name = "NUM_FAX")
    private String numFax;
    @Size(max = 13)
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Size(max = 13)
    @Column(name = "NUM_TEL")
    private String numTel;
    @Size(max = 29)
    @Column(name = "RUE")
    private String rue;
    @Size(max = 29)
    @Column(name = "RUE1")
    private String rue1;
    @Size(max = 29)
    @Column(name = "RUE2")
    private String rue2;
    @Size(max = 29)
    @Column(name = "RUE3")
    private String rue3;
    @Size(max = 13)
    @Column(name = "TEL1")
    private String tel1;
    @Size(max = 13)
    @Column(name = "TEL2")
    private String tel2;
    @Size(max = 13)
    @Column(name = "TEL3")
    private String tel3;
    @Size(max = 13)
    @Column(name = "TELEX")
    private String telex;
    @Size(max = 200)
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 20)
    @Column(name = "CITE_CENTRE_TRI")
    private String citeCentreTri;
    @Size(max = 20)
    @Column(name = "RUE_CENTRE_TRI")
    private String rueCentreTri;
    @Size(max = 20)
    @Column(name = "IMM_CENTRE_TRI")
    private String immCentreTri;
    @Size(max = 20)
    @Column(name = "COLUMN1")
    private String column1;
    @JoinColumn(name = "CODE_BNQ_ETR", referencedColumnName = "CODE_BNQ_ETR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BanqueEtrangere banqueEtrangere;

    public AgenceEtrangere() {
    }

    public AgenceEtrangere(AgenceEtrangerePK agenceEtrangerePK) {
        this.agenceEtrangerePK = agenceEtrangerePK;
    }

    public AgenceEtrangere(int codeBnqEtr, int codeAgenceEtr) {
        this.agenceEtrangerePK = new AgenceEtrangerePK(codeBnqEtr, codeAgenceEtr);
    }

    public AgenceEtrangerePK getAgenceEtrangerePK() {
        return agenceEtrangerePK;
    }

    public void setAgenceEtrangerePK(AgenceEtrangerePK agenceEtrangerePK) {
        this.agenceEtrangerePK = agenceEtrangerePK;
    }

    public String getAdrEmail() {
        return adrEmail;
    }

    public void setAdrEmail(String adrEmail) {
        this.adrEmail = adrEmail;
    }

    public String getCite() {
        return cite;
    }

    public void setCite(String cite) {
        this.cite = cite;
    }

    public String getCite1() {
        return cite1;
    }

    public void setCite1(String cite1) {
        this.cite1 = cite1;
    }

    public String getCite2() {
        return cite2;
    }

    public void setCite2(String cite2) {
        this.cite2 = cite2;
    }

    public String getCite3() {
        return cite3;
    }

    public void setCite3(String cite3) {
        this.cite3 = cite3;
    }

    public String getCleSwift() {
        return cleSwift;
    }

    public void setCleSwift(String cleSwift) {
        this.cleSwift = cleSwift;
    }

    public String getCodeBnqReg() {
        return codeBnqReg;
    }

    public void setCodeBnqReg(String codeBnqReg) {
        this.codeBnqReg = codeBnqReg;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Short getCodePays() {
        return codePays;
    }

    public void setCodePays(Short codePays) {
        this.codePays = codePays;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContact3() {
        return contact3;
    }

    public void setContact3(String contact3) {
        this.contact3 = contact3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getFax1() {
        return fax1;
    }

    public void setFax1(String fax1) {
        this.fax1 = fax1;
    }

    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }

    public String getFax3() {
        return fax3;
    }

    public void setFax3(String fax3) {
        this.fax3 = fax3;
    }

    public String getFonction1() {
        return fonction1;
    }

    public void setFonction1(String fonction1) {
        this.fonction1 = fonction1;
    }

    public String getFonction2() {
        return fonction2;
    }

    public void setFonction2(String fonction2) {
        this.fonction2 = fonction2;
    }

    public String getFonction3() {
        return fonction3;
    }

    public void setFonction3(String fonction3) {
        this.fonction3 = fonction3;
    }

    public String getImm() {
        return imm;
    }

    public void setImm(String imm) {
        this.imm = imm;
    }

    public String getImm1() {
        return imm1;
    }

    public void setImm1(String imm1) {
        this.imm1 = imm1;
    }

    public String getImm2() {
        return imm2;
    }

    public void setImm2(String imm2) {
        this.imm2 = imm2;
    }

    public String getImm3() {
        return imm3;
    }

    public void setImm3(String imm3) {
        this.imm3 = imm3;
    }

    public String getLibAgenceEtr() {
        return libAgenceEtr;
    }

    public void setLibAgenceEtr(String libAgenceEtr) {
        this.libAgenceEtr = libAgenceEtr;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getRue1() {
        return rue1;
    }

    public void setRue1(String rue1) {
        this.rue1 = rue1;
    }

    public String getRue2() {
        return rue2;
    }

    public void setRue2(String rue2) {
        this.rue2 = rue2;
    }

    public String getRue3() {
        return rue3;
    }

    public void setRue3(String rue3) {
        this.rue3 = rue3;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getTelex() {
        return telex;
    }

    public void setTelex(String telex) {
        this.telex = telex;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCiteCentreTri() {
        return citeCentreTri;
    }

    public void setCiteCentreTri(String citeCentreTri) {
        this.citeCentreTri = citeCentreTri;
    }

    public String getRueCentreTri() {
        return rueCentreTri;
    }

    public void setRueCentreTri(String rueCentreTri) {
        this.rueCentreTri = rueCentreTri;
    }

    public String getImmCentreTri() {
        return immCentreTri;
    }

    public void setImmCentreTri(String immCentreTri) {
        this.immCentreTri = immCentreTri;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public BanqueEtrangere getBanqueEtrangere() {
        return banqueEtrangere;
    }

    public void setBanqueEtrangere(BanqueEtrangere banqueEtrangere) {
        this.banqueEtrangere = banqueEtrangere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agenceEtrangerePK != null ? agenceEtrangerePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenceEtrangere)) {
            return false;
        }
        AgenceEtrangere other = (AgenceEtrangere) object;
        if ((this.agenceEtrangerePK == null && other.agenceEtrangerePK != null) || (this.agenceEtrangerePK != null && !this.agenceEtrangerePK.equals(other.agenceEtrangerePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.AgenceEtrangere[ agenceEtrangerePK=" + agenceEtrangerePK + " ]";
    }
    
}
