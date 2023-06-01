/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
*/
public class Ejercicio09JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresaremos una frase");

        String frase = leer.nextLine();
        
        System.out.println("");
        primeraLetra(frase);
    }
    
    public static void primeraLetra(String frase){
        
        String letra = "A";
        if (letra.equals(frase.substring(0,1))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
