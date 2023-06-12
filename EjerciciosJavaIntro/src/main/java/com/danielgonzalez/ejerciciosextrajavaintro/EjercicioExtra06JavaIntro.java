/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.ejerciciosextrajavaintro;

import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/
public class EjercicioExtra06JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la antidad de personas a ingresar");
        int n = leer.nextInt();
        
        int[] estaturas = new int[n];
        int sumaMenores = 0;
        int suma = 0;
        int personas = 0;
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Ingrese en cms la estatura de la persona No. " + (i+1));
            estaturas[i] = leer.nextInt();
            suma += estaturas[i];
            
            if (estaturas[i] < 160) {
                sumaMenores += estaturas[i];
                personas += 1;
            }                        
        }
        
        System.out.println("La estatura promedio de las personas menores a 160 cms es igual a: " + (sumaMenores/personas));
        System.out.println("");
        System.out.println("La estatura promedio de las personas ingresadas es igual a: " + (suma/n));
    }
    
}
