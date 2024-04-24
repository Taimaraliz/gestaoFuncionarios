package src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        FuncionarioRegular regular = new FuncionarioRegular("João", 30, 3000);
        Gerente gerente = new Gerente("Maria", 35, 5000, 1000);

        System.out.println("Informações do Funcionário Regular: " + regular);
        System.out.println("Informações do Gerente: " + gerente);
    }
}