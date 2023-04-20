/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras7ii;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2extras7II {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int num = sc.nextInt();
        int contador = 0;
        int numeroMaximo = Integer.MIN_VALUE;
        int numeroMinimo = Integer.MAX_VALUE;
        int suma = 0;
        while (contador < num){
         System.out.println("Introduzca los numeros");
        int num2 = sc.nextInt();
        if (num > numeroMaximo){
            numeroMaximo = num2;
        }
        if (num2 < numeroMinimo){
            numeroMinimo = num2;
        }
        suma = suma + num2;
        contador ++;   
        }
        
         System.out.println("La suma de los números introducidos es: " + suma);
         System.out.println("El número más alto introducido es: " + numeroMaximo);
         System.out.println("El número más bajo introducido es: " + numeroMinimo);
         System.out.println("El promedio del los numeros ingresados es: " + suma / contador);
        
    }
}
