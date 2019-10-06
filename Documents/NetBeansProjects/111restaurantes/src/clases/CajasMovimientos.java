/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BACA VARGAS
 */
@Entity
@Table(name = "cajas_movimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CajasMovimientos.findAll", query = "SELECT c FROM CajasMovimientos c"),
    @NamedQuery(name = "CajasMovimientos.findByFecha", query = "SELECT c FROM CajasMovimientos c WHERE c.cajasMovimientosPK.fecha = :fecha"),
    @NamedQuery(name = "CajasMovimientos.findByIdMovimiento", query = "SELECT c FROM CajasMovimientos c WHERE c.cajasMovimientosPK.idMovimiento = :idMovimiento"),
    @NamedQuery(name = "CajasMovimientos.findByIngresa", query = "SELECT c FROM CajasMovimientos c WHERE c.ingresa = :ingresa"),
    @NamedQuery(name = "CajasMovimientos.findByRetira", query = "SELECT c FROM CajasMovimientos c WHERE c.retira = :retira"),
    @NamedQuery(name = "CajasMovimientos.findByMotivo", query = "SELECT c FROM CajasMovimientos c WHERE c.motivo = :motivo")})
public class CajasMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajasMovimientosPK cajasMovimientosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ingresa")
    private Double ingresa;
    @Column(name = "retira")
    private Double retira;
    @Column(name = "motivo")
    private String motivo;
    @JoinColumn(name = "fecha", referencedColumnName = "fecha", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cajas cajas;
    @JoinColumn(name = "idempleados", referencedColumnName = "idempleados")
    @ManyToOne(optional = false)
    private Empleados idempleados;

    public CajasMovimientos() {
    }

    public CajasMovimientos(CajasMovimientosPK cajasMovimientosPK) {
        this.cajasMovimientosPK = cajasMovimientosPK;
    }

    public CajasMovimientos(Date fecha, int idMovimiento) {
        this.cajasMovimientosPK = new CajasMovimientosPK(fecha, idMovimiento);
    }

    public CajasMovimientosPK getCajasMovimientosPK() {
        return cajasMovimientosPK;
    }

    public void setCajasMovimientosPK(CajasMovimientosPK cajasMovimientosPK) {
        this.cajasMovimientosPK = cajasMovimientosPK;
    }

    public Double getIngresa() {
        return ingresa;
    }

    public void setIngresa(Double ingresa) {
        this.ingresa = ingresa;
    }

    public Double getRetira() {
        return retira;
    }

    public void setRetira(Double retira) {
        this.retira = retira;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Cajas getCajas() {
        return cajas;
    }

    public void setCajas(Cajas cajas) {
        this.cajas = cajas;
    }

    public Empleados getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(Empleados idempleados) {
        this.idempleados = idempleados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajasMovimientosPK != null ? cajasMovimientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajasMovimientos)) {
            return false;
        }
        CajasMovimientos other = (CajasMovimientos) object;
        if ((this.cajasMovimientosPK == null && other.cajasMovimientosPK != null) || (this.cajasMovimientosPK != null && !this.cajasMovimientosPK.equals(other.cajasMovimientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.CajasMovimientos[ cajasMovimientosPK=" + cajasMovimientosPK + " ]";
    }
    
}
