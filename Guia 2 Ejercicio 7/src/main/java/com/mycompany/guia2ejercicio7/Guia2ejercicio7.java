/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String frase;
        int contador = 0, contador2 = 0;
        do {
           System.out.println("Ingrese una frase o palabra de 5 caracter");
        frase = sc.nextLine();
        if (frase.length() == 5){
            if (frase.substring(0, 1).equals("x")&& frase.substring(4, 5).equals("o")){
                    System.out.println("CORRECTO");
                    contador ++; 
                } else {
                    System.out.println("INCORRECTO");
                    contador2 ++;  
                } 
            }
        } while (!frase.equals("&&&&&") );
                  contador2 --;
        System.out.println("La cantidad de palabras correctas es: " + contador );
        System.out.println("La cantidad de palabras incorrectas es: " + contador2 );
        
        
        
        
        
    }
}
