package Aula0304;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine();


        System.out.println("O valor a ser recebido em reais é de: " + calcularSalario(salarioBase));
    }

    static double calcularSalario(double salarioB) {
        double gratif = salarioB + (salarioB * 0.5);
        double impost = salarioB + (salarioB * 0.7);
        return (salarioB + gratif) - impost;

    }
}
