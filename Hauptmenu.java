import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


//GUI für das Hauptmenu
public class Hauptmenu {

    public static void hauptmenu() {
        TextField admineingabe = new TextField();

        //Hauptmerkmale des Fensters
        Frame frame = new Frame();
        frame.setSize(1280, 720);
        frame.setLayout(null);
        // Hintergrundbild laden
        ImageIcon backgroundImage = new ImageIcon(Hauptmenu.class.getResource("/Logo.jpg"));

        //Variable für die Schleife
        Color buttonColor = Color.BLACK;
        Color buttonSColor = Color.WHITE;
        Font font = new Font("Arial", Font.PLAIN, 36);


        // Grund-Koordinaten vom ersten Button
        int leftside = 440; //Pixel von Links
        int overside = 200; //Pixel von Oben
        //größe fix Werte
        int width = 400;
        int height = 70;


        String[] buttonlabels = {"Start", "Einstellung", "Admin", "Rangliste", "Ende"};
        ArrayList<JButton> buttons = new ArrayList<>();
        for (String label : buttonlabels) {
            JButton button = new JButton();
            button.setBackground(buttonColor);
            button.setForeground(buttonSColor);
            button.setFocusable(true);
            button.setFont(font);
            button.setText(label);
            buttons.add(button); // Button zur Liste hinzufügen
            button.setBounds(leftside, overside, width, height);
            frame.add(button);
            overside += 80;
        }


        //Aufruf der einzelnen Fenster laut Liste
        buttons.get(1).addActionListener(e ->{
            Optionsmenu.optionsmenu();
            frame.dispose();
        });

        //Aufruf des Adminmenus und abfrage des Passworts
        buttons.get(2).addActionListener(e -> {
           String password = "0007";
           String vergleich;
           vergleich = admineingabe.getText();
           if (vergleich.equals(password)) {
           Adminmenu.adminmenu();
           frame.dispose();
                }
        });


        //Funktion um das Programm zu beenden
        buttons.get(4).addActionListener(e -> {
            frame.dispose();
        });


        //Buttons und Label für den Adminzugriff
        admineingabe.setBounds(1150, 660, 100, 50);
        frame.add(admineingabe);
        JLabel anzeige = new JLabel();
        anzeige.setBounds(900, 660, 100, 50);
        frame.add(anzeige);
        frame.setVisible(true);
        }
    }
