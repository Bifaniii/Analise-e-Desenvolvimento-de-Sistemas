package Aula0408.Exercicio3;

public class Classe3 {
    private int numero;

    public Classe3(int numero) {
        this.numero = numero;
    }

    public double fazerCalculo() {
        double soma = 0;
        for (double i = 1; i <= this.numero; i++) {
            soma += 1/i;
        }
        return soma;
    }

}