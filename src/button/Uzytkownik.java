package button;

public class Uzytkownik
{

    private String user;
    private String password;

    public Uzytkownik(String user, String password)
    {
        this.user=user;
        this.password=password;
    }

    public String getUser()
    {
        return user;
    }

    public String getPassword()
    {
        return password;
    }
}
