package LSP.violacoes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Retornando valores de tipos diferentes... */
class Auth {
    public Boolean checkCredentials(String login, String password) {
        // faz alguma coisa
        return true;
    }
}

class AuthApi extends Auth {
    /** verifique que o Java já não permite essa violação */
//    public Map<String, Object> checkCredentials(String login, String password)
//    {
//        // faz alguma coisa
//        var map = new HashMap<String, Object>();
//        map.put("auth", Boolean.TRUE);
//        map.put("status", 200);
//        return map;
//    }
}

public class Violacao3Application {
    public static void main(String[] args) {

    }
}
