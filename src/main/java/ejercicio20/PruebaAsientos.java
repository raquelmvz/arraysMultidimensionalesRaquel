/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class PruebaAsientos {

    static boolean repetir = true; //el programa se repite
    static Scanner entradaTeclado = new Scanner(System.in);

    public static int pedirFila() {
        int fila;

        System.out.println("Elige la fila:");
        fila = entradaTeclado.nextInt();

        while (fila < 1 || fila > 25) {
            System.out.println("Fila no disponible");
            System.out.println("Elige la fila:");
            fila = entradaTeclado.nextInt();

        }

        return fila;
    }

    public static int pedirAsiento() {
        int asiento;

        System.out.println("Elige el asiento:");
        asiento = entradaTeclado.nextInt();

        while (asiento < 1 || asiento > 4) {

            System.out.println("Asiento no disponible");
            System.out.println("Elige el asiento:");
            asiento = entradaTeclado.nextInt();

        }

        return asiento;
    }

    public static void main(String[] args) {

        //creo la lista de asientos
        ListaAsientos lista = new ListaAsientos();

        //menu
        do {

            System.out.println("MENÚ PRINCIPAL\n"
                    + "Marca la opción deseada\n"
                    + "1. RESERVAR ASIENTO\n"
                    + "2. CANCELAR ASIENTO\n"
                    + "3. MOSTRAR ASIENTOS\n"
                    + "4. SALIR\n");

            int opcionesMenu = entradaTeclado.nextInt();

            switch (opcionesMenu) {

                case 1:

                    System.out.println("Ha elegido reservar asiento");
                    //pido la fila al usuario
                    int fila = pedirFila();

                    if (lista.filaDisponible(fila)) {

                        System.out.println("Asientos disponibles en esa fila");
                        lista.imprimirDisponiblesFila(fila);
                        int asiento = pedirAsiento();

                        lista.reservarAsiento(fila, asiento);

                        System.out.println("Operacion realizada con éxito");

                    } else {
                        System.out.println("No hay asientos disponibles para esa fila");
                    }

                    break;

                case 2:
                    System.out.println("Ha elegido cancelar asiento");
                    //pido la fila al usuario
                    int filaCancelar = pedirFila();
                    int asientoCancelar = pedirAsiento();

                    lista.cancelarAsiento(filaCancelar, asientoCancelar);
                    System.out.println("Operacion realizada con éxito");

                    break;

                case 3:

                    lista.imprimirListaEntera();
                    break;

                case 4:

                    repetir = false;

            }

        } while (repetir);

        //imprimo lista
        //lista.imprimirListaEntera();
        //compro varios asientos
//        lista.reservarAsiento(20, 2);
//        lista.reservarAsiento(1, 1);
//        lista.reservarAsiento(3, 2);
//        lista.reservarAsiento(3, 3);
//        lista.reservarAsiento(5, 3);
//        lista.reservarAsiento(10, 1);
//        lista.reservarAsiento(10, 2);
//        lista.reservarAsiento(13, 3);
//        lista.reservarAsiento(12, 1);
//        lista.reservarAsiento(16, 2);
//        lista.reservarAsiento(17, 1);
//        lista.reservarAsiento(19, 1);
//
//        lista.imprimirListaEntera();
//        //imprimir disponibles
//        //lista.imprimirDisponibles();
//
//        System.out.println("--------------------------");
//        //cancelar asiento
//        lista.cancelarAsiento(20, 2);
//        lista.cancelarAsiento(1, 1);
//        lista.imprimirListaEntera();
    }

}
