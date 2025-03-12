/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lista1;

import java.util.Scanner;

/**
 *
 * @author User
 * 
 * d) Faça um programa que lê o salário base de alguém e exibe o novo salário, considerando 5% de gratificação(mais dinheiro) e 7% de impostos(menos dinheiro)sobre o salário base. Também exiba a gratificação e o imposto.
 */
public class Lista1d {
    public static void main(String[] args) {
        float salario, gratificacao, impostos, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario :");
        salario = sc.nextFloat();
        
        gratificacao = (float) (salario * 0.05);
        impostos = (float) (salario * 0.07);
        result = (float) (salario -(impostos - gratificacao) );
        
        System.out.println("gratificacao :"+ gratificacao+"\nimpostos : "+ impostos+ "\nresultado : "+ result);
    }
}
