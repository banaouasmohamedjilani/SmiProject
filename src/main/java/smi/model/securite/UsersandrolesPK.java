/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Djo-Workstation
 */
@Embeddable
public class UsersandrolesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "USER_ID")
    private long userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROLE_ID")
    private long roleId;

    public UsersandrolesPK() {
    }

    public UsersandrolesPK(long userId, long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userId;
        hash += (int) roleId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersandrolesPK)) {
            return false;
        }
        UsersandrolesPK other = (UsersandrolesPK) object;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.roleId != other.roleId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "smi.model.securite.UsersandrolesPK[ userId=" + userId + ", roleId=" + roleId + " ]";
    }
    
}
