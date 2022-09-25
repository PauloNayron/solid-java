package OCP.after;

import java.math.BigDecimal;

public class Estagio implements Remuneravel{
    @Override
    public BigDecimal remuneracao() {
        return BigDecimal.ONE;
    }
}
