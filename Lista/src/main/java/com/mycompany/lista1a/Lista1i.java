package com.mycompany.lista1a;


import java.util.*;
/*
 * 
 * i) Faça um programa que, a partir da idade e o ano atual,calcule e exiba a idade que apessoa teria na virada do próximo século.
 * 
 */

public class Lista1i {
    public static void main(String[] args) {
        int idade, anoAtual, idade_Sec ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade : ");
        idade = sc.nextInt();

        System.out.println("Digite o ano atual : ");
        anoAtual = sc.nextInt();

        idade_Sec = idade + 100;

        System.out.printf("No ano de %d você teria %d anos!!", (anoAtual + 100) , idade_Sec);
    }
    
}
