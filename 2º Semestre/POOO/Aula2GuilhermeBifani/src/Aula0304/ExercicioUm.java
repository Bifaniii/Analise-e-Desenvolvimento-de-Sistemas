package Aula0304;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em reais: ");
        double valor = sc.nextDouble();

        System.out.println("""
                Para qual moeda gostaria de converter? Digite a opção:
                1) Dólar
                2) Euro""");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O valor em dólares é igual a " + converterDolar(valor));
                break;
            case 2:
                System.out.println("O valor em euros é igual a " + converterEuro(valor));
        }
    }

        static double converterDolar(double n) {
            return n/5.20;
        }

        static double converterEuro(double n) {
            return n/ 6.08;
        }
    }
