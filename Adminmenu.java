import javax.swing.*;

public class Adminmenu {
    public static void adminmenu() {
        JFrame admin = new JFrame();
        admin.setSize(1280, 720);
        admin.setLayout(null);
        Button back = new Button();
        admin.add(back.getButton());
        back.getButton().addActionListener(e -> {
            admin.dispose();
            Hauptmenu.hauptmenu();
        });



        admin.setVisible(true);
    }
}


