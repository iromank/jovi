/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author BACA VARGAS
 */
@Embeddable
public class RetiroAlmacenPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idretiro")
    private int idretiro;
    @Basic(optional = false)
    @Column(name = "periodo")
    private int periodo;

    public RetiroAlmacenPK() {
    }

    public RetiroAlmacenPK(int idretiro, int periodo) {
        this.idretiro = idretiro;
        this.periodo = periodo;
    }

    public int getIdretiro() {
        return idretiro;
    }

    public void setIdretiro(int idretiro) {
        this.idretiro = idretiro;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idretiro;
        hash += (int) periodo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetiroAlmacenPK)) {
            return false;
        }
        RetiroAlmacenPK other = (RetiroAlmacenPK) object;
        if (this.idretiro != other.idretiro) {
            return false;
        }
        if (this.periodo != other.periodo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.RetiroAlmacenPK[ idretiro=" + idretiro + ", periodo=" + periodo + " ]";
    }
    
}
