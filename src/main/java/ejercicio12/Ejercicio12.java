/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Random;

/**
 *
 * @author raquel
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        //Declaracion de matriz de caracteres 2x3
        char[][] caracteres = new char[2][3];

        //Inicializacion de matriz
        inicializaMatriz(caracteres);

        //imprimir matriz
        imprimeMatriz(caracteres);
    }

    //metodo que recibe una matriz de caracteres y la imprime por consola
    //usar for anidados
    public static void imprimeMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = "
                        + matriz[i][j]);
            }

        }

    }

    //metodo que devuelve caracteres aleatorios
    public static char devuelveCaracter() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');

    }

    //metodo que inicializa un array matriz
    public static void inicializaMatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = devuelveCaracter();
            }
        }
    }
}
