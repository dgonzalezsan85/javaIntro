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
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
public class Ejercicio04JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una la cantidad de grados Centigrados para convertir a Fahrenheit");
        double centigrados = leer.nextDouble();
        
        double resultado = convertirCF(centigrados);
        
        System.out.println("Los " + centigrados + " grados centigrados son igual a: \n"
                            + resultado +" grados Fahrenheir");
    }
    
    public static double convertirCF (double centigrados){
    
        return 32 + (9 * (centigrados / 5));
    }
}


