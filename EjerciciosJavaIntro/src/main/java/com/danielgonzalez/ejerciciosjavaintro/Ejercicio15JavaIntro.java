/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.ejerciciosjavaintro;

/**
 *
 * @author danielgonzalez
 */
/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/
public class Ejercicio15JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Vector con los primeros 100 números enteros en orden descendente");
        
        int tamano = 100;
        
        int[] vector = new int[tamano];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        System.out.println("");
        System.out.println("El vector invertido es igual a: ");
        
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
    
    
}
