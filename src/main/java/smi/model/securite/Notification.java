/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "NOTIFICATION", catalog = "", schema = "SECURITE")
@NamedQueries({
    @NamedQuery(name = "Notification.findAll", query = "SELECT n FROM Notification n")})
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_SERVICE")
    private short codeService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_NIVEAU_IMP")
    private short codeNiveauImp;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "REF_NOTIF")
    private String refNotif;
    @Size(max = 100)
    @Column(name = "OBJET")
    private String objet;
    @Size(max = 1000)
    @Column(name = "TEXT")
    private String text;
    @Column(name = "IMPORTANCE")
    private Character importance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_NOTIF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNotif;
    @Column(name = "LU_O_N")
    private Character luON;
    @Size(max = 13)
    @Column(name = "NO_PIECE_PERSONNE")
    private String noPiecePersonne;

    public Notification() {
    }

    public Notification(String refNotif) {
        this.refNotif = refNotif;
    }

    public Notification(String refNotif, short codeService, short codeNiveauImp, Date dateNotif) {
        this.refNotif = refNotif;
        this.codeService = codeService;
        this.codeNiveauImp = codeNiveauImp;
        this.dateNotif = dateNotif;
    }

    public short getCodeService() {
        return codeService;
    }

    public void setCodeService(short codeService) {
        this.codeService = codeService;
    }

    public short getCodeNiveauImp() {
        return codeNiveauImp;
    }

    public void setCodeNiveauImp(short codeNiveauImp) {
        this.codeNiveauImp = codeNiveauImp;
    }

    public String getRefNotif() {
        return refNotif;
    }

    public void setRefNotif(String refNotif) {
        this.refNotif = refNotif;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Character getImportance() {
        return importance;
    }

    public void setImportance(Character importance) {
        this.importance = importance;
    }

    public Date getDateNotif() {
        return dateNotif;
    }

    public void setDateNotif(Date dateNotif) {
        this.dateNotif = dateNotif;
    }

    public Character getLuON() {
        return luON;
    }

    public void setLuON(Character luON) {
        this.luON = luON;
    }

    public String getNoPiecePersonne() {
        return noPiecePersonne;
    }

    public void setNoPiecePersonne(String noPiecePersonne) {
        this.noPiecePersonne = noPiecePersonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refNotif != null ? refNotif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.refNotif == null && other.refNotif != null) || (this.refNotif != null && !this.refNotif.equals(other.refNotif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.Notification[ refNotif=" + refNotif + " ]";
    }
    
}
