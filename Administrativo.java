package MesaAula12;

public class Administrativo extends Funcionario {
    private boolean turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, boolean turno, double adicionalNoturno) {
        super(nome, salario);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void ganhoAnual() {
        if (turno == true) {
            System.out.println("Ganho anual é " + (getSalario() + adicionalNoturno));
        } else {
            System.out.println("Ganho anual é " + getSalario() + ". Sem adicional noturno.");
        }
    }
}
