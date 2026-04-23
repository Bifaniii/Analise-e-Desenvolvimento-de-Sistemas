package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        System.out.print("Digite a primeira nota: \n");
        float n1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite o primeiro peso: \n");
        int p1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a segunda nota: \n");
        float n2 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite o segundo peso: \n");
        int p2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a terceira nota: \n");
        float n3 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite o terceiro peso: \n");
        int p3 = sc.nextInt();
        sc.nextLine();

        float media = ((p1*n1) + (p2*n2) + (p3*n3)) / (p1 +p2 +p3);

        System.out.println("A média do aluno " + aluno + " é igual a: " + media);
    }
}
