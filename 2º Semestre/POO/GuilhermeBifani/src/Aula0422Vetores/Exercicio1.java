package Aula0422Vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número: ");
            n = sc.nextInt();
            lista.add(n);
        }

        List<Integer> listaImpares = lista.stream()
                .filter(x -> x%2 != 0)
                .toList();

        List<Integer> listaPares = lista.stream()
                .filter(x -> x%2 == 0)
                .toList();

        int count = 0;
        int countIm = 0;

        for (Integer i : listaPares) {
            count +=1;
        }

        for (Integer i : listaImpares) {
            countIm += 1;
        }

        System.out.println(listaPares);
        System.out.println(listaImpares);
        System.out.println("O número total de números pares é: " + count);
        System.out.println("O número total de números impares é: " + countIm);
    }
}
