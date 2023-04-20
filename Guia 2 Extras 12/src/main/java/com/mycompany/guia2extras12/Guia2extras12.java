/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras12;

/**
 *
 * @author Usuario
 */
public class Guia2extras12 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                for (int k = 0; k <= 9; k++){
                    String num1 = Integer.toString(i).replace("3", "E");
                    String num2 = Integer.toString(j).replace("3", "E");
                    String num3 = Integer.toString(k).replace("3", "E");
                    System.out.println(num1 + "-" + num2 + "-" + num3);
                }
            }
        }
    }
}
//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
//números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
//aparezca un 3 lo sustituya por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.