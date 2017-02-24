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
@Table(name = "TIMELINE", catalog = "", schema = "DOMI")
@NamedQueries({
    @NamedQuery(name = "Timeline.findAll", query = "SELECT t FROM Timeline t")})
public class Timeline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Column(name = "CODE_TITRE")
    private Short codeTitre;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Size(max = 50)
    @Column(name = "OBJET")
    private String objet;
    @Column(name = "TYPE_FLUX")
    private Short typeFlux;

    public Timeline() {
    }

    public Timeline(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Short codeTitre) {
        this.codeTitre = codeTitre;
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

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Short getTypeFlux() {
        return typeFlux;
    }

    public void setTypeFlux(Short typeFlux) {
        this.typeFlux = typeFlux;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Timeline)) {
            return false;
        }
        Timeline other = (Timeline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.domi.Timeline[ id=" + id + " ]";
    }
    
}
