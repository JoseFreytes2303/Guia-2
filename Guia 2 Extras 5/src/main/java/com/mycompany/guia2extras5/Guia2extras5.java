/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras5;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extras5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String letra;
        int valor;
        System.out.println("SOCIOS CLASE A");
        System.out.println("SOCIOS CLASE B");
        System.out.println("SOCIOS CLASE C");
        System.out.println("");
        System.out.println("Ingrese una letra segun la clase de SOCIO");
        letra = sc.next();
        System.out.println("Ingrese el valor del tratamiento");
        valor = sc.nextInt();
        
        switch (letra) {
            case "a":
                System.out.println("El importe final a pagar es: " + (valor * 0.5));
                break;
            case "b":
                System.out.println( " El importe final a pagar es: " + (valor * 0.65));
                break;
            case "c":
                System.out.println( "El importe a pagar es : " + valor );
                break;
            default:
                break;
        }
            
                
                
        }
    }

