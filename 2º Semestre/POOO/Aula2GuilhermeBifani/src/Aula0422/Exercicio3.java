package Aula0422;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor inteiro: ");
            int valor = sc.nextInt();
            a.add(valor);
        }

        List<Integer> b = a.stream()
                .map(x -> x*5)
                .toList();

        System.out.println(a);
        System.out.println(b);

    }
}
