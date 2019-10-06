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
public class DetalleVentaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idventa")
    private int idventa;
    @Basic(optional = false)
    @Column(name = "periodo")
    private int periodo;
    @Basic(optional = false)
    @Column(name = "idplatos")
    private int idplatos;

    public DetalleVentaPK() {
    }

    public DetalleVentaPK(int idventa, int periodo, int idplatos) {
        this.idventa = idventa;
        this.periodo = periodo;
        this.idplatos = idplatos;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(int idplatos) {
        this.idplatos = idplatos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idventa;
        hash += (int) periodo;
        hash += (int) idplatos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVentaPK)) {
            return false;
        }
        DetalleVentaPK other = (DetalleVentaPK) object;
        if (this.idventa != other.idventa) {
            return false;
        }
        if (this.periodo != other.periodo) {
            return false;
        }
        if (this.idplatos != other.idplatos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.DetalleVentaPK[ idventa=" + idventa + ", periodo=" + periodo + ", idplatos=" + idplatos + " ]";
    }
    
}
