package DIP.after;

public class DIPApplication {
    public static void main(String[] args) {
        var mysql = new MySQLConnection();
        var oracle = new OracleConnection();
        var passwordReminderMysql = new PasswordReminder(mysql);
        var passwordReminderOracle = new PasswordReminder(oracle);
    }
}
