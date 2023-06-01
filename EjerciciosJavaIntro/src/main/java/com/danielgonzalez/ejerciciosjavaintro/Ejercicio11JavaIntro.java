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
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
public class Ejercicio11JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresaremos dos números enteros, para utilizar la calculadora");
        System.out.println("");
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");   
        int num2 = leer.nextInt();
        
        menu();
        int opcion = leer.nextInt();
        String respuesta = "";
        
        do { 

            switch (opcion) {
                case 1 -> {
                    System.out.println("");
                    System.out.println("El resultado de sumar los dos numeros es igual a: " + (num1 + num2));
                    System.out.println("");
                    menu();
                    opcion = leer.nextInt();
                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("El resultado de restar los dos numeros es igual a: " + (num1 - num2));
                    System.out.println("");
                    menu();
                    opcion = leer.nextInt();
                }
                case 3 -> {
                    System.out.println("");
                    System.out.println("El resultado de multiplicar los dos numeros es igual a: " + (num1 * num2));
                    System.out.println("");
                    menu();
                    opcion = leer.nextInt();
                }
                case 4 -> {
                    System.out.println("");
                    System.out.println("El resultado de dividir los dos numeros es igual a: " + (num1 / num2));
                    System.out.println("");
                    menu();
                    opcion = leer.nextInt();
                }
                case 5 -> {
                    System.out.println("");
                    System.out.println("Esta seguro que desea salir de la calculadora? (S/N)");
                    String rpt = leer.next();
                    respuesta = rpt.toUpperCase();
                    if (respuesta.equals("S")) {
                    } else {
                        menu();
                        opcion = leer.nextInt();
                    }
                }
                default -> {
                        System.out.println("");
                        System.out.println("Ha ingresado una opción incorrecta, vuelva a intentarlo");
                        System.out.println("");
                        menu();
                        opcion = leer.nextInt();
                }
            }
        } while (!respuesta.equals("S"));
        
    }
    
    public static void menu () {
        System.out.println("******************");
        System.out.println("*      MENU      *");
        System.out.println("*1. Sumar        *");
        System.out.println("*2. Restar       *");
        System.out.println("*3. Multiplicar  *");
        System.out.println("*4. Dividir      *");
        System.out.println("*5. Salir        *");
        System.out.println("******************");
        System.out.println("");
        System.out.println("Elija una opción");
    }
    
}
