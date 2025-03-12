/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1a;

import java.util.Scanner;

/**
 *
 * @author User
 * 
 * a) Faça um programa que recebe três números reais e exibe a multiplicação desses números.
 */
public class Lista1a {

    public static void main(String[] args) {
        float a, b, c, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o "+ 1 + " valor :");
        a = sc.nextFloat();
        
        System.out.println("Digite o "+ 2 + " valor :");
        b = sc.nextFloat();
        
        System.out.println("Digite o "+ 3 + " valor :");
        c = sc.nextFloat();
        
        result = a * b* c;
        
        System.out.println("resltado da multiplicacao :" + result);
    }
}
