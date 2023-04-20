/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase = sc.nextLine();
        if (frase.length() == 8){
        System.out.println("CORRECTO");
            
        } else {
            System.out.println( "INCORRECTO");
        }
        
        
    }
}
//Realizar un programa que solo permita introducir solo frases o palabras
//de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
//deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
//caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
//función Lenght() en Java.
