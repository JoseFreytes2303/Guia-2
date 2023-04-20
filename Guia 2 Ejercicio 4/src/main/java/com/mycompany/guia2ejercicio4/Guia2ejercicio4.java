/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase = sc.nextLine();
        if (frase.substring(0,1).equals("a")){
           System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
//Escriba un programa que pida una frase o palabra y valide si la primera
//letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
//imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
//contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
//Substring y equals() de Java.