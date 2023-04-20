/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una palabra");
        frase = sc.nextLine();
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        
        
        
                }
}
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el
//programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
//Incorrecto. Nota: investigar la función equals() en Java.