package MesaAula12;

import java.sql.SQLOutput;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
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

    public void exibirDados (){
        System.out.println("Nome: "+ nome+ "\n Salário: " + salario);
    }

    public void ganhoAnual () {
        System.out.println("Salário anual: " + salario * 12);
    }


}
