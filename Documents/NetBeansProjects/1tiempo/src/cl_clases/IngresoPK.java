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
public class IngresoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idingreso")
    private int idingreso;
    @Basic(optional = false)
    @Column(name = "periodo")
    private int periodo;

    public IngresoPK() {
    }

    public IngresoPK(int idingreso, int periodo) {
        this.idingreso = idingreso;
        this.periodo = periodo;
    }

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
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
        hash += (int) idingreso;
        hash += (int) periodo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresoPK)) {
            return false;
        }
        IngresoPK other = (IngresoPK) object;
        if (this.idingreso != other.idingreso) {
            return false;
        }
        if (this.periodo != other.periodo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.IngresoPK[ idingreso=" + idingreso + ", periodo=" + periodo + " ]";
    }
    
}
