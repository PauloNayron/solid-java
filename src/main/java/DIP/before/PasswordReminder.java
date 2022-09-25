package DIP.before;

/** alto nível de acoplamento */
public class PasswordReminder {
    private Object dbConnection;

    // está com a responsabilidade de criar uma instância de MySQLConnection
    public PasswordReminder() {
        this.dbConnection = new MySQLConnection(); // há uma total dependência
    }
    // Faz alguma coisa
}
