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
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
 */
public class Ejercicio16JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");

        int tamano = leer.nextInt();

        int[] vector = vectorAleatorio(tamano);

        System.out.println("Ingrese el número a buscar dentro del vector");

        int num = leer.nextInt();

        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("El numero " + num + " se encuentra en las posiciones: ");

        System.out.println("");
        
        int suma = 0;

        for (int i = 0; i < tamano; i++) {
            if (num == vector[i]) {
                System.out.println("[" + i + "]");
                suma += 1;
            }
        }
        
        System.out.println("");
        
        if (suma > 0) {
            System.out.println("El número esta repetido " + suma + " veces"); 
        } else {
            System.out.println("El número no se encontro en el vector");
        }
        
    }

    public static int[] vectorAleatorio(int tamano) {

        int[] vector = new int[tamano];

        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }

        return vector;
    }
}
