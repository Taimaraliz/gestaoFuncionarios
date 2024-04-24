package src;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }

}

