/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es PAR");    
        }else {
            System.out.println("El numero ingresado NO ES PAR");
        }
        
        
    }
}
//Crear un programa que dado un número determine si es par o impar.
