package OCP.before;

import java.math.BigDecimal;

public class FolhaDePagamento {
    protected BigDecimal saldo;

    public void calcular(Object funcionario)
    {
        if (funcionario instanceof ContratoClt) {
            this.saldo = ((ContratoClt) funcionario).salario();
            System.out.println("Salário de ContratoClt: ".concat(this.saldo.toString()));
        } else if (funcionario instanceof Estagio) {
            this.saldo = ((Estagio) funcionario).bolsaAuxilio();
            System.out.println("Salário de Estagio: ".concat(this.saldo.toString()));
        }
    }
}
