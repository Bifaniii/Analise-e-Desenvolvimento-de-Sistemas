package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em reais: ");
        float valor = sc.nextFloat();
        sc.nextLine();

        System.out.println("""
                Para qual moeda gostaria de converter? Digite a opção:
                1) Dólar
                2) Euro""");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                valor = ((float) (valor / 5.20));
                System.out.println("O valor em dólares é igual a " + valor);
                break;
            case 2:
                valor = (float) (valor / 6.08);
                System.out.println("O valor em euros é igual a " + valor);
        }
    }
}