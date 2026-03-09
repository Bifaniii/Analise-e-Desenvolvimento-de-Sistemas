package br.com.guilhermebifaniestruturadedadossegunda;

public class Pet {
    String nome;
    String especie;
    String urgencia;

    public Pet(String nome, String especie, String urgencia) {
        this.nome = nome;
        this.especie = especie;
        this.urgencia = urgencia;
    }

    @Override
    public String toString() {
        return nome + " (" + especie + ") - " + urgencia;
    }
}
