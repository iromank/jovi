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
@Table(name = "clas_platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasPlatos.findAll", query = "SELECT c FROM ClasPlatos c"),
    @NamedQuery(name = "ClasPlatos.findByIdclasPlatos", query = "SELECT c FROM ClasPlatos c WHERE c.idclasPlatos = :idclasPlatos"),
    @NamedQuery(name = "ClasPlatos.findByTipo", query = "SELECT c FROM ClasPlatos c WHERE c.tipo = :tipo")})
public class ClasPlatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idclas_platos")
    private Integer idclasPlatos;
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idclasPlatos")
    private Collection<Platos> platosCollection;

    public ClasPlatos() {
    }

    public ClasPlatos(Integer idclasPlatos) {
        this.idclasPlatos = idclasPlatos;
    }

    public Integer getIdclasPlatos() {
        return idclasPlatos;
    }

    public void setIdclasPlatos(Integer idclasPlatos) {
        this.idclasPlatos = idclasPlatos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Platos> getPlatosCollection() {
        return platosCollection;
    }

    public void setPlatosCollection(Collection<Platos> platosCollection) {
        this.platosCollection = platosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclasPlatos != null ? idclasPlatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasPlatos)) {
            return false;
        }
        ClasPlatos other = (ClasPlatos) object;
        if ((this.idclasPlatos == null && other.idclasPlatos != null) || (this.idclasPlatos != null && !this.idclasPlatos.equals(other.idclasPlatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.ClasPlatos[ idclasPlatos=" + idclasPlatos + " ]";
    }
    
}
