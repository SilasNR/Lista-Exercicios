package com.mycompany.lista1a;

import java.util.*;

/*
 * l) Faça um programa que recebe o ano de nascimento de uma pessoa e o ano atual, e exibe a idade dessa pessoa em anos.
 */

public class Lista1l {
    public static void main(String[] args) {
        int anoNascimento, anoAtual, idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento : ");
        anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual :");
        anoAtual = sc.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.printf("Sua idade atual é de : %d", idade);
    }
}
