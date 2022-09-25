package OCP.after;

import java.math.BigDecimal;

public class ContratoClt implements Remuneravel{
    @Override
    public BigDecimal remuneracao() {
        return BigDecimal.TEN;
    }
}
