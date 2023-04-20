/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras7;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extras7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int num = sc.nextInt();
        int suma = 0;
        int contador = 0;
        int numeroMaximo = Integer.MIN_VALUE;
        int numeroMinimo = Integer.MAX_VALUE;
        do {
            System.out.println("Introduzca los numeros");
            int num2 = sc.nextInt();
            if (num2 > numeroMaximo) {
               numeroMaximo = num2; 
            }
            if (num2 < numeroMinimo){
                numeroMinimo = num2;
            }
            suma = suma + num2;
            contador ++;
            
        } while(contador < num);
         System.out.println("La suma de los números introducidos es: " + suma);
         System.out.println("El número más alto introducido es: " + numeroMaximo);
         System.out.println("El número más bajo introducido es: " + numeroMinimo);
         System.out.println("El promedio del los numeros ingresados es: " + suma / contador);
    }
}
//Realice un programa que calcule y visualice el valor máximo, el valor
//mínimo y el promedio de n números (n>0). El valor de n se solicitará al
//principio del programa y los números serán introducidos por el usuario.
//Realice dos versiones del programa, una usando el bucle “while” y otra
//con el bucle “do - while”.