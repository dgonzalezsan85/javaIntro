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
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/
public class Ejercicio20JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int filas = 3;
        int columnas = 3;
        
        int[][] matriz = new int[filas][columnas];

        matriz = llenarMatriz(filas, columnas);
        
        int suma = 0;
        
        suma = sumaLado(filas, columnas, matriz);
        
        System.out.println();
        System.out.println("CUADRADO");
        System.out.println();
        
        mostrarMatriz(filas, columnas, matriz);
        
        boolean sumaFilas = validarFilas(filas, columnas, matriz);
        boolean sumaColumnas = validarColumnas(filas, columnas, matriz);
        boolean sumaDiagonales = validarDiagonales(filas, columnas, matriz);
                
        System.out.println();
        
        if (sumaFilas == true && sumaColumnas == true && sumaDiagonales == true) {
            System.out.println("El cuadrado es Magico :)");
        } else  {
            System.out.println("El cuadrado no es Magico :(");
        }
        
    }
    
    public static int[][] llenarMatriz(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];

        Random random = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
               matriz[i][j] = validar();
            }   
        }

        return matriz;
    }
    
    public static void mostrarMatriz(int filas, int columnas, int[][] matriz) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]"); 
            }
            System.out.println();
        }
    }
    
    public static int validar(){
        
        Scanner leer = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Ingrese valor");
            int valor = leer.nextInt();
            
            if (valor > 0 && valor < 10) {
                return valor;
            } else {
               System.out.println("Valor incorrecto"); 
            }  
        }     
    }
    
    public static int sumaLado(int filas, int columnas, int[][] matriz){
        
        int suma = 0;         
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
              suma += matriz[i][j];
            }
            break;
        } 
        return suma;
    }
    
    public static boolean validarFilas(int filas, int columnas, int[][] matriz){
        
        boolean validacion = true;
        boolean[] vectorFilas = new boolean[filas];
        int suma = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
            if (suma == sumaLado(filas, columnas, matriz)) {
                validacion = true;
                vectorFilas[i] = validacion;
            } else {
                validacion = false;
                break;
            }
            suma = 0;
        }       
        return validacion;
    }
    
    public static boolean validarColumnas(int filas, int columnas, int[][] matriz){
        
        boolean validacion = true;
        boolean[] vectorFilas = new boolean[filas];
        int suma = 0;
        
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                suma += matriz[i][j];
            }
            if (suma == sumaLado(filas, columnas, matriz)) {
                validacion = true;
                vectorFilas[j] = validacion;
            } else {
                validacion = false;
                break;
            }
            suma = 0;            
        }
        return validacion;
    }
    
    public static boolean validarDiagonales(int filas, int columnas, int[][] matriz) {
        
        boolean validacion = true;
       
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Suma de la diagonal principal (i == j)
                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }
                // Suma de la diagonal secundaria (i + j == filas - 1)
                if (i + j == filas - 1) {
                    sumaDiagonalSecundaria += matriz[i][j];
                }
            }
        }
       
        // Validación de las diagonales
        if (sumaDiagonalPrincipal != sumaLado(filas, columnas, matriz) || sumaDiagonalSecundaria != sumaLado(filas, columnas, matriz)) {
            validacion = false;
        }       
        return validacion;
    }
}
