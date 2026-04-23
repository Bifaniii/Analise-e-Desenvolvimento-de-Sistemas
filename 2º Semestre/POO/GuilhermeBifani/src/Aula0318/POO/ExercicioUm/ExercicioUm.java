package Aula0318.POO.ExercicioUm;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        int ladoA = sc.nextInt();
        sc.nextLine();

        System.out.println("DIgite o lado B: ");
        int ladoB = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o lado D: ");
        int ladoD = sc.nextInt();

        Area calculos = new Area(ladoA, ladoB);

        System.out.println("Área do primeiro retângulo: " + calculos.calcularArea(ladoA, ladoB));
        System.out.println("Área do segundo retângulo: " + calculos.calcularArea(ladoB, ladoD));
        System.out.println("Área total: " + (calculos.calcularArea(ladoA,ladoB) + calculos.calcularArea(ladoB,ladoD)));
    }
}