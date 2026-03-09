package com.guilherme.bifani;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoDesconto = 1000 - (1000 * 0.15);
        double precoFinal = precoDesconto + (precoDesconto * 0.03);

        System.out.println("O preço final é de: " + precoFinal);
    }
}