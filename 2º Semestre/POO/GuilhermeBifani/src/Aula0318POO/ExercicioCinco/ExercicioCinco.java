package Aula0318.POO.ExercicioCinco;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de galinhas que há na granja: ");
        int quantidade = sc.nextInt();

        Galinha gl = new Galinha();
        System.out.println(gl.calcularGasto(quantidade));



    }
}
