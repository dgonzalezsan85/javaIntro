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
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
public class Ejercicio05JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresaremos un número entero");

        int num = leer.nextInt();
        
        System.out.println("");
        
        System.out.println("El doble del número ingresado es igual a: " + (num * num) 
                         + "\nEl triple del número ingresado es igual a: " + (num * num * num)
                         + "\nLa raíz cuadrada del número ingresado es igual a: " + Math.sqrt(num));
    }
    
}
