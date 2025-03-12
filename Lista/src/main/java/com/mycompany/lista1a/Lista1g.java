package com.mycompany.lista1a;

import java.util.Scanner;

/*
 * g) Faça um programa que exibe a área de um círculo a partir do perímetro fornecido pelo usuário.
 * 
 */

public class Lista1g {
    public static void main(String[] args) {
        float raio, result;
        final float pi =(float) 3.14159;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio :");
        raio = sc.nextFloat();
        
        result =(float) (pi * Math.pow(raio,2));
        
        System.out.println("Area do círculo:" + result);
    }
}
