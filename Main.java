package MesaAula12;

import javax.sql.rowset.JoinRowSet;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Administrativo("José", 1000,true,500);
        funcionario.ganhoAnual();

        Funcionario funcionario2 = new Tecnico("João", 1000,400);
        funcionario2.ganhoAnual();
    }


}
