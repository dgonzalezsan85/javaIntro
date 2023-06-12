/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.ejerciciosextrajavaintro;

import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/
public class EjercicioExtra05JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la clase de socio");
        String input = leer.nextLine();
        
        String clase = input.toUpperCase();
        
        System.out.println("Ingrese el valor del tratamiento");
        int tratamiento = leer.nextInt();
        
        switch (clase) {
            case "A":
                System.out.println("El costo real para el tratamiento indicado, siendo socio de Clase A, \n"
                        + "con un descuento del 50% es igual a: ");
                System.out.println("$ " + tratamiento * 0.5);
                break;
            case "B":
                System.out.println("El costo real para el tratamiento indicado, siendo socio de Clase B, \n"
                        + "con un descuento del 35% es igual a: ");
                System.out.println("$ " + tratamiento * 0.35);
                break;
            case "C":
                System.out.println("El costo real para el tratamiento indicado, siendo socio de Clase C, \n"
                        + "sin descuento es igual a: ");
                System.out.println("$ " + tratamiento);
                break;
            default:
                System.out.println("Ha ingresado una clase incrrecta");
        }
    }
    
}
