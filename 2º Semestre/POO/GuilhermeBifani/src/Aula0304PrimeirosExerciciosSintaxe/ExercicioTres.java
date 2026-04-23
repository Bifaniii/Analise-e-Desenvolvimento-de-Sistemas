package Aula0304;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        System.out.print("Digite a primeira nota: \n");
        double n1 = sc.nextDouble();
        System.out.print("Digite o primeiro peso: \n");
        int p1 = sc.nextInt();

        System.out.print("Digite a segunda nota: \n");
        double n2 = sc.nextDouble();
        System.out.print("Digite o segundo peso: \n");
        int p2 = sc.nextInt();

        System.out.print("Digite a terceira nota: \n");
        double n3 = sc.nextDouble();
        System.out.print("Digite o terceiro peso: \n");
        int p3 = sc.nextInt();

        System.out.println("A média do aluno " + aluno + " é igual a: " + calcularMediaPonderada(n1,p1,n2,p2,n3,p3));
    }
    static double calcularMediaPonderada(double n1, int p1, double n2, int p2, double n3, int p3) {
        return ((p1*n1) + (p2*n2) + (p3*n3)) / (p1 +p2 +p3);
    }
}
