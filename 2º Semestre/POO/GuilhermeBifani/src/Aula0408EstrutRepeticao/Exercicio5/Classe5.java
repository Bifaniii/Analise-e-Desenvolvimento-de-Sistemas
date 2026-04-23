package Aula0408.Exercicio5;

public class Classe5 {
    private int somaIdades;


    public void mediaIdadeOtimo(int somaIdades, int quantidadePessoas) {
        System.out.println("A média de idade das pessoas que votaram por 'ótimo' foi: " + somaIdades/quantidadePessoas);
    }

    public void quantidadePessoas(int qnt) {
        System.out.println("A quantidade de pessoas que votaram por regular foi: " + qnt);
    }
}
