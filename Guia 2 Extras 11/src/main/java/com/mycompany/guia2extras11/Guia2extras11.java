/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras11;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extras11 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = sc.nextInt();
        int contador = 0;
        while ( num != 0){
         num /= 10;
         contador ++;
        }
         System.out.println("El número de dígitos es: " + contador);
         sc.close();
    }
}
//Escribir un programa que lea un número entero y devuelva el número de
//dígitos que componen ese número. Por ejemplo, si introducimos el
//número 12345, el programa deberá devolver 5. Calcular la cantidad de
//dígitos matemáticamente utilizando el operador de división. Nota:
//recordar que las variables de tipo entero truncan los números o
//resultados