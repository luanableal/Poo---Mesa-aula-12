package MesaAula12;

public class Tecnico extends Funcionario{
    private double bonusSalarial;

    public Tecnico(String nome, double salario, double bonusSalarial) {
        super(nome, salario);
        this.bonusSalarial = bonusSalarial;

    }

    @Override
    public void ganhoAnual() {
        System.out.println("Ganho anual é " + getSalario());
    }
}
