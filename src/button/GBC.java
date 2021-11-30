package button;

import java.awt.*;

//klasa pomocnicza do określania położenia elementów w oknie
public class GBC extends GridBagConstraints
{
    public GBC(int gridx, int gridy)
    {
        this.gridx=gridx;
        this.gridy=gridy;
    }
}
