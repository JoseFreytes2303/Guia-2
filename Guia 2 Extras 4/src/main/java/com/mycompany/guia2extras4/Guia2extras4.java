/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2extras4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num;
        String romano = "";
       do {
         System.out.println("Ingrese un numero entre el 1 y 10");
        num = sc.nextInt();  
       } while ((num < 1 || num > 10) );
        switch (num) {
            case 1 -> romano = "I";
            case 2 -> romano = "II";
            case 3 -> romano = "III";
            case 4 -> romano = "IV";
            case 5 -> romano = "V";
            case 6 -> romano = "VI";
            case 7 -> romano = "VII";
            case 8 -> romano = "VIII";
            case 9 -> romano = "IX";
            case 10 -> romano = "X";
            default -> {
            }
        }
       System.out.println("El numero ingresado: " + num + " En romano es: " + romano);
    }
}
//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
//muestre su equivalente en romano.