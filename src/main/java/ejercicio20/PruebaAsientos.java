/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author raquel
 */
public class PruebaAsientos {

    public static void main(String[] args) {

        //creo la lista de asientos
        ListaAsientos lista = new ListaAsientos();

        //lleno lista
        lista.llenarLista();

        //imprimo lista
        //lista.imprimirListaEntera();
        //compro varios asientos
        lista.reservarAsiento(20, 2);
        lista.reservarAsiento(1, 1);
        lista.reservarAsiento(3, 2);
        lista.reservarAsiento(3, 3);
        lista.reservarAsiento(5, 3);
        lista.reservarAsiento(10, 1);
        lista.reservarAsiento(10, 2);
        lista.reservarAsiento(13, 3);
        lista.reservarAsiento(12, 1);
        lista.reservarAsiento(16, 2);
        lista.reservarAsiento(17, 1);
        lista.reservarAsiento(19, 1);

        lista.imprimirListaEntera();
        //imprimir disponibles
        //lista.imprimirDisponibles();

        System.out.println("--------------------------");
        //cancelar asiento
        lista.cancelarAsiento(20, 2);
        lista.cancelarAsiento(1, 1);
        lista.imprimirListaEntera();

    }

}
