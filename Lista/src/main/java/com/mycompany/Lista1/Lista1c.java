/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1a;

import java.util.Scanner;

/**
 *
 * @author User
 * 
 * c) Faça um programa que lê o salário atual de alguém e exibe o novo salário que é o atual com 25%de aumento.
 */
public class Lista1c {
    public static void main(String[] args) {
        float salario, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario :");
        salario = sc.nextFloat();
        
        result = (float) (salario * 1.25);
        
        System.out.println("resultado : "+ result);
    }
}
