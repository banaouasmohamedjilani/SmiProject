/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.ref;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "SERVICE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s")})
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_SERVICE")
    private Short codeService;
    @Size(max = 50)
    @Column(name = "LIB_SERVICE")
    private String libService;
    @Size(max = 3)
    @Column(name = "SIGLE")
    private String sigle;
    @Size(max = 1)
    @Column(name = "EXP_IMP")
    private String expImp;
    @Size(max = 7)
    @Column(name = "COULEUR")
    private String couleur;

    public Service() {
    }

    public Service(Short codeService) {
        this.codeService = codeService;
    }

    public Short getCodeService() {
        return codeService;
    }

    public void setCodeService(Short codeService) {
        this.codeService = codeService;
    }

    public String getLibService() {
        return libService;
    }

    public void setLibService(String libService) {
        this.libService = libService;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getExpImp() {
        return expImp;
    }

    public void setExpImp(String expImp) {
        this.expImp = expImp;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeService != null ? codeService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.codeService == null && other.codeService != null) || (this.codeService != null && !this.codeService.equals(other.codeService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.ref.Service[ codeService=" + codeService + " ]";
    }
    
}
