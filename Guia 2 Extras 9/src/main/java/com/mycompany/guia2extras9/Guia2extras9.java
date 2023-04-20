/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras9;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extras9 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int resto = 0;
            while (num >= num2){
                num -= num2;
                resto ++;
            }
            int residuo = num;
            System.out.println("El cociente es: " + resto);
        System.out.println("El residuo es: " + residuo);
        
    }
}
//Simular la división usando solamente restas. Dados dos números enteros
//mayores que uno, realizar un algoritmo que calcule el cociente y el
//residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y
//el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas
//sucesivas.
