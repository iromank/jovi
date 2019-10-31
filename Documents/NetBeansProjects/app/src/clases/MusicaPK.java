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
public class MusicaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idmusica")
    private int idmusica;
    @Basic(optional = false)
    @Column(name = "musica")
    private String musica;

    public MusicaPK() {
    }

    public MusicaPK(int idmusica, String musica) {
        this.idmusica = idmusica;
        this.musica = musica;
    }

    public int getIdmusica() {
        return idmusica;
    }

    public void setIdmusica(int idmusica) {
        this.idmusica = idmusica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idmusica;
        hash += (musica != null ? musica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MusicaPK)) {
            return false;
        }
        MusicaPK other = (MusicaPK) object;
        if (this.idmusica != other.idmusica) {
            return false;
        }
        if ((this.musica == null && other.musica != null) || (this.musica != null && !this.musica.equals(other.musica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.MusicaPK[ idmusica=" + idmusica + ", musica=" + musica + " ]";
    }
    
}
