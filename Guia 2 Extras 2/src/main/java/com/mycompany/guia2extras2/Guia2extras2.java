/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia2extras2;

/**
 *
 * @author Usuario
 */
public class Guia2extras2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 1, b = 2, c = 3, d = 4, aux;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
//diferente a cada una. A continuación, realizar las instrucciones
//necesarias para que: B tome el valor de C, C tome el valor de A, A tome
//el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
//valores finales de cada variable. Utilizar sólo una variable auxiliar.