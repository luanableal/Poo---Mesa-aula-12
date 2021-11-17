package MesaAula12;

public class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados (){
        System.out.println("Nome: "+getNome() +"\n Salario: "+getSalario() + "\n Matrícula: " + matricula);
    }
}
