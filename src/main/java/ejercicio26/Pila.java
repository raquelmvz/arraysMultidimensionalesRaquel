/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.ArrayList;

/**
 *
 * @author raquel
 */
public class Pila {

    //pila LIFO
    private int tamMaximo;
    private ArrayList<Character> pila;

    //Constructor para la pila
    public Pila(int tam) {
        this.tamMaximo = tam;
        //la pila se inicializa vacia
        this.pila = new ArrayList<>();
    }

    //constructor por defecto
    public Pila() {
        this.pila = new ArrayList<>();
    }

    //apilar elemento (push) donde proceda
    public void push(char elemento) {
        //añade el elemento a la lista donde proceda
        //controla que no sobrepasa del tamaño maximo
        if (pila.size() < tamMaximo) {
            pila.add(elemento);
        }

    }

    //desapilar el elem (pop)
    //saca el elemento que toque
    public char pop() {

        //elimino y devuelvo el elemento en la ultima
        //pos de la lista
        return pila.remove(pila.size() - 1);
    }

    //saber si la pila esta vacia
    public boolean estaVacia() {
        //devuelve true si la lista esta vacia
        return pila.isEmpty();
    }

    //saber si la pila esta llena
    public boolean estaLlena() {
        //devuelve true si la lista NO esta vacia
        return !pila.isEmpty();
    }

    //saber el numero de elementos actual de la pila
    public int numeroElementos() {
        return pila.size();
    }

    //mostrar los elementos de la pila
    public void mostrarPila() {
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.println("___");
            System.out.println(" " + pila.get(i));
        }
        System.out.println("___");
        //pila.forEach(System.out::println);
    }

    //metodo que recibe un array de letras y almacena
    //en la pila los char del array
    //la pila ajusta el tamaño segun el numero de elem
    //del array
    public void rellenar(char[] array) {

        this.tamMaximo = array.length;

        for (int i = 0; i < array.length; i++) {
            //this.pila.add(i, array[i]);
            this.push(array[i]);
        }
    }

    //sacar los elementos de la pila y devolverlos
    //en un array de char
    //la pila se vacia
    public char[] sacarElementos() {
        char[] array = new char[tamMaximo];

        for (int i = 0; i < array.length; i++) {
            array[i] = this.pop();
        }

        return array;

    }
}
