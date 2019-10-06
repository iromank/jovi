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
@Table(name = "ingreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingreso.findAll", query = "SELECT i FROM Ingreso i"),
    @NamedQuery(name = "Ingreso.findByIdingreso", query = "SELECT i FROM Ingreso i WHERE i.ingresoPK.idingreso = :idingreso"),
    @NamedQuery(name = "Ingreso.findByPeriodo", query = "SELECT i FROM Ingreso i WHERE i.ingresoPK.periodo = :periodo"),
    @NamedQuery(name = "Ingreso.findByFecha", query = "SELECT i FROM Ingreso i WHERE i.fecha = :fecha"),
    @NamedQuery(name = "Ingreso.findBySerie", query = "SELECT i FROM Ingreso i WHERE i.serie = :serie"),
    @NamedQuery(name = "Ingreso.findByNumero", query = "SELECT i FROM Ingreso i WHERE i.numero = :numero"),
    @NamedQuery(name = "Ingreso.findByTotal", query = "SELECT i FROM Ingreso i WHERE i.total = :total")})
public class Ingreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngresoPK ingresoPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "serie")
    private String serie;
    @Column(name = "numero")
    private Integer numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingreso")
    private Collection<DetalleIngreso> detalleIngresoCollection;
    @JoinColumn(name = "idcomprobante", referencedColumnName = "idcomprobante")
    @ManyToOne(optional = false)
    private DocumentoSunat idcomprobante;
    @JoinColumn(name = "idempleados", referencedColumnName = "idempleados")
    @ManyToOne(optional = false)
    private Empleados idempleados;
    @JoinColumn(name = "idproveedor", referencedColumnName = "idproveedor")
    @ManyToOne(optional = false)
    private Proveedor idproveedor;

    public Ingreso() {
    }

    public Ingreso(IngresoPK ingresoPK) {
        this.ingresoPK = ingresoPK;
    }

    public Ingreso(int idingreso, int periodo) {
        this.ingresoPK = new IngresoPK(idingreso, periodo);
    }

    public IngresoPK getIngresoPK() {
        return ingresoPK;
    }

    public void setIngresoPK(IngresoPK ingresoPK) {
        this.ingresoPK = ingresoPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @XmlTransient
    public Collection<DetalleIngreso> getDetalleIngresoCollection() {
        return detalleIngresoCollection;
    }

    public void setDetalleIngresoCollection(Collection<DetalleIngreso> detalleIngresoCollection) {
        this.detalleIngresoCollection = detalleIngresoCollection;
    }

    public DocumentoSunat getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(DocumentoSunat idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public Empleados getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(Empleados idempleados) {
        this.idempleados = idempleados;
    }

    public Proveedor getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Proveedor idproveedor) {
        this.idproveedor = idproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingresoPK != null ? ingresoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingreso)) {
            return false;
        }
        Ingreso other = (Ingreso) object;
        if ((this.ingresoPK == null && other.ingresoPK != null) || (this.ingresoPK != null && !this.ingresoPK.equals(other.ingresoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.Ingreso[ ingresoPK=" + ingresoPK + " ]";
    }
    
}
