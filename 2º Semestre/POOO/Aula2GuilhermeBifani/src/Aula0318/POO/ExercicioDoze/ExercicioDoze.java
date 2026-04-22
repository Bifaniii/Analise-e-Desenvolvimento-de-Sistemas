package Aula0318.POO.ExercicioDoze;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produto = 1000;
        double desconto = 0.15;

        System.out.println("Digite em decimal a porcentagem da entrega: ");
        double entrega = sc.nextDouble();
        sc.nextLine();

        Doze d = new Doze();

        System.out.println("O valor final é de: R$ " + d.calcularPreco(desconto, produto, entrega));
    }
}
