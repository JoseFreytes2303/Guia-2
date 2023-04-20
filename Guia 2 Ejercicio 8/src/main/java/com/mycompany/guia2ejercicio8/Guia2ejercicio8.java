/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        for (int i = 0 ; i < num; i++){ 
            //Completamos i con espacios
             System.out.println( "" ); 
            for (int j = 0; j < num; j++){
             // Recorrer las FILLAS
              if (i == 0 || i == num -1 || j == 0 || j == num-1){
                  System.out.print(" * ");
              } else {
                  System.out.print("   ");
              }   
            }
                 
        }
           }
            }
        
       
        
        
    

//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
//lo siguiente:
