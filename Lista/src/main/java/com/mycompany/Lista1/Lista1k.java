package com.mycompany.Lista1;

import java.util.*;

/*
 * k) Um funcionário recebe um salário fixo acrescido de 4% de comissão sobre suas vendas. 
 * Faça um programa que recebe o salário fixo e a soma de tudo que ele vendeu, e mostre a comissão e o salário final do funcionário.
 */

public class Lista1k {
    public static void main(String[] args) {
        float salario, vendas, fixo;

        Scanner sc =new Scanner(System.in);
        
        System.out.println("Digite o salário fixo : ");
        fixo = sc.nextFloat();

        System.out.println("Digite o total de vendas deste mês :");
        vendas = sc.nextFloat();

        salario =(float) (fixo + (vendas * 0.04));

        System.out.printf("O salário total é de : %#.2f", salario);
    }
}
