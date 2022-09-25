package LSP.violacoes;

import java.math.BigDecimal;

/** Sobrescrevendo um método que não faz nada... */
interface ContratoDeTrabalho {
    BigDecimal remuneracao();
}

class Voluntatio implements ContratoDeTrabalho {

    @Override
    public BigDecimal remuneracao() {
        // voluntário não recebe remuneracao
        return null;
    }
}


public class Violacao1Application {
    public static void main(String[] args) {
        var voluntario = new Voluntatio();
        System.out.println("Remuneração: ".concat(voluntario.remuneracao().toString()));
    }
}
