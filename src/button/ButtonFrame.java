package button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class ButtonFrame extends JFrame {
    private final static BazaUzytkownikow uzytkownicy = new BazaUzytkownikow();


    public ButtonFrame() {
        //Określenie rozmiaru okna
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth / 4, screenHeight / 4);


        //Stworzenie tytułu pola i  pola do wpisania loginu
        var napisUser = new JLabel("User:");
        var poleUser = new JTextField(10);

        //Stworzenie tytułu pola i  pola do wpisania hasla
        var napisPassword = new JLabel("Password:");
        var polePassword = new JPasswordField(10);

        //Stworzenie dwóch przycisków
        var loginButton = new JButton("Login");
        var clearButton = new JButton("Clear");

        //Stworzenie panelu i dodanie go do okna
        var panel = new JPanel();
        add(panel);

        //Stworzenie tla
        var layout = new GridBagLayout();
        //dodanie tla do panelu
        panel.setLayout(layout);
        //dodawanie elementow do panelu i ustalanie ich polozenia
        panel.add(napisUser, new GBC(1, 1));
        panel.add(poleUser, new GBC(2, 1));
        panel.add(napisPassword, new GBC(1, 2));
        panel.add(polePassword, new GBC(2, 2));
        panel.add(loginButton, new GBC(1, 3));
        panel.add(clearButton, new GBC(2, 3));

        //dodanie akcji do loginButton
        loginButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String user = poleUser.getText();
                char[] password = polePassword.getPassword();

                if(uzytkownicy.Logowanie(user,String.valueOf((password))))
                {
                    panel.setBackground(Color.GREEN);
                }
                else
                {
                    panel.setBackground(Color.RED);
                }
                //zastępowanie elementów tablicy zerami dla bezpieczeństwa
                Arrays.fill(password, '0');
            }
        });

        //dodanie akcji do clearButton
        clearButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                panel.setBackground(Color.GRAY);
                poleUser.setText(null);
                polePassword.setText(null);
            }
        });

    }
}
