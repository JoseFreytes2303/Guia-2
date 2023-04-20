/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2extras8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int contador = 0;
        while (true){
         System.out.println("Ingrese numeros enteros");
         int num = sc.nextInt();
         if (num < 0){
             continue;
         }
         contador ++;
         if (num % 2 == 0){
             pares ++;
         } else {
             impares ++;
         }
         if (num % 5 == 0){
                System.out.println("Se ha encontrado un múltiplo de 5.");
                System.out.println("Cantidad de números leídos: " + contador);
                System.out.println("Cantidad de números pares: " + pares);
                System.out.println("Cantidad de números impares: " + impares);
                break;
         }
        }
        sc.close();
    }
        
    }

//Escriba un programa que lea números enteros. Si el número es múltiplo
//de cinco debe detener la lectura y mostrar la cantidad de números
//leídos, la cantidad de números pares y la cantidad de números impares.
//Al igual que en el ejercicio anterior los números negativos no deben
//sumarse. Nota: recordar el uso de la sentencia break.