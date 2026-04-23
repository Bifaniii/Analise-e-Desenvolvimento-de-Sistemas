package Aula0422;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Double> listaNotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a nota: ");
            Double x = sc.nextDouble();
            listaNotas.add(x);
        }

        System.out.println(listaNotas);

        double somaNotas = 0;

        for (Double numero : listaNotas) {
            somaNotas += numero;
        }

        double media = somaNotas/6;
        List<Double> listaFiltrada = listaNotas.stream()
                .filter(n -> n > media)
                .toList();
        System.out.println("A média aritmética é igual a: " + media);
        System.out.println("As notas acima da média são: " + listaFiltrada);
    }
}
