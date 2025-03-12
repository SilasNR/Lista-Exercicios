package com.mycompany.lista1a;

import java.util.Scanner;

/*
 * f) Faça um programa que exibe a área de um triângulo a partir da base e da altura fornecidas pelo usuário.
 */

public class Lista1f {
    public static void main(String[] args) {
        int base, altura, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da base :");
        base = sc.nextInt();
        
        System.out.println("Digite o valor da altura:");
        altura = sc.nextInt();
        
        result = (base * altura) /2;
        
        System.out.println("Area do triangulo :" + result);
    }
}
