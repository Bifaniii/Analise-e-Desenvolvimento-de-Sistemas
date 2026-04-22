package Aula0304;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite agora seu salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite agora o total de vendas que realizou: ");
        double vendas = sc.nextDouble();

        System.out.println(nome + ", Seu salário com as comissões é igual a R$ " + calcularSalario(salarioFixo, vendas));
    }

    static double calcularSalario(double salario, double vendas) {
        return salario + (0.15 * vendas);
    }
}
