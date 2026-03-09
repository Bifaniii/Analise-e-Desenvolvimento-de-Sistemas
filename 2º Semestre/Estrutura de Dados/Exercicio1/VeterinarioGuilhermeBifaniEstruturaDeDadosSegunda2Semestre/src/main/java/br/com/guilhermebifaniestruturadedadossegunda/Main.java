package br.com.guilhermebifaniestruturadedadossegunda;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<Pet> filaVermelha = new LinkedList<>();
    static Queue<Pet> filaAmarela = new LinkedList<>();
    static Queue<Pet> filaVerde = new LinkedList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== CLÍNICA VETERINÁRIA ===");
            System.out.println("1 - Chegada de Paciente");
            System.out.println("2 - Chamar Próximo");
            System.out.println("3 - Status da Fila");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> chegadaPaciente();
                case 2 -> chamarProximo();
                case 3 -> statusFila();
            }

        } while (opcao != 0);
    }

    static void chegadaPaciente() {
        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();

        System.out.print("Espécie: ");
        String especie = sc.nextLine();

        System.out.print("Urgência (VERDE / AMARELO / VERMELHO): ");
        String urgencia = sc.nextLine().toUpperCase();

        Pet pet = new Pet(nome, especie, urgencia);

        switch (urgencia) {
            case "VERMELHO" -> filaVermelha.add(pet);
            case "AMARELO" -> filaAmarela.add(pet);
            default -> filaVerde.add(pet);
        }

        System.out.println("Pet adicionado!");
    }

    static void chamarProximo() {
        Pet proximo = null;

        if (!filaVermelha.isEmpty()) {
            proximo = filaVermelha.poll();
        } else if (!filaAmarela.isEmpty()) {
            proximo = filaAmarela.poll();
        } else if (!filaVerde.isEmpty()) {
            proximo = filaVerde.poll();
        }

        if (proximo == null) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Atendendo: " + proximo.nome);
        }
    }

    static void statusFila() {
        int total = filaVermelha.size() + filaAmarela.size() + filaVerde.size();

        System.out.println("Total aguardando: " + total);

        Pet ultimo = null;

        if (!filaVerde.isEmpty()) {
            ultimo = ((LinkedList<Pet>) filaVerde).peekLast();
        } else if (!filaAmarela.isEmpty()) {
            ultimo = ((LinkedList<Pet>) filaAmarela).peekLast();
        } else if (!filaVermelha.isEmpty()) {
            ultimo = ((LinkedList<Pet>) filaVermelha).peekLast();
        }

        if (ultimo != null) {
            System.out.println("Último da fila: " + ultimo.nome);
        }
    }

}