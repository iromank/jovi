/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BACA VARGAS
 */
@Entity
@Table(name = "cajas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cajas.findAll", query = "SELECT c FROM Cajas c"),
    @NamedQuery(name = "Cajas.findByFecha", query = "SELECT c FROM Cajas c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cajas.findByIngVenta", query = "SELECT c FROM Cajas c WHERE c.ingVenta = :ingVenta"),
    @NamedQuery(name = "Cajas.findByCobroVenta", query = "SELECT c FROM Cajas c WHERE c.cobroVenta = :cobroVenta"),
    @NamedQuery(name = "Cajas.findByOIngresos", query = "SELECT c FROM Cajas c WHERE c.oIngresos = :oIngresos"),
    @NamedQuery(name = "Cajas.findByDevolucionVentas", query = "SELECT c FROM Cajas c WHERE c.devolucionVentas = :devolucionVentas"),
    @NamedQuery(name = "Cajas.findByGastosVarios", query = "SELECT c FROM Cajas c WHERE c.gastosVarios = :gastosVarios"),
    @NamedQuery(name = "Cajas.findByMSistemas", query = "SELECT c FROM Cajas c WHERE c.mSistemas = :mSistemas"),
    @NamedQuery(name = "Cajas.findByMApertura", query = "SELECT c FROM Cajas c WHERE c.mApertura = :mApertura"),
    @NamedQuery(name = "Cajas.findByMCierre", query = "SELECT c FROM Cajas c WHERE c.mCierre = :mCierre")})
public class Cajas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ing_venta")
    private Double ingVenta;
    @Column(name = "cobro_venta")
    private Double cobroVenta;
    @Column(name = "o_ingresos")
    private Double oIngresos;
    @Column(name = "devolucion_ventas")
    private Double devolucionVentas;
    @Column(name = "gastos_varios")
    private Double gastosVarios;
    @Column(name = "m_sistemas")
    private Double mSistemas;
    @Column(name = "m_apertura")
    private Double mApertura;
    @Column(name = "m_cierre")
    private Double mCierre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cajas")
    private Collection<CajasMovimientos> cajasMovimientosCollection;

    public Cajas() {
    }

    public Cajas(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getIngVenta() {
        return ingVenta;
    }

    public void setIngVenta(Double ingVenta) {
        this.ingVenta = ingVenta;
    }

    public Double getCobroVenta() {
        return cobroVenta;
    }

    public void setCobroVenta(Double cobroVenta) {
        this.cobroVenta = cobroVenta;
    }

    public Double getOIngresos() {
        return oIngresos;
    }

    public void setOIngresos(Double oIngresos) {
        this.oIngresos = oIngresos;
    }

    public Double getDevolucionVentas() {
        return devolucionVentas;
    }

    public void setDevolucionVentas(Double devolucionVentas) {
        this.devolucionVentas = devolucionVentas;
    }

    public Double getGastosVarios() {
        return gastosVarios;
    }

    public void setGastosVarios(Double gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    public Double getMSistemas() {
        return mSistemas;
    }

    public void setMSistemas(Double mSistemas) {
        this.mSistemas = mSistemas;
    }

    public Double getMApertura() {
        return mApertura;
    }

    public void setMApertura(Double mApertura) {
        this.mApertura = mApertura;
    }

    public Double getMCierre() {
        return mCierre;
    }

    public void setMCierre(Double mCierre) {
        this.mCierre = mCierre;
    }

    @XmlTransient
    public Collection<CajasMovimientos> getCajasMovimientosCollection() {
        return cajasMovimientosCollection;
    }

    public void setCajasMovimientosCollection(Collection<CajasMovimientos> cajasMovimientosCollection) {
        this.cajasMovimientosCollection = cajasMovimientosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajas)) {
            return false;
        }
        Cajas other = (Cajas) object;
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.Cajas[ fecha=" + fecha + " ]";
    }
    
}
