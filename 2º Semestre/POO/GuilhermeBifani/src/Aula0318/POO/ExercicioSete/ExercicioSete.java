package Aula0318.POO.ExercicioSete;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double valor = sc.nextDouble();

        System.out.println("Digite a cotação em dolar: ");
        double cotacaoDolar = sc.nextDouble();

        System.out.println("Digite a cotação em euro: ");
        double cotacaoEuro = sc.nextDouble();


        ConversaoMoedas conversor = new ConversaoMoedas();

        System.out.println("A quantidade digitada em dólares é: U$ " + conversor.converterDolar(valor, cotacaoDolar));
        System.out.println("A quantidade digitada em euro é: E$ " + conversor.converterEuro(valor, cotacaoEuro));
    }
}

