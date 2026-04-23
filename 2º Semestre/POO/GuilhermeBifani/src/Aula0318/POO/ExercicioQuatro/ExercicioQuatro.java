package Aula0318.POO.ExercicioQuatro;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double ht = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o valor da hora trabalhada em reais: ");
        double vh = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o percentual de aumento: ");
        double pa = sc.nextDouble();
        sc.nextLine();

        Salario sl = new Salario(ht, vh, pa);

        System.out.println("Salário Bruto: R$ " + sl.calcularSalarioBruto(ht,vh));
        System.out.println("Novo salário: R$ " + sl.calcularNovoSalario(ht, vh, pa));


    }
}
