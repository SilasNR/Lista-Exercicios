package com.mycompany.lista2;

import java.util.*;

/*
 * a) Faça um programa que recebe duas notas, 
 * exibe a média aritmética das notas e uma mensagem indicando se o aluno 
 * foi aprovado ou reprovado. A média para aprovação deve ser maior que seis.
 */

public class Lista2a {
    public static void main(String[] args) {
        float num1, num2, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota :");
        num1 = sc.nextFloat();

        System.out.println("Digite a segunda nota :");
        num2 = sc.nextFloat();

        media = (num1 + num2) / 2;

        System.out.printf("A média é de %.2f,para passar é necessário 6.0 \nvocê foi : %s ",media ,verificar(num1, num2, media));
    }

    public static String verificar(float num1, float num2, float media) {
        String result;
        if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
            if (media < 6) {
                result = "Reprovado :(";
            } else {
                result = "Aprovado :)";
            }
        } else {
            result = "Resultado inconclusivo";
        }
        return result;

    }
}
