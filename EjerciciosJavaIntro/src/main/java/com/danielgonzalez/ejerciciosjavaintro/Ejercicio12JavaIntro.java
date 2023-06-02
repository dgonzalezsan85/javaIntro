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
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
public class Ejercicio12JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String secuencia = "";
        
        validarSecuencia(secuencia);
    }
    
    public static void validarSecuencia (String secuencia){
        String letraInicial = "X";
        String letraFinal = "O";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una secuencia para ser validada");
        secuencia = leer.nextLine();
        
        int longitud = secuencia.length();
        
        do {            
            if (letraInicial.equals(secuencia.substring(0, 1)) && letraFinal.equals(secuencia.substring(longitud -1)) && longitud == 5) {
                System.out.println("Secuencia correcta");
                System.out.println("");
                System.out.println("Ingrese una secuencia para ser validada");
                secuencia = leer.nextLine();
            } else {
                System.out.println("Secuencia incorrecta");
                System.out.println("");
                System.out.println("Ingrese una secuencia para ser validada");
                secuencia = leer.nextLine();
            }
        } while (!secuencia.equals("&&&&&"));
        
    }
    
}
