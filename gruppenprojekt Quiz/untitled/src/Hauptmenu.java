import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//GUI für das Hauptmenu
public class Hauptmenu {

    public static void hauptmenu() {


        // HintergrundBild laden und setzen
        /*ImageIcon icon = new ImageIcon(".\\src\\Logo.jpg");
        Image img = icon.getImage();
        Image temp = img.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
        icon = new ImageIcon(temp);

        // Erstellen des Labels für das Bild
        JLabel hintergrund = new JLabel(icon);
        hintergrund.setLayout(null);
        hintergrund.setBounds(0,0,1280,720);*/


        //Hauptmerkmale des Fensters
        JFrame frame = new JFrame();
        frame.setSize(1280, 720);
        frame.setLayout(null);

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
            //frame.setComponentZOrder(button, 0);
        }
        //frame.add(hintergrund);


        //Aufruf der einzelnen Fenster laut Liste
        buttons.get(0).addActionListener(e ->{
            Spiel.spiel();
            frame.dispose();
        });

        buttons.get(1).addActionListener(e ->{
            Optionsmenu.optionsmenu();
            frame.dispose();
        });

        TextField admineingabe = new TextField();
        //Aufruf des Adminmenus und abfrage des Passworts
        buttons.get(2).addActionListener(e -> {
           String password = "1234";
           String vergleich;
           vergleich = admineingabe.getText(); //übertrrage die passwort eingabe in Vergleich
           if (vergleich.equals(password)) {    //prüfe ob Passwort = Eingabe
           Adminmenu.adminmenu(); //wenn ja, rufe das Adminmenu auf
           frame.dispose();
           }else{
               admineingabe.setText("");}   //entferne den Text wenn das Passwort falsch ist
        });


        //Funktion um das Programm zu beenden
        buttons.get(4).addActionListener(e -> {
            frame.dispose();
        });


        //Buttons und Label für den Adminzugriff

        admineingabe.setBounds(1150, 660, 100, 50);
        frame.add(admineingabe);
        //frame.setComponentZOrder(admineingabe,0);
        JLabel anzeige = new JLabel();
        anzeige.setBounds(900, 660, 100, 50);
        frame.add(anzeige);
        frame.setVisible(true);
        }
    }
