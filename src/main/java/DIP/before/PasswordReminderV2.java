package DIP.before;

/** isso apenas vai resolver o problema de acoplamento
 * obs: está classe viola a Open-Closed Principle
 * obs2: Ainda está violando o DIP.. PasswordReminder (alto nível) está dependendo de MySQLConnection (baixo nível)
 *  */
public class PasswordReminderV2 {
    private Object dbConnection;

    // PasswordReminder não tem mais a responsabilidade de criar uma instancia de MySQLConnection
    public PasswordReminderV2(MySQLConnection dbConnection) { // Injeção de Dependências
        this.dbConnection = dbConnection;
    }

    // Faz alguma coisa
}
