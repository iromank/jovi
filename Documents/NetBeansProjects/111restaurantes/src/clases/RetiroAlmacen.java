/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "retiro_almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RetiroAlmacen.findAll", query = "SELECT r FROM RetiroAlmacen r"),
    @NamedQuery(name = "RetiroAlmacen.findByIdretiro", query = "SELECT r FROM RetiroAlmacen r WHERE r.retiroAlmacenPK.idretiro = :idretiro"),
    @NamedQuery(name = "RetiroAlmacen.findByPeriodo", query = "SELECT r FROM RetiroAlmacen r WHERE r.retiroAlmacenPK.periodo = :periodo"),
    @NamedQuery(name = "RetiroAlmacen.findByFecha", query = "SELECT r FROM RetiroAlmacen r WHERE r.fecha = :fecha")})
public class RetiroAlmacen implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetiroAlmacenPK retiroAlmacenPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retiroAlmacen")
    private Collection<DetalleRetiro> detalleRetiroCollection;
    @JoinColumn(name = "idempleados", referencedColumnName = "idempleados")
    @ManyToOne(optional = false)
    private Empleados idempleados;

    public RetiroAlmacen() {
    }

    public RetiroAlmacen(RetiroAlmacenPK retiroAlmacenPK) {
        this.retiroAlmacenPK = retiroAlmacenPK;
    }

    public RetiroAlmacen(int idretiro, int periodo) {
        this.retiroAlmacenPK = new RetiroAlmacenPK(idretiro, periodo);
    }

    public RetiroAlmacenPK getRetiroAlmacenPK() {
        return retiroAlmacenPK;
    }

    public void setRetiroAlmacenPK(RetiroAlmacenPK retiroAlmacenPK) {
        this.retiroAlmacenPK = retiroAlmacenPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<DetalleRetiro> getDetalleRetiroCollection() {
        return detalleRetiroCollection;
    }

    public void setDetalleRetiroCollection(Collection<DetalleRetiro> detalleRetiroCollection) {
        this.detalleRetiroCollection = detalleRetiroCollection;
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
        hash += (retiroAlmacenPK != null ? retiroAlmacenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetiroAlmacen)) {
            return false;
        }
        RetiroAlmacen other = (RetiroAlmacen) object;
        if ((this.retiroAlmacenPK == null && other.retiroAlmacenPK != null) || (this.retiroAlmacenPK != null && !this.retiroAlmacenPK.equals(other.retiroAlmacenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.RetiroAlmacen[ retiroAlmacenPK=" + retiroAlmacenPK + " ]";
    }
    
}
