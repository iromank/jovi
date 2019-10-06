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
public class DetalleIngresoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idingreso")
    private int idingreso;
    @Basic(optional = false)
    @Column(name = "periodo")
    private int periodo;
    @Basic(optional = false)
    @Column(name = "idinsumo")
    private int idinsumo;

    public DetalleIngresoPK() {
    }

    public DetalleIngresoPK(int idingreso, int periodo, int idinsumo) {
        this.idingreso = idingreso;
        this.periodo = periodo;
        this.idinsumo = idinsumo;
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

    public int getIdinsumo() {
        return idinsumo;
    }

    public void setIdinsumo(int idinsumo) {
        this.idinsumo = idinsumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idingreso;
        hash += (int) periodo;
        hash += (int) idinsumo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleIngresoPK)) {
            return false;
        }
        DetalleIngresoPK other = (DetalleIngresoPK) object;
        if (this.idingreso != other.idingreso) {
            return false;
        }
        if (this.periodo != other.periodo) {
            return false;
        }
        if (this.idinsumo != other.idinsumo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.DetalleIngresoPK[ idingreso=" + idingreso + ", periodo=" + periodo + ", idinsumo=" + idinsumo + " ]";
    }
    
}
