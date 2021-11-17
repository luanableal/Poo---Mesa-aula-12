package MesaAula12;

public class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String nome, double salario) {
        super(nome, salario);
        this.matricula = matricula;
    }


    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nome: "+ getNome()+ "\n Salário: " + getSalario());
    }
}
