/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Arrays;

/**
 *
 * @author raquel
 */
public class PruebaPila {

    public static void main(String[] args) {

        Pila pila1 = new Pila(5);

        pila1.push('a');
        pila1.push('b');
        pila1.push('c');
        pila1.push('d');
        pila1.push('e');

        System.out.println("Lista antes");
        pila1.mostrarPila();

        pila1.pop();
        pila1.pop();
        System.out.println("\nDespués de sacar con el metodo pop los dos ultimos elementos");
        pila1.mostrarPila();

        System.out.println("¿La lista esta llena? -- " + pila1.estaLlena());

        System.out.println("Num elementos actual: " + pila1.numeroElementos());

        System.out.println("-------------\n"
                + "Pasando un array como parametro");
        char[] array = {'1', '2', '3', '4', '5', '6', '7'};

        Pila pila2 = new Pila();

        pila2.rellenar(array);

        System.out.println("Mostrar pila 2:");
        pila2.mostrarPila();

        System.out.println("\nDespues de vaciar la pila y pasarla a otra:");

        char[] pilaSacada = pila2.sacarElementos();

        Pila pila3 = new Pila();
        pila3.rellenar(pilaSacada);
        pila3.mostrarPila();

        System.out.println("\nMostrar la pila 2 vacía: ");
        pila2.mostrarPila();

    }

}
