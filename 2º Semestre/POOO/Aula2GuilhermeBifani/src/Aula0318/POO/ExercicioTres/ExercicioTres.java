package Aula0318.POO.ExercicioTres;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o gasto realizado no restaurante: ");
        double gasto = sc.nextDouble();
        sc.nextLine();

        Conta conta = new Conta(gasto);
        System.out.println("O valor total da conta foi de: " + conta.calcularConta(gasto));
    }
}
