package Aula0318.POO.ExercicioNove;

public class Media {
    private double n1;
    private double n2;
    private double n3;

    public Media(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calcularMedia(double n1, double n2, double n3) {
        return ((n1 * 2) + (n2 * 3) + (n3 * 5)) /  10;
    }

}
