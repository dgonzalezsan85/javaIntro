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
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
*/
public class Ejercicio07JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresaremos una frase");

        String frase = leer.nextLine();
        
        System.out.println("");
        esIgual(frase);
        
    }
    
    public static void esIgual(String frase){
        
        if (frase.equals("eureka")) {
            System.out.println("Esa es la frase correcta :)");
        } else {
            System.out.println("Esa frase es incorrecta :(");
        }
    }
    
}
