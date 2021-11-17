package MesaAula12;

public class Administrativo extends Funcionario {
    private boolean turno;
    private double adcNoturno;

    public Administrativo(String nome, double salario, boolean turno, double adcNoturno) {
        super(nome, salario);
        this.turno = turno;
        this.adcNoturno = adcNoturno;
    }

    @Override
    public void ganhoAnual() {
        if (turno == true) {
            System.out.println("Ganho anual é " + (getSalario() + adcNoturno));
        } else {
            System.out.println("Ganho anual é " + getSalario() + " - Sem adicional noturno!");
        }
    }
}
