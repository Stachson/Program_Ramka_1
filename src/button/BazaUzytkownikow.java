package button;

import java.util.ArrayList;

public class BazaUzytkownikow
{
    private static ArrayList<Uzytkownik> listaUzytkownikow = new ArrayList<>();

    public BazaUzytkownikow()
    {
        listaUzytkownikow.add(new Uzytkownik("Uzytkownik1","haslo1"));
        listaUzytkownikow.add(new Uzytkownik("Uzytkownik2","haslo2"));
    }

    //metoda służąca do sprawdzania poprawności danych logowania
    public boolean Logowanie(String login,String haslo)
    {
        for(Uzytkownik e: listaUzytkownikow)
        {
            if(login.equals(e.getUser()) && haslo.equals(e.getPassword()))
            {
                return true;
            }

        }
        return false;
    }


}
