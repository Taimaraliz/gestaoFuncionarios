package src;

public class Diretor extends Funcionario {

    private double participaLucros;

    public Diretor(String nome, int idade, double salario, double participaLucros) {
        super(nome, idade, salario);
        this.participaLucros = participaLucros;
    }

    public double getParticipaLucros() {
        return participaLucros;
    }

    public void setParticipaLucros(double participaLucrosLucros) {
        this.participaLucros = participaLucros;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + participaLucros;
    }

}
