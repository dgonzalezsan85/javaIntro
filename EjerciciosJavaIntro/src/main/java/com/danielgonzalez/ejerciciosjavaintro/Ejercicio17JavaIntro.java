/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.ejerciciosjavaintro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
public class Ejercicio17JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");

        int tamano = leer.nextInt();

        int[] vector = llenarVector(tamano);
        
        int suma = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;
        
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");
        
        for (int i = 0; i < tamano; i++) {
            int numero = vector[i];
            String numeroString = Integer.toString(numero);
            int cantidadDigitos = numeroString.length();
            
            if (cantidadDigitos == 1) {               
                suma += 1;
            } else if(cantidadDigitos == 2){
                suma2 += 1;
            } else if (cantidadDigitos == 3) {
                suma3 += 1;
            } else if (cantidadDigitos == 4) {
                suma4 += 1;
            } else if (cantidadDigitos == 5) {
                suma5 += 1;
            }
        }
        
        System.out.println("Se encontraron en el vector: \n"
                         + suma + " números de un dígito \n"
                         + suma2 + " números de dos dígitos \n"
                         + suma3 + " números de tres dígitos \n"
                         + suma4 + " números de cuatro dígitos \n"
                         + suma5 + " números de cinco dígitos \n");
        

    }
    
        public static int[] llenarVector(int tamano) {

        int[] vector = new int[tamano];

        Random random = new Random();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100000);
        }

        return vector;
    }
}
