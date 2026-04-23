package Aula0318.POO.ExercicioTres;

public class Conta {
    private double valor;

    public Conta(double valor) {
        this.valor = valor;
    }

    public double calcularConta(double valor) {
        return valor + (valor * 0.1);
    }
}
