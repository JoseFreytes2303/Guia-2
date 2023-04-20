/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");
        int valor, num, contador = 0;
        System.out.println("Ingrese un valor de limite positivo");
        valor = sc.nextInt();
        do {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            contador = (contador + num);
        } while( contador <= valor);
        System.out.println("La suma de los numeros ingresados supera al valor limite");
    }
}
//Escriba un programa en el cual se ingrese un valor límite positivo, y a
//continuación solicite números al usuario hasta que la suma de los
//números introducidos supere el límite inicial.