/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BACA VARGAS
 */
@Entity
@Table(name = "kardex_insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KardexInsumos.findAll", query = "SELECT k FROM KardexInsumos k"),
    @NamedQuery(name = "KardexInsumos.findByIdkardex", query = "SELECT k FROM KardexInsumos k WHERE k.kardexInsumosPK.idkardex = :idkardex"),
    @NamedQuery(name = "KardexInsumos.findByIdinsumo", query = "SELECT k FROM KardexInsumos k WHERE k.kardexInsumosPK.idinsumo = :idinsumo"),
    @NamedQuery(name = "KardexInsumos.findByFecha", query = "SELECT k FROM KardexInsumos k WHERE k.fecha = :fecha"),
    @NamedQuery(name = "KardexInsumos.findByCantIngreso", query = "SELECT k FROM KardexInsumos k WHERE k.cantIngreso = :cantIngreso"),
    @NamedQuery(name = "KardexInsumos.findByCantSalida", query = "SELECT k FROM KardexInsumos k WHERE k.cantSalida = :cantSalida"),
    @NamedQuery(name = "KardexInsumos.findByCostEntrada", query = "SELECT k FROM KardexInsumos k WHERE k.costEntrada = :costEntrada"),
    @NamedQuery(name = "KardexInsumos.findByCostSalida", query = "SELECT k FROM KardexInsumos k WHERE k.costSalida = :costSalida"),
    @NamedQuery(name = "KardexInsumos.findBySerie", query = "SELECT k FROM KardexInsumos k WHERE k.serie = :serie"),
    @NamedQuery(name = "KardexInsumos.findByNumero", query = "SELECT k FROM KardexInsumos k WHERE k.numero = :numero"),
    @NamedQuery(name = "KardexInsumos.findByFechaRegistro", query = "SELECT k FROM KardexInsumos k WHERE k.fechaRegistro = :fechaRegistro")})
public class KardexInsumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KardexInsumosPK kardexInsumosPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "cant_ingreso")
    private Integer cantIngreso;
    @Column(name = "cant_salida")
    private Integer cantSalida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cost_entrada")
    private Double costEntrada;
    @Column(name = "cost_salida")
    private Double costSalida;
    @Column(name = "serie")
    private String serie;
    @Column(name = "numero")
    private String numero;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "idcomprobante", referencedColumnName = "idcomprobante")
    @ManyToOne(optional = false)
    private DocumentoSunat idcomprobante;
    @JoinColumn(name = "idempleados", referencedColumnName = "idempleados")
    @ManyToOne(optional = false)
    private Empleados idempleados;
    @JoinColumn(name = "idinsumo", referencedColumnName = "idinsumo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Insumo insumo;

    public KardexInsumos() {
    }

    public KardexInsumos(KardexInsumosPK kardexInsumosPK) {
        this.kardexInsumosPK = kardexInsumosPK;
    }

    public KardexInsumos(int idkardex, int idinsumo) {
        this.kardexInsumosPK = new KardexInsumosPK(idkardex, idinsumo);
    }

    public KardexInsumosPK getKardexInsumosPK() {
        return kardexInsumosPK;
    }

    public void setKardexInsumosPK(KardexInsumosPK kardexInsumosPK) {
        this.kardexInsumosPK = kardexInsumosPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCantIngreso() {
        return cantIngreso;
    }

    public void setCantIngreso(Integer cantIngreso) {
        this.cantIngreso = cantIngreso;
    }

    public Integer getCantSalida() {
        return cantSalida;
    }

    public void setCantSalida(Integer cantSalida) {
        this.cantSalida = cantSalida;
    }

    public Double getCostEntrada() {
        return costEntrada;
    }

    public void setCostEntrada(Double costEntrada) {
        this.costEntrada = costEntrada;
    }

    public Double getCostSalida() {
        return costSalida;
    }

    public void setCostSalida(Double costSalida) {
        this.costSalida = costSalida;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kardexInsumosPK != null ? kardexInsumosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KardexInsumos)) {
            return false;
        }
        KardexInsumos other = (KardexInsumos) object;
        if ((this.kardexInsumosPK == null && other.kardexInsumosPK != null) || (this.kardexInsumosPK != null && !this.kardexInsumosPK.equals(other.kardexInsumosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.KardexInsumos[ kardexInsumosPK=" + kardexInsumosPK + " ]";
    }
    
}
