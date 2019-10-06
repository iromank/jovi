/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "documentos_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentosEmpresa.findAll", query = "SELECT d FROM DocumentosEmpresa d"),
    @NamedQuery(name = "DocumentosEmpresa.findByIdcomprobante", query = "SELECT d FROM DocumentosEmpresa d WHERE d.documentosEmpresaPK.idcomprobante = :idcomprobante"),
    @NamedQuery(name = "DocumentosEmpresa.findBySerie", query = "SELECT d FROM DocumentosEmpresa d WHERE d.documentosEmpresaPK.serie = :serie"),
    @NamedQuery(name = "DocumentosEmpresa.findByNumero", query = "SELECT d FROM DocumentosEmpresa d WHERE d.numero = :numero"),
    @NamedQuery(name = "DocumentosEmpresa.findByComprobante", query = "SELECT d FROM DocumentosEmpresa d WHERE d.comprobante = :comprobante"),
    @NamedQuery(name = "DocumentosEmpresa.findByAbreviatura", query = "SELECT d FROM DocumentosEmpresa d WHERE d.abreviatura = :abreviatura")})
public class DocumentosEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentosEmpresaPK documentosEmpresaPK;
    @Column(name = "numero")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "comprobante")
    private String comprobante;
    @Basic(optional = false)
    @Column(name = "abreviatura")
    private String abreviatura;
    @JoinColumn(name = "idcomprobante", referencedColumnName = "idcomprobante", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DocumentoSunat documentoSunat;

    public DocumentosEmpresa() {
    }

    public DocumentosEmpresa(DocumentosEmpresaPK documentosEmpresaPK) {
        this.documentosEmpresaPK = documentosEmpresaPK;
    }

    public DocumentosEmpresa(DocumentosEmpresaPK documentosEmpresaPK, String comprobante, String abreviatura) {
        this.documentosEmpresaPK = documentosEmpresaPK;
        this.comprobante = comprobante;
        this.abreviatura = abreviatura;
    }

    public DocumentosEmpresa(int idcomprobante, String serie) {
        this.documentosEmpresaPK = new DocumentosEmpresaPK(idcomprobante, serie);
    }

    public DocumentosEmpresaPK getDocumentosEmpresaPK() {
        return documentosEmpresaPK;
    }

    public void setDocumentosEmpresaPK(DocumentosEmpresaPK documentosEmpresaPK) {
        this.documentosEmpresaPK = documentosEmpresaPK;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public DocumentoSunat getDocumentoSunat() {
        return documentoSunat;
    }

    public void setDocumentoSunat(DocumentoSunat documentoSunat) {
        this.documentoSunat = documentoSunat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentosEmpresaPK != null ? documentosEmpresaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentosEmpresa)) {
            return false;
        }
        DocumentosEmpresa other = (DocumentosEmpresa) object;
        if ((this.documentosEmpresaPK == null && other.documentosEmpresaPK != null) || (this.documentosEmpresaPK != null && !this.documentosEmpresaPK.equals(other.documentosEmpresaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.DocumentosEmpresa[ documentosEmpresaPK=" + documentosEmpresaPK + " ]";
    }
    
}
