package MesaAula12;

// Anna Lopes, Katherine Duarte, Luana Borges, Kantuta Molina, Mateus Benites Dias.

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor){
        this.salario += valor;
        System.out.println("O novo salário é " + this.salario);
    }


    public void exibirDados (){
        System.out.println("Nome: "+nome +"\n Salario: "+salario);
    }
    public void ganhoAnual (){
        System.out.println("Salário anual é de"+ salario*12);
    }
}
