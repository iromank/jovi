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
public class DetallePedidoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;
    @Basic(optional = false)
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    @Column(name = "idplatos")
    private int idplatos;

    public DetallePedidoPK() {
    }

    public DetallePedidoPK(int idpedido, int anio, int idplatos) {
        this.idpedido = idpedido;
        this.anio = anio;
        this.idplatos = idplatos;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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
        hash += (int) idpedido;
        hash += (int) anio;
        hash += (int) idplatos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedidoPK)) {
            return false;
        }
        DetallePedidoPK other = (DetallePedidoPK) object;
        if (this.idpedido != other.idpedido) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.idplatos != other.idplatos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.DetallePedidoPK[ idpedido=" + idpedido + ", anio=" + anio + ", idplatos=" + idplatos + " ]";
    }
    
}
