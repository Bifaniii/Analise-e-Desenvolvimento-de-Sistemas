package Aula0304;

public class ExercicioSeis {
    public static void main(String[] args) {

        System.out.println("O preço final é de: " + calcularPrecoFinal());
    }
    static double calcularPrecoFinal() {
        double precoDesconto = 1000 - (1000 * 0.15);
        double precoFinal = precoDesconto + (precoDesconto * 0.03);
        return precoFinal;
    }
}
