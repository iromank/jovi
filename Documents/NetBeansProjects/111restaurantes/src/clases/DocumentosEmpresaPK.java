/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author BACA VARGAS
 */
@Embeddable
public class DocumentosEmpresaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idcomprobante")
    private int idcomprobante;
    @Basic(optional = false)
    @Column(name = "serie")
    private String serie;

    public DocumentosEmpresaPK() {
    }

    public DocumentosEmpresaPK(int idcomprobante, String serie) {
        this.idcomprobante = idcomprobante;
        this.serie = serie;
    }

    public int getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(int idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcomprobante;
        hash += (serie != null ? serie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentosEmpresaPK)) {
            return false;
        }
        DocumentosEmpresaPK other = (DocumentosEmpresaPK) object;
        if (this.idcomprobante != other.idcomprobante) {
            return false;
        }
        if ((this.serie == null && other.serie != null) || (this.serie != null && !this.serie.equals(other.serie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.DocumentosEmpresaPK[ idcomprobante=" + idcomprobante + ", serie=" + serie + " ]";
    }
    
}
