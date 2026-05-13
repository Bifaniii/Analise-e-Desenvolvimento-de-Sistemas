package Aula0318POO.ExercicioDez;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor gasto do restaurante: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a quantidade de pessoas que há na mesa: ");
        int quantidade = sc.nextInt();

        Mesa m = new Mesa();

        System.out.println("O valor a ser pago para cada pessoa é: " + m.calcularConta(quantidade, valor));


    }
}
