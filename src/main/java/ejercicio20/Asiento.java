/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Objects;

/**
 *
 * @author raquel
 */
public class Asiento {

    public enum Disponibilidad {
        DISPONIBLE, VENDIDO
    };
    private Disponibilidad disponible;

    public Asiento() {
        this.disponible = disponible.DISPONIBLE;
    }

    public Disponibilidad getDisponibilidad() {
        return disponible;
    }

    public void setDisponible() {
        this.disponible = disponible.DISPONIBLE;
    }

    public void setVendido() {
        this.disponible = disponible.VENDIDO;
    }

    public boolean isDisponible() {
        return this.disponible.equals(Disponibilidad.DISPONIBLE);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.disponible);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asiento other = (Asiento) obj;
        if (this.disponible != other.disponible) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Asientos{" + "disponible=" + disponible + '}';
    }

}
