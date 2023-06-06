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
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
*/
public class Ejercicio18JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int filas = 4;
        int columnas = 4;
        
        int[][] matriz = new int[filas][columnas];

        matriz = llenarMatriz(filas, columnas);
        
        System.out.println("Matriz A: ");
        System.out.println();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "] "); 
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Matriz B (Traspuesta): ");
        System.out.println();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[j][i] + "] "); 
            }
            System.out.println();
        }
    }
    
    public static int[][] llenarMatriz(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];

        Random random = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
               matriz[i][j] = random.nextInt(100); 
            }   
        }

        return matriz;
    }
    
}
