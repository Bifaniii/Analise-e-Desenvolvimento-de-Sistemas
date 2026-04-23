package Aula0318.POO.ExercicioDez;

public class Mesa {

    public double calcularConta(int quantidade, double valor) {
        valor = valor + (valor * 0.1);
        return valor / quantidade;
    }
}
