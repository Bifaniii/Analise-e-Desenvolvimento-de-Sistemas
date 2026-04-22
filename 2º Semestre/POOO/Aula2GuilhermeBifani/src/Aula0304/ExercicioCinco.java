package Aula0304;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do aluguel: ");
        double valorAluguel = sc.nextDouble();
        sc.nextLine();


        System.out.println("A diferença é igual a: " + (calcularAluguel(valorAluguel) - valorAluguel));
        System.out.println("O valor a ser pago agora é de: " + calcularAluguel(valorAluguel));
    }

    static double calcularAluguel (double valorAluguel) {
        return valorAluguel += valorAluguel * 0.8;

    }
}
