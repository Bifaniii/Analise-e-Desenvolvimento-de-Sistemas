package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total gasto: ");
        double valorTotal = sc.nextDouble();
        sc.nextLine();

        System.out.println("Quantas pessoas há sentadas à mesa? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        double taxaServico = 0.1 * valorTotal;
        valorTotal += taxaServico;

        System.out.println("A quantidade que cada um deve pagar é de: R$ " + valorTotal/quantidade);
    }
}
