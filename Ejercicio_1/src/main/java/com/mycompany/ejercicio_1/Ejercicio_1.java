/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class Ejercicio_1 {
    public static void main(String[]args){
    //Declaramos las variables (doubles por si se quieren introducir decimales)
    double numero_1 = 0;
    double numero_2 = 0;

    System.out.println("Veamos cuál de los dos números que va a introducir es mayor, o, si son iguales: ");
    
    //Pedimos el primer valor con su Scanner correspondiente
    System.out.print("Introduzca un número: ");
    Scanner a = new Scanner(System.in);
    numero_1 = a.nextDouble();
    
    //Pedimos el segundo valor con su Scanner correspondiente
    System.out.print("Introduzca otro número: ");
    Scanner b = new Scanner(System.in);
    numero_2 = b.nextDouble();
    
    //Hacemos los if para ver qué número es mayor, o, si son iguales
    if (numero_1 > numero_2){
        System.out.println("El número " + numero_1 + " es el mayor.");
    } else if (numero_1 < numero_2){
        System.out.println("El número " + numero_2 + " es el mayor.");
    } else if (numero_1 == numero_2){
        System.out.println("Ambos números son iguales.");
    }
}
}