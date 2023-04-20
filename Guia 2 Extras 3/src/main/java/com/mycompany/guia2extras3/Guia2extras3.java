/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2extras3 {

    public static void main(String[] args) {
        System.out.println("Ingrese una letra");
        Scanner sc = new Scanner(System.in); 
        String letra;
        
        letra = sc.nextLine();
        if (letra.length() == 1){
            if (letra.equals("a") || letra.equals("e")|| letra.equals("i")||letra.equals("o")||letra.equals("u")){
                System.out.println("La letra ingresada es VOCAL");
                
            } else {
                System.out.println("La letra ingresada es CONSONANTE");
            }
           
        } else {
            System.out.println("Por favor ingrese solo una letra");
        }
    }
}
//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
//ata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
//la función equals() de la clase String.
