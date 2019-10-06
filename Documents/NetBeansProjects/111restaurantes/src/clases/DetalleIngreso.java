/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
@Table(name = "detalle_ingreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleIngreso.findAll", query = "SELECT d FROM DetalleIngreso d"),
    @NamedQuery(name = "DetalleIngreso.findByIdingreso", query = "SELECT d FROM DetalleIngreso d WHERE d.detalleIngresoPK.idingreso = :idingreso"),
    @NamedQuery(name = "DetalleIngreso.findByPeriodo", query = "SELECT d FROM DetalleIngreso d WHERE d.detalleIngresoPK.periodo = :periodo"),
    @NamedQuery(name = "DetalleIngreso.findByIdinsumo", query = "SELECT d FROM DetalleIngreso d WHERE d.detalleIngresoPK.idinsumo = :idinsumo"),
    @NamedQuery(name = "DetalleIngreso.findByCantidad", query = "SELECT d FROM DetalleIngreso d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleIngreso.findByCosto", query = "SELECT d FROM DetalleIngreso d WHERE d.costo = :costo")})
public class DetalleIngreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleIngresoPK detalleIngresoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private Double cantidad;
    @Column(name = "costo")
    private Double costo;
    @JoinColumns({
        @JoinColumn(name = "idingreso", referencedColumnName = "idingreso", insertable = false, updatable = false),
        @JoinColumn(name = "periodo", referencedColumnName = "periodo", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Ingreso ingreso;
    @JoinColumn(name = "idinsumo", referencedColumnName = "idinsumo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Insumo insumo;

    public DetalleIngreso() {
    }

    public DetalleIngreso(DetalleIngresoPK detalleIngresoPK) {
        this.detalleIngresoPK = detalleIngresoPK;
    }

    public DetalleIngreso(int idingreso, int periodo, int idinsumo) {
        this.detalleIngresoPK = new DetalleIngresoPK(idingreso, periodo, idinsumo);
    }

    public DetalleIngresoPK getDetalleIngresoPK() {
        return detalleIngresoPK;
    }

    public void setDetalleIngresoPK(DetalleIngresoPK detalleIngresoPK) {
        this.detalleIngresoPK = detalleIngresoPK;
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

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleIngresoPK != null ? detalleIngresoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleIngreso)) {
            return false;
        }
        DetalleIngreso other = (DetalleIngreso) object;
        if ((this.detalleIngresoPK == null && other.detalleIngresoPK != null) || (this.detalleIngresoPK != null && !this.detalleIngresoPK.equals(other.detalleIngresoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.DetalleIngreso[ detalleIngresoPK=" + detalleIngresoPK + " ]";
    }
    
}
