package OCP.after;

import java.math.BigDecimal;

public class FolhaDePagamento {
    protected BigDecimal saldo;

    public void calcular(Remuneravel funcionario)
    {
        this.saldo = funcionario.remuneracao();
        System.out.println("saldo: ".concat(this.saldo.toString()));
    }
}
