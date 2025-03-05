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
public class Lista1b {
    public static void main(String[] args) {
        int A1, A2, A3, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o "+ 1 + " valor :");
        A1 = sc.nextInt();
        
        System.out.println("Digite o "+ 2 + " valor :");
        A2 = sc.nextInt();
        
        System.out.println("Digite o "+ 3 + " valor :");
        A3 = sc.nextInt();
        
        result = ((A1 * 3) + (A2 * 3) + (A3 * 4)) / 10;
        
        System.out.println("Resultado :" + result);
    }
    
    
    
}
