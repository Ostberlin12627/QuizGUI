import javax.swing.*;

public class Optionsmenu {
    public static void optionsmenu() {
        JFrame option = new JFrame();
        option.setSize(1280, 720);
        option.setLayout(null);
        Button back = new Button();
        option.add(back.getButton());
        back.getButton().addActionListener(e -> {
            option.dispose();
            Hauptmenu.hauptmenu();
        });
        option.setVisible(true);
    }
}