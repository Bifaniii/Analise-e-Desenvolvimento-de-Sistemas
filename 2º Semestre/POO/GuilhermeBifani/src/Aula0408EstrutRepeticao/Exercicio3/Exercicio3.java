package Aula0408EstrutRepeticao.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo: ");
        int n = sc.nextInt();

        Classe3 c = new Classe3(n);
        System.out.println("Resultado: " + c.fazerCalculo());
    }
}