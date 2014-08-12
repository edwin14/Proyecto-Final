
package com.edwin.web;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "platillo")

public class Platillo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_platillo")
    private Integer idPlatillo;
    @Column(name = "num_platillo")
    private Float numPlatillo;
    @Column(name = "tipo_platillo")
    private Float tipoPlatillo;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente idCliente;

    public Platillo() {
    } 

    public Platillo(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public Platillo(Float numPlatillo, Float tipoPlatillo, Cliente idCliente) {
        this.numPlatillo = numPlatillo;
        this.tipoPlatillo = tipoPlatillo;
        this.idCliente = idCliente;
    }

    public Integer getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public Float getNumPlatillo() {
        return numPlatillo;
    }

    public void setNumPlatillo(Float numPlatillo) {
        this.numPlatillo = numPlatillo;
    }

    public Float getTipoPlatillo() {
        return tipoPlatillo;
    }

    public void setTipoPlatillo(Float tipoPlatillo) {
        this.tipoPlatillo = tipoPlatillo;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlatillo != null ? idPlatillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillo)) {
            return false;
        }
        Platillo other = (Platillo) object;
        if ((this.idPlatillo == null && other.idPlatillo != null) || (this.idPlatillo != null && !this.idPlatillo.equals(other.idPlatillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edwin.web.Platillo[ idPlatillo=" + idPlatillo + " ]";
    }
    
}
