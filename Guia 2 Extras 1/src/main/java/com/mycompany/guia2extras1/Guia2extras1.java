/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2extras1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int minutos,dias,horas;
        System.out.println("Ingrese el tiempo en minutos");
        minutos = sc.nextInt();
        dias = (minutos / 1440);
        horas = (minutos % 1440) / 60;
        System.out.println("El tiemo en dias es: " + dias + " dia, con " + horas + " horas" );
        
    }
}
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas