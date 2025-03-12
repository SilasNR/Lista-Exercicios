package com.mycompany.Lista1;

import java.util.Scanner;

/*
 * h) Faça  um  programa  que exibe  quantos  litros  de  combustível  são  gastos  por  um  carro  em  um dado percurso. 
 * Serão fornecidos pelo usuário a distância percorrida(em km)e a quantidade de litros gastos por km.
 * 
 */

public class Lista1h {
    public static void main(String[] args) {
        float kmPercorrido, litrosPorKm, litrosGastos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a distância percorrida :");
        kmPercorrido = sc.nextFloat();

        System.out.println("Digite a quantidade de litros gastos por km :");
        litrosPorKm = sc.nextFloat();

        litrosGastos = kmPercorrido / litrosPorKm ;

        System.out.printf("O total de litros gastos é de : %.2f" , litrosGastos);

    }
}
