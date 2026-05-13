package Aula0408EstrutRepeticao.Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Classe5 c = new Classe5();

        System.out.println("Digite a quantidade de espectadores: ");
        int espec = sc.nextInt();

        int idadeNota3 = 0;
        int qnt3 = 0;
        int qnt1 = 0;


        for (int i = 0; i < espec; i++) {
            System.out.println("Digite a nota desta pessoa: ");
            int nota = sc.nextInt();

            System.out.println("Digite a idade da pessoa que informou essa nota: ");
            int idade = sc.nextInt();

            if (nota == 3) {
                qnt3++;
                idadeNota3 += idade;
            } else if (nota == 1) {
                qnt1++;
            }
        }

        c.mediaIdadeOtimo(idadeNota3,qnt3);
        c.quantidadePessoas(qnt1);



        }

    }
