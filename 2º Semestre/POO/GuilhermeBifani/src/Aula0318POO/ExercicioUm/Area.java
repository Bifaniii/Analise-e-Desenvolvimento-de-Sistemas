package Aula0318.POO.ExercicioUm;

public class Area {
    private int ladoA;
    private int ladoB;

    public Area(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }


    public int calcularArea(int ladoA, int ladoB) {
        return ladoA * ladoB;
    }
}
