package DIP.after;

public class PasswordReminder {
    private DBconnection dBconnection;

    public PasswordReminder(DBconnection dBconnection) { // a única coisa que importa é implemente a interface BDconnectio
        this.dBconnection = dBconnection;
    }
}
