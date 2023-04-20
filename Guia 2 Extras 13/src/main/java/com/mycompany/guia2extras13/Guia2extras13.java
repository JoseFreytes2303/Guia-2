/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2extras13 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        for ( int i = 1; i <= num; i++){
            for ( int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
    }
}
