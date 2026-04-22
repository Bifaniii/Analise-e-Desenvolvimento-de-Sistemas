package Aula0318.POO.ExercicioDois;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        System.out.println("DIgite outro número: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        Resto calculo = new Resto(n1, n2);
        System.out.println("O resto da divisão inteira é: " + calculo.resto(n1, n2));
    }
}
