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
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
public class Ejercicio10JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int limite = 20;
        int suma = 0;
        
        do {            
            System.out.println("Ingresaremos el número a sumar");
            int num = leer.nextInt();
            
            suma = suma + num;
        } while (suma < limite);
        
    }
    
}
