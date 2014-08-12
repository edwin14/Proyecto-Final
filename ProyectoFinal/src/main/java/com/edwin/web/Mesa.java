
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
@Table(name = "mesa")

public class Mesa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mesa")
    private Integer idMesa;
    @Column(name = "num_mesa")
    private Float numMesa;
    @Column(name = "personas_mesa")
    private Float personasMesa;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente idCliente;

    public Mesa() {
    }

    public Mesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Mesa(Float numMesa, Float personasMesa, Cliente idCliente) {
        this.numMesa = numMesa;
        this.personasMesa = personasMesa;
        this.idCliente = idCliente;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Float getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(Float numMesa) {
        this.numMesa = numMesa;
    }

    public Float getPersonasMesa() {
        return personasMesa;
    }

    public void setPersonasMesa(Float personasMesa) {
        this.personasMesa = personasMesa;
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
        hash += (idMesa != null ? idMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.idMesa == null && other.idMesa != null) || (this.idMesa != null && !this.idMesa.equals(other.idMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edwin.web.Mesa[ idMesa=" + idMesa + " ]";
    }
    
}
