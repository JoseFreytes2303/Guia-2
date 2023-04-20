/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras14;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extras14 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias");
        int familia = sc.nextInt();
        int totalHijos = 0;
        int totalEdad = 0;
        for (int i =1; i <= familia; i++){
            System.out.println("Ingrese la cantidad de hijos " + i + ": ");
            int hijos = sc.nextInt();
            totalHijos += hijos;
            for (int j = 1 ; j <= hijos; j++){
                System.out.print("Infrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edad = sc.nextInt();
                totalEdad += edad;
                
            }
            
        }
        double mediaEdad = (double) totalEdad / totalHijos;
        System.out.println("");
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
//Se dispone de un conjunto de N familias, cada una de las cuales tiene
//una M cantidad de hijos. Escriba un programa que pida la cantidad de
//familias y para cada familia la cantidad de hijos para averiguar la media
//de edad de los hijos de todas las familias.