package Aula0408EstrutRepeticao.Exercicio4;

import java.util.Scanner;

public class Classe4 {
    private int n;

    Scanner sc = new Scanner(System.in);

    public Classe4(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void calcularMedia() {
        double soma = 0;

        for (int i = 0; i < this.n; i++) {
            System.out.println("Informe a nota: ");
            soma += sc.nextDouble();
        }

        System.out.println("Média é igual a: " + soma/this.n);
    }
}
