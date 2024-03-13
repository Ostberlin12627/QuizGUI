import javax.swing.*;
import java.awt.*;

public class Spiel {
    public static void spiel() {
        Frame spiel = new Frame();
        spiel.setSize(1280, 720);
        spiel.setLayout(null);

        JButton zurueck = new JButton();

        zurueck.addActionListener(e ->{
            Hauptmenu.hauptmenu();
            spiel.dispose();
        });


        zurueck.setBounds(1150, 660, 100, 50);
        zurueck.setText("Zurück");
        spiel.add(zurueck);
        spiel.setVisible(true);


    }
}

