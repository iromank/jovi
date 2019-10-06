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
@Table(name = "documento_sunat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentoSunat.findAll", query = "SELECT d FROM DocumentoSunat d"),
    @NamedQuery(name = "DocumentoSunat.findByIdcomprobante", query = "SELECT d FROM DocumentoSunat d WHERE d.idcomprobante = :idcomprobante"),
    @NamedQuery(name = "DocumentoSunat.findByNombre", query = "SELECT d FROM DocumentoSunat d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "DocumentoSunat.findByCodSunat", query = "SELECT d FROM DocumentoSunat d WHERE d.codSunat = :codSunat"),
    @NamedQuery(name = "DocumentoSunat.findByAbreviatura", query = "SELECT d FROM DocumentoSunat d WHERE d.abreviatura = :abreviatura")})
public class DocumentoSunat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcomprobante")
    private Integer idcomprobante;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cod_sunat")
    private String codSunat;
    @Column(name = "abreviatura")
    private String abreviatura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcomprobante")
    private Collection<Venta> ventaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "documentoSunat")
    private Collection<DocumentosEmpresa> documentosEmpresaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcomprobante")
    private Collection<KardexInsumos> kardexInsumosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcomprobante")
    private Collection<Ingreso> ingresoCollection;

    public DocumentoSunat() {
    }

    public DocumentoSunat(Integer idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public Integer getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(Integer idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodSunat() {
        return codSunat;
    }

    public void setCodSunat(String codSunat) {
        this.codSunat = codSunat;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @XmlTransient
    public Collection<DocumentosEmpresa> getDocumentosEmpresaCollection() {
        return documentosEmpresaCollection;
    }

    public void setDocumentosEmpresaCollection(Collection<DocumentosEmpresa> documentosEmpresaCollection) {
        this.documentosEmpresaCollection = documentosEmpresaCollection;
    }

    @XmlTransient
    public Collection<KardexInsumos> getKardexInsumosCollection() {
        return kardexInsumosCollection;
    }

    public void setKardexInsumosCollection(Collection<KardexInsumos> kardexInsumosCollection) {
        this.kardexInsumosCollection = kardexInsumosCollection;
    }

    @XmlTransient
    public Collection<Ingreso> getIngresoCollection() {
        return ingresoCollection;
    }

    public void setIngresoCollection(Collection<Ingreso> ingresoCollection) {
        this.ingresoCollection = ingresoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomprobante != null ? idcomprobante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoSunat)) {
            return false;
        }
        DocumentoSunat other = (DocumentoSunat) object;
        if ((this.idcomprobante == null && other.idcomprobante != null) || (this.idcomprobante != null && !this.idcomprobante.equals(other.idcomprobante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.DocumentoSunat[ idcomprobante=" + idcomprobante + " ]";
    }
    
}
