/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num1,num2, opcion;
        String letra;
        boolean lock = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivo");
        num1 = sc.nextInt();
        num2 = sc.nextInt();sc.nextLine();
          
        
        do {
           System.out.println("MENU");
           System.out.println("1 - SUMA");
           System.out.println("2 - RESTA");
           System.out.println("3 - MULTIPLICACION");
           System.out.println("4 - DIVISION");
           System.out.println("5 - SALIR");
           System.out.println(" ");
           System.out.println("Elija una opcion valida");
           opcion = sc.nextInt();
           switch (opcion) {
               case 1 -> System.out.println("La suma de los numero es: " + (num1 + num2) );
               case 2 -> System.out.println("La resta de los numeros es: " + (num1 - num2));
               case 3 -> System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
               case 4 -> System.out.println("La division de los numeros es: " + (num1 / num2));
               case 5 -> {
                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   letra = sc.next();
                   if (letra.equalsIgnoreCase("s")){
                       lock = true;
                       System.out.println("Gracias! Hasta pronto");
                   }    }
               default -> System.out.println("Opcion invalida" );
           
        } 
        
    }while (lock == false);
}
}
