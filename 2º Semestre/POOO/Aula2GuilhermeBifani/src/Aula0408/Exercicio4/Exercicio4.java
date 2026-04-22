package Aula0408.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores que serão informados: ");
        int n = sc.nextInt();

        Classe4 c = new Classe4(n);
        c.calcularMedia();
    }
}
