/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras10;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia2extras10 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        int resultado = num * num2;
        int respuesta;
        System.out.println("Adivine el resultado de la multiplicacion");
        do {
            respuesta = sc.nextInt();
            if (respuesta == resultado){
                System.out.println("¡Correcto!"); 
            } else {
                System.out.println("Incorrecto. Intenta de nuevo."); 
            }
           } while (respuesta != resultado);
           sc.close();
        
    }
}
//Realice un programa para que el usuario adivine el resultado de una
//multiplicación entre dos números generados aleatoriamente entre 0 y 10.
//El programa debe indicar al usuario si su respuesta es o no correcta. En
//caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
//su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.