package Aula0318POO.ExercicioOito;

public class Vendas {

    public double calcularSalario(double salario, double vendas) {
        vendas = (vendas * 0.15);
        salario = vendas + salario;
        return salario;
    }
}
