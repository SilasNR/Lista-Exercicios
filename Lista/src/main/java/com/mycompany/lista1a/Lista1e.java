/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1a;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lista1e {
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
