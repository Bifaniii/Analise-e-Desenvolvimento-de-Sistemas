package Aula0318POO.ExercicioNove;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        Media m = new Media(nota1, nota2, nota3);
        System.out.println("A média é igual a: " + m.calcularMedia(nota1, nota2, nota3));
    }
}
