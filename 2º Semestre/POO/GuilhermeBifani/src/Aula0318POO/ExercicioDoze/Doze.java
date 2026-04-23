package Aula0318.POO.ExercicioDoze;

public class Doze {

    public double calcularPreco(double desconto, double valor, double entrega) {
        double valorComDesconto = valor - (valor * desconto);
        return valorComDesconto + (valorComDesconto * entrega);
    }
}
