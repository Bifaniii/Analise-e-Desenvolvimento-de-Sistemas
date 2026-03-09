package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite agora seu salário fixo: ");
        float salarioFixo = sc.nextFloat();

        System.out.println("Digite agora o total de vendas que realizou: ");
        float vendas = sc.nextFloat();

        salarioFixo = (float) (salarioFixo + (0.15 * vendas));

        System.out.println(nome + ", Seu salário com as comissões é igual a R$ " + salarioFixo);
    }
}