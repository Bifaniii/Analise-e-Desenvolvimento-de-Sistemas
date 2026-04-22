package Aula0318.POO.ExercicioOito;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o valor das vendas em reais: ");
        double venda = sc.nextDouble();

        Vendas vendas = new Vendas();
        System.out.println("O salário será de: R$ " + vendas.calcularSalario(salario, venda));
    }
}
