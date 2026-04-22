package Aula0318.POO.ExercicioOnze;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do aluguel: ");
        double aluguel = sc.nextDouble();
        sc.nextLine();

        Reajuste r = new Reajuste();
        System.out.println("A difrença é " + (r.calcularReajuste(aluguel)- aluguel));
        System.out.println("O valor do aluguel passará a ser: " + r.calcularReajuste(aluguel));
    }
}
