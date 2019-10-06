/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author BACA VARGAS
 */
@Embeddable
public class KardexInsumosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idkardex")
    private int idkardex;
    @Basic(optional = false)
    @Column(name = "idinsumo")
    private int idinsumo;

    public KardexInsumosPK() {
    }

    public KardexInsumosPK(int idkardex, int idinsumo) {
        this.idkardex = idkardex;
        this.idinsumo = idinsumo;
    }

    public int getIdkardex() {
        return idkardex;
    }

    public void setIdkardex(int idkardex) {
        this.idkardex = idkardex;
    }

    public int getIdinsumo() {
        return idinsumo;
    }

    public void setIdinsumo(int idinsumo) {
        this.idinsumo = idinsumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idkardex;
        hash += (int) idinsumo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KardexInsumosPK)) {
            return false;
        }
        KardexInsumosPK other = (KardexInsumosPK) object;
        if (this.idkardex != other.idkardex) {
            return false;
        }
        if (this.idinsumo != other.idinsumo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl_clases.KardexInsumosPK[ idkardex=" + idkardex + ", idinsumo=" + idinsumo + " ]";
    }
    
}
