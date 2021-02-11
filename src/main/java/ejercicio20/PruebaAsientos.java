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
    
    //mejora
    //guardar aviones en una lista y buscarlos para ejecutar los metodos

    static boolean repetir = true; //el programa se repite
    static Scanner entradaTeclado = new Scanner(System.in);

    public static int pedirFila(int numFilas) {
        int fila;

        System.out.println("Elige la fila:");
        fila = entradaTeclado.nextInt();

        while (fila < 1 || fila > numFilas) {
            System.out.println("Fila no disponible");
            System.out.println("Elige la fila:");
            fila = entradaTeclado.nextInt();

        }

        return fila;
    }

    public static int pedirAsiento(int numCol) {
        int asiento;

        System.out.println("Elige el asiento:");
        asiento = entradaTeclado.nextInt();

        while (asiento < 1 || asiento > numCol) {

            System.out.println("Asiento no disponible");
            System.out.println("Elige el asiento:");
            asiento = entradaTeclado.nextInt();

        }

        return asiento;
    }

    public static void main(String[] args) {

        //creo el avion (lista de asientos)
        int numFilas1 = 25;
        int numColumas1 = 4;
        
        Avion avion1 = new Avion(numFilas1,numColumas1);

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
                    int fila = pedirFila(avion1.getNumFilas());

                    if (avion1.filaDisponible(fila)) {

                        System.out.println("Asientos disponibles en esa fila");
                        avion1.imprimirDisponiblesFila(fila);
                        int asiento = pedirAsiento(avion1.getNumColumnas());

                        avion1.reservarAsiento(fila, asiento);

                        System.out.println("Operacion realizada con éxito");

                    } else {
                        System.out.println("No hay asientos disponibles para esa fila");
                    }

                    break;

                case 2:
                    System.out.println("Ha elegido cancelar asiento");
                    //pido la fila al usuario
                    int filaCancelar = pedirFila(avion1.getNumFilas());
                    int asientoCancelar = pedirAsiento(avion1.getNumColumnas());

                    avion1.cancelarAsiento(filaCancelar, asientoCancelar);
                    System.out.println("Operacion realizada con éxito");

                    break;

                case 3:

                    avion1.imprimirListaEntera();
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
