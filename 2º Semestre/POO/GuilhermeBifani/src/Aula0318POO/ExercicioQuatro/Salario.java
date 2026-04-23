package Aula0318.POO.ExercicioQuatro;

public class Salario {
    private double horasTrabalhadas;
    private double valorHorasTrabalhadas;
    private double percentualAumento;

    public Salario(double horasTrabalhadas, double valorHorasTrabalhadas, double percentualAumento) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
        this.percentualAumento = percentualAumento;
    }

    public double calcularSalarioBruto(double ht, double vh) {
        return ht * vh;
    }

    public double calcularNovoSalario(double ht, double vh, double pa) {
        double sb = ht * vh;
        sb = sb + ((sb * pa)/100);
        return sb;
    }
}
