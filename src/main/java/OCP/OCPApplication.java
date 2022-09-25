package OCP;

import OCP.before.ContratoClt;
import OCP.before.Estagio;
import OCP.before.FolhaDePagamento;

/*
import OCP.after.Estagio;
import OCP.after.FolhaDePagamento;
import OCP.after.ContratoClt;
*/

public class OCPApplication {
    public static void main(String[] args) {
        var folhaDePagamento = new FolhaDePagamento();

        folhaDePagamento.calcular(new ContratoClt());
        folhaDePagamento.calcular(new Estagio());

    }
}
