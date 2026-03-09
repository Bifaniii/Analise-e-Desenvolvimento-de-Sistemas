package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine();

        double gratificacao = salarioBase + (salarioBase * 0.5);
        double imposto = salarioBase + (salarioBase * 0.7);

        double salarioReceber = (salarioBase + gratificacao) - imposto;
        System.out.println("O valor a ser recebido em reais é de: " + salarioReceber);
    }
}