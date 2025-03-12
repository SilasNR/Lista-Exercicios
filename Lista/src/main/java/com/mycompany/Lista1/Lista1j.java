package com.mycompany.Lista1;

import java.util.*;

/*
 * j) Faça um programa que recebe duas notas e exibe a média ponderada dessas notas,
 *  considerando peso dois para a primeira e peso três para a segunda.
 */
public class Lista1j {
    public static void main(String[] args) {
        int a, b, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota : ");
        a = sc.nextInt();

        System.out.println("Digite o valor da segunda nota :");
        b = sc.nextInt();

        media = ((a * 2) + (b * 3)) / (2 + 3);
        
        System.out.printf("A média e de : %d", media);
    }
}
