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
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/

public class Ejercicio01JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresaremos dos números enteros, para realizar una suma");
        System.out.println("");
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");   
        int num2 = leer.nextInt();
        
        int resultado = suma(num1, num2);
        
        System.out.println("El resultado de la suma es " + resultado);  
    }
    
    public static int suma(int num1, int num2){
        
        return num1 + num2;
    }
    
}
