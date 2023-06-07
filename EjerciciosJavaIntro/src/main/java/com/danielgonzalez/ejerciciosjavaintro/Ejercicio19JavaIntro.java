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
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
public class Ejercicio19JavaIntro {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int filas = 3;
        int columnas = 3;
        
        int[][] matriz = new int[filas][columnas];

        matriz = llenarMatriz(filas, columnas);
        
        System.out.println("Matriz A: ");
        System.out.println();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]"); 
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Matriz AT (Traspuesta): ");
        System.out.println();
        
        int [][] matrizTraspuesta = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }     
        }
        
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matrizTraspuesta[i][j] + "]"); 
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Matriz -AT (Transpuesta Cambiada de signo): ");
        System.out.println();
        
        int [][] matrizAntisimetrica = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizAntisimetrica[i][j] = (matrizTraspuesta[i][j] * -1);
            }     
        }
        
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matrizAntisimetrica[i][j] + "]"); 
            }
            System.out.println();
        }
        
        boolean sonIguales = compararMatrices(matriz, matrizAntisimetrica);
        
        System.out.println("");
        
        if (sonIguales) {
            System.out.println("Las matriz es anti simétrica.");
        } else {
            System.out.println("Las matriz no es anti simétrica.");
        }
    }
    
    public static int[][] llenarMatriz(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];

        Random random = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
               matriz[i][j] = random.nextInt(11)-5; 
            }   
        }
        
        /*int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};*/

        return matriz;
    }
    
    public static boolean compararMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false; // Si las dimensiones son diferentes, las matrices no pueden ser iguales
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false; // Si se encuentra al menos una diferencia, las matrices no son iguales
                }
            }
        }
        
        return true; // Si no se encontraron diferencias, las matrices son iguales
    }
}
