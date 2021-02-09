/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Arrays;

/**
 *
 * @author raquel
 */
public class ListaAsientos {

    private Asiento[][] listaAsientos;

    //el avion tiene 25 filas de 4 asientos cada una
    public ListaAsientos() {
        //poner aqui el result de la lista
        this.listaAsientos = inicializaLista();

    }

    //llenar lista
    public Asiento[][] inicializaLista() {

        Asiento[][] lista = new Asiento[25][4];

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                lista[i][j] = new Asiento();
            }
        }

        return lista;
    }

    public Asiento[][] getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(Asiento[][] listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Arrays.deepHashCode(this.listaAsientos);
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
        final ListaAsientos other = (ListaAsientos) obj;
        if (!Arrays.deepEquals(this.listaAsientos, other.listaAsientos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListaAsientos{" + "listaAsientos=" + listaAsientos + '}';
    }

    //reservar un asiento
    public void reservarAsiento(int fila, int asiento) {

        for (int i = 0; i < listaAsientos.length; i++) {
            for (int j = 0; j < listaAsientos[i].length; j++) {
                if (i == (fila - 1) && j == (asiento - 1) && listaAsientos[i][j].isDisponible()) {
                    listaAsientos[i][j].setVendido();

                }
            }
        }
    }

    //cancelar asiento
    public void cancelarAsiento(int fila, int asiento) {
        for (int i = 0; i < listaAsientos.length; i++) {
            for (int j = 0; j < listaAsientos[i].length; j++) {
                if (i == (fila - 1) && j == (asiento - 1)) {
                    listaAsientos[i][j].setDisponible();

                }
            }
        }
    }

    //mostrar lista asientos completa
    public void imprimirListaEntera() {
        for (int i = 0; i < listaAsientos.length; i++) {
            System.out.println("[Fila: " + (i + 1) + "]");
            for (int j = 0; j < listaAsientos[i].length; j++) {
                System.out.println("        [Asiento: " + (j + 1) + "] = " + listaAsientos[i][j].getDisponibilidad());
            }
        }
    }

//    //imprimir asientos disponibles
//    public void imprimirDisponibles() {
//        for (int i = 0; i < listaAsientos.length; i++) {
//            for (int j = 0; j < listaAsientos[i].length; j++) {
//                System.out.println("[Fila: " + (i + 1) + "]");
//                if (listaAsientos[i][j].isDisponible()) {
//                    System.out.println("        [Asiento: " + (j + 1) + "] = " + listaAsientos[i][j].getDisponibilidad());
//                }
//
//            }
//        }
//    }
    //imprimir disponibles en una fila
    public void imprimirDisponiblesFila(int fila) {

        for (int i = 0; i < listaAsientos.length; i++) {

            if (i == (fila - 1)) {
                System.out.println("[Fila: " + (i + 1) + "]");

                for (int j = 0; j < listaAsientos[i].length; j++) {

                    if (i == (fila - 1) && listaAsientos[i][j].isDisponible()) {
                        System.out.println("        [Asiento: " + (j + 1) + "] = " + listaAsientos[i][j].getDisponibilidad());
                    }

                }
            }

        }
    }

    //devuelve true si en la fila hay algun asiento disponible
    public boolean filaDisponible(int fila) {

        boolean asientosDisponibles = false;

        for (int i = 0; i < listaAsientos.length; i++) {

            if (i == (fila - 1)) {

                for (int j = 0; j < listaAsientos[i].length; j++) {

                    if (listaAsientos[i][j].isDisponible()) {
                        asientosDisponibles = true;
                    } else {
                        asientosDisponibles = false;
                    }
                }
            }

        }

        return asientosDisponibles;
    }

}
