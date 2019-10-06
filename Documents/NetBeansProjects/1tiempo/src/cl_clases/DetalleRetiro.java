/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "detalle_retiro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleRetiro.findAll", query = "SELECT d FROM DetalleRetiro d"),
    @NamedQuery(name = "DetalleRetiro.findByIdretiro", query = "SELECT d FROM DetalleRetiro d WHERE d.detalleRetiroPK.idretiro = :idretiro"),
    @NamedQuery(name = "DetalleRetiro.findByPeriodo", query = "SELECT d FROM DetalleRetiro d WHERE d.detalleRetiroPK.periodo = :periodo"),
    @NamedQuery(name = "DetalleRetiro.findByIdinsumo", query = "SELECT d FROM DetalleRetiro d WHERE d.detalleRetiroPK.idinsumo = :idinsumo"),
    @NamedQuery(name = "DetalleRetiro.findByCantidad", query = "SELECT d FROM DetalleRetiro d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleRetiro.findByCosto", query = "SELECT d FROM DetalleRetiro d WHERE d.costo = :costo")})
public class DetalleRetiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleRetiroPK detalleRetiroPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private Double cantidad;
    @Column(name = "costo")
    private Double costo;
    @JoinColumn(name = "idinsumo", referencedColumnName = "idinsumo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Insumo insumo;
    @JoinColumns({
        @JoinColumn(name = "idretiro", referencedColumnName = "idretiro", insertable = false, updatable = false),
        @JoinColumn(name = "periodo", referencedColumnName = "periodo", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private RetiroAlmacen retiroAlmacen;

    public DetalleRetiro() {
    }

    public DetalleRetiro(DetalleRetiroPK detalleRetiroPK) {
        this.detalleRetiroPK = detalleRetiroPK;
    }

    public DetalleRetiro(int idretiro, int periodo, int idinsumo) {
        this.detalleRetiroPK = new DetalleRetiroPK(idretiro, periodo, idinsumo);
    }

    public DetalleRetiroPK getDetalleRetiroPK() {
        return detalleRetiroPK;
    }

    public void setDetalleRetiroPK(DetalleRetiroPK detalleRetiroPK) {
        this.detalleRetiroPK = detalleRetiroPK;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public RetiroAlmacen getRetiroAlmacen() {
        return retiroAlmacen;
    }

    public void setRetiroAlmacen(RetiroAlmacen retiroAlmacen) {
        this.retiroAlmacen = retiroAlmacen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleRetiroPK != null ? detalleRetiroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleRetiro)) {
            return false;
        }
        DetalleRetiro other = (DetalleRetiro) object;
        if ((this.detalleRetiroPK == null && other.detalleRetiroPK != null) || (this.detalleRetiroPK != null && !this.detalleRetiroPK.equals(other.detalleRetiroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.DetalleRetiro[ detalleRetiroPK=" + detalleRetiroPK + " ]";
    }
    
}
