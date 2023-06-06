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
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class Ejercicio13JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de un cuadrado para ser dibujado");
        int lado = leer.nextInt();
        dibujarCuadrado(lado);
    }

    public static void dibujarCuadrado(int lado) {

        for (int i = 0; i < lado; i++) {
            if (i == 0 || i == lado - 1) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                System.out.print("*");
                for (int j = 0; j < lado - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

}
