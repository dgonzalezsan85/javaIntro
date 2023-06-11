/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.ejerciciosextrajavaintro;

/**
 *
 * @author danielgonzalez
 */
/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
public class EjercicioExtra02JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        
        int aux = 0;
        
        System.out.println("Valores iniciales: \n"
                + "A = " + A + "\n"
                + "B = " + B + "\n"
                + "C = " + C + "\n"
                + "D = " + D + "\n");
        
        aux = B;
        
        B = C;
        
        C = A;
        
        A = D;
        
        D = aux;
        
        System.out.println("Valores finales: \n"
                + "A = " + A + "\n"
                + "B = " + B + "\n"
                + "C = " + C + "\n"
                + "D = " + D + "\n");   
        
    }
    
}
