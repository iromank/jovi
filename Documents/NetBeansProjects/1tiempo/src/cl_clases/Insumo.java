/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BACA VARGAS
 */
@Entity
@Table(name = "insumo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumo.findAll", query = "SELECT i FROM Insumo i"),
    @NamedQuery(name = "Insumo.findByIdinsumo", query = "SELECT i FROM Insumo i WHERE i.idinsumo = :idinsumo"),
    @NamedQuery(name = "Insumo.findByDescripcion", query = "SELECT i FROM Insumo i WHERE i.descripcion = :descripcion"),
    @NamedQuery(name = "Insumo.findByCantActual", query = "SELECT i FROM Insumo i WHERE i.cantActual = :cantActual"),
    @NamedQuery(name = "Insumo.findByEstado", query = "SELECT i FROM Insumo i WHERE i.estado = :estado"),
    @NamedQuery(name = "Insumo.findByCostoCigv", query = "SELECT i FROM Insumo i WHERE i.costoCigv = :costoCigv")})
public class Insumo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idinsumo")
    private Integer idinsumo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cant_actual")
    private Integer cantActual;
    @Column(name = "estado")
    private Integer estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo_cigv")
    private Double costoCigv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insumo")
    private Collection<DetalleIngreso> detalleIngresoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insumo")
    private Collection<DetalleRetiro> detalleRetiroCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insumo")
    private Collection<KardexInsumos> kardexInsumosCollection;

    public Insumo() {
    }

    public Insumo(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public Integer getIdinsumo() {
        return idinsumo;
    }

    public void setIdinsumo(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantActual() {
        return cantActual;
    }

    public void setCantActual(Integer cantActual) {
        this.cantActual = cantActual;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Double getCostoCigv() {
        return costoCigv;
    }

    public void setCostoCigv(Double costoCigv) {
        this.costoCigv = costoCigv;
    }

    @XmlTransient
    public Collection<DetalleIngreso> getDetalleIngresoCollection() {
        return detalleIngresoCollection;
    }

    public void setDetalleIngresoCollection(Collection<DetalleIngreso> detalleIngresoCollection) {
        this.detalleIngresoCollection = detalleIngresoCollection;
    }

    @XmlTransient
    public Collection<DetalleRetiro> getDetalleRetiroCollection() {
        return detalleRetiroCollection;
    }

    public void setDetalleRetiroCollection(Collection<DetalleRetiro> detalleRetiroCollection) {
        this.detalleRetiroCollection = detalleRetiroCollection;
    }

    @XmlTransient
    public Collection<KardexInsumos> getKardexInsumosCollection() {
        return kardexInsumosCollection;
    }

    public void setKardexInsumosCollection(Collection<KardexInsumos> kardexInsumosCollection) {
        this.kardexInsumosCollection = kardexInsumosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinsumo != null ? idinsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumo)) {
            return false;
        }
        Insumo other = (Insumo) object;
        if ((this.idinsumo == null && other.idinsumo != null) || (this.idinsumo != null && !this.idinsumo.equals(other.idinsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.Insumo[ idinsumo=" + idinsumo + " ]";
    }
    
}
