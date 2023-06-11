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
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class EjercicioExtra01JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un tiempo en minutos");
        int minutos = leer.nextInt();
        
       diasYHoras(minutos);
        
        
    }
    
    public static void diasYHoras( int minutos){
        
        
        double horas = minutos / 60;
        
        double dias = horas / 24;
        
        System.out.println("Los minutos" + minutos + "ingresados son igual a: \n"
                + dias + " dias\n"
                + horas + " horas");
    }
    
}
