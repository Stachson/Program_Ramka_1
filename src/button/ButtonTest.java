package button;

import javax.swing.*;
import java.awt.*;

public class ButtonTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->
                {
                   JFrame buttonFrame = new ButtonFrame();
                   buttonFrame.setTitle("Menu Toolbar");
                   buttonFrame.setLocationRelativeTo(null);
                   buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   buttonFrame.setVisible(true);
                });
    }
}
