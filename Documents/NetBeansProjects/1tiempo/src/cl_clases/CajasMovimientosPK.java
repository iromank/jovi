/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author BACA VARGAS
 */
@Embeddable
public class CajasMovimientosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "id_movimiento")
    private int idMovimiento;

    public CajasMovimientosPK() {
    }

    public CajasMovimientosPK(Date fecha, int idMovimiento) {
        this.fecha = fecha;
        this.idMovimiento = idMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecha != null ? fecha.hashCode() : 0);
        hash += (int) idMovimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajasMovimientosPK)) {
            return false;
        }
        CajasMovimientosPK other = (CajasMovimientosPK) object;
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        if (this.idMovimiento != other.idMovimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.CajasMovimientosPK[ fecha=" + fecha + ", idMovimiento=" + idMovimiento + " ]";
    }
    
}
