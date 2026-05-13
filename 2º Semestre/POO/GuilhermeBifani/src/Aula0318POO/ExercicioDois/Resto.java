package Aula0318POO.ExercicioDois;

public class Resto {
    private int n1;
    private int n2;

    public Resto(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int resto(int n1, int n2) {
        return n1 % n2;
    }
}
