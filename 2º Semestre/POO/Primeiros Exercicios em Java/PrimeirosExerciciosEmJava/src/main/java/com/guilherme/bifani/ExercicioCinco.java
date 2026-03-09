package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do aluguel: ");
        double valorAluguel = sc.nextDouble();
        sc.nextLine();

        double valorReajustado = valorAluguel + (valorAluguel *0.08);

        System.out.println("A diferença é igual a: " + (valorReajustado - valorAluguel));
        System.out.println("O valor a ser pago agora é de: " + valorReajustado);
    }
}
