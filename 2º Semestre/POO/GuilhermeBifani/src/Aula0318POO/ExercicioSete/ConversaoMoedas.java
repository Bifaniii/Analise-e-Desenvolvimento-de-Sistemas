package Aula0318.POO.ExercicioSete;

public class ConversaoMoedas {

    public double converterDolar(double valor, double cotacao) {
        double dolar = valor / cotacao;
        return dolar * 0.15;
    }

    public double converterEuro(double valor, double cotacao) {
        double euro = valor / cotacao;
        return euro * 0.015;
    }

}
