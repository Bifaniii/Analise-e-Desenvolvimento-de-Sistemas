package Aula0408.Exercicio2;

public class Classe2 {

    public void loopForDois() {
        for (int i = 0; i < 101; i++) {
            if (i >= 52 && i % 2 == 0) {
                System.out.println(i);
            } else if (i >= 52 && i % 2 != 0) {
                ;
            } else {
                System.out.println(i);
            }

        }
    }
}
