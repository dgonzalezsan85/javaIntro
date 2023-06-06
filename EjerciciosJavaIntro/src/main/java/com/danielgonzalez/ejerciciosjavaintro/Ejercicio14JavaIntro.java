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
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
public class Ejercicio14JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros a convertir");
        float cantidadEuros = leer.nextFloat();
        
        System.out.println("");
        System.out.println("Ingrese la monedad a la cual desea convertir: \n"
                 + "Dolares\n"
                 + "Yenes\n"
                 + "Libras");
        String eleccion = leer.next();
        
        String moneda = eleccion.toUpperCase();
        
        cambio(cantidadEuros, moneda);
    }
    
    public static void cambio(float cantidadEuros, String moneda) {

        switch (moneda) {
            case "DOLARES":
                    System.out.println("Los " + cantidadEuros + " €"
                    + " equivalen a " + (cantidadEuros * 1.28611) + " Dolares");
                break;
            case "YENES":
                    System.out.println("Los " + cantidadEuros + " €\n"
                    + "equivalen a " + (cantidadEuros * 129.852) + " Yenes");
                break;
            case "LIBRAS":
                    System.out.println("Los " + cantidadEuros + " €\n"
                    + "equivalen a " + (cantidadEuros * 0.86) + " Libras");
                break;
            default:
                System.out.println("Ingresaste una moneda incorrecta");
        }
    }
    
}

   
