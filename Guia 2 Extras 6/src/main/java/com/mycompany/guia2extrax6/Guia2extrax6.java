/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extrax6;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extrax6 {

    public static void main(String[] args) {
       //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       int num, contador = 0, contador2 = 0;
       double altura, suma = 0, suma2 = 0;
       System.out.println("Ingrese la cantidad de personas");
       num = sc.nextInt();
       do {
           System.out.println("Ingrese las alturas");
           altura = sc.nextDouble();
           suma += altura;
          contador2 ++; 
          if (altura <= 1.60){
           contador ++;
           suma2 += altura;
       }
       } while (contador2 != num);
        
       System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + suma2 / contador);
       System.out.println("El promedio de estaturas en general : " + suma / contador2);
    }
    
}
//Leer la altura de N personas y determinar el promedio de estaturas que
//se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
//general.
