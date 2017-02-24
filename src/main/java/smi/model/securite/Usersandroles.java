/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Djo-Workstation
 */
@Entity
@Table(name = "USERSANDROLES", catalog = "", schema = "SECURITE")
@NamedQueries({
    @NamedQuery(name = "Usersandroles.findAll", query = "SELECT u FROM Usersandroles u")})
public class Usersandroles implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersandrolesPK usersandrolesPK;

    public Usersandroles() {
    }

    public Usersandroles(UsersandrolesPK usersandrolesPK) {
        this.usersandrolesPK = usersandrolesPK;
    }

    public Usersandroles(long userId, long roleId) {
        this.usersandrolesPK = new UsersandrolesPK(userId, roleId);
    }

    public UsersandrolesPK getUsersandrolesPK() {
        return usersandrolesPK;
    }

    public void setUsersandrolesPK(UsersandrolesPK usersandrolesPK) {
        this.usersandrolesPK = usersandrolesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersandrolesPK != null ? usersandrolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usersandroles)) {
            return false;
        }
        Usersandroles other = (Usersandroles) object;
        if ((this.usersandrolesPK == null && other.usersandrolesPK != null) || (this.usersandrolesPK != null && !this.usersandrolesPK.equals(other.usersandrolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.Usersandroles[ usersandrolesPK=" + usersandrolesPK + " ]";
    }
    
}
