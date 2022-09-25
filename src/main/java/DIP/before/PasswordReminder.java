package DIP.before;

import DIP.MySQLConnection;

public class PasswordReminder {
    private Object dbConnection;

    public PasswordReminder() {
        this.dbConnection = new MySQLConnection();
    }
    // Faz alguma coisa
}
