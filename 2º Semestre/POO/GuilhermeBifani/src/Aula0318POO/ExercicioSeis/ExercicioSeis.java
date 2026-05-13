package Aula0318POO.ExercicioSeis;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade 1: ");
        int qnt1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a valor 1: ");
        int valor1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a quantidade 2: ");
        int qnt2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a valor 2: ");
        int valor2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a quantidade 3: ");
        int qnt3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a valor 3: ");
        int valor3 = sc.nextInt();
        sc.nextLine();


        CalculoSeis obj = new CalculoSeis();
        System.out.println(obj.totalGeral(qnt1, valor1, qnt2, valor2, qnt3, valor3));

        // NAO ENTENDI O SUBTOTAL

    }
}
