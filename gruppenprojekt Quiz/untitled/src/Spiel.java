import javax.swing.*;
import java.awt.*;
import java.util.HashSet;


public class Spiel {
   public static HashSet<Integer> hs = new HashSet<Integer>();
    public static boolean farbeA = true;
    public static boolean farbeB = true;
    public static boolean farbeC = true;
    public static boolean farbeD = true;

    public static void spiel() {
        JFrame spiel = new JFrame();
        spiel.setSize(1280, 720);
        spiel.setLayout(null);

        Button frage = new Button();
        Button antwort_A = new Button();
        Button antwort_B = new Button();
        Button antwort_C = new Button();
        Button antwort_D = new Button();
        Button absenden = new Button();

        antwort_A.setgroesse(500, 100);
        antwort_C.setgroesse(500, 100);
        antwort_B.setgroesse(500, 100);
        antwort_D.setgroesse(500, 100);
        absenden.setgroesse(150, 60);


        frage.setkoords(100, 100);
        antwort_A.setkoords(80, 350);
        antwort_C.setkoords(80, 480);
        antwort_B.setkoords(680, 350);
        antwort_D.setkoords(680, 480);
        absenden.setkoords(550, 600);

        spiel.add(frage.getButton());
        spiel.add(antwort_A.getButton());
        spiel.add(antwort_B.getButton());
        spiel.add(antwort_C.getButton());
        spiel.add(antwort_D.getButton());
        spiel.add(absenden.getButton());

        frage.setText("Frage");
        antwort_A.setText("A");
        antwort_B.setText("B");
        antwort_C.setText("C");
        antwort_D.setText("D");
        absenden.setText("Absenden");

       absenden.getButton().addActionListener(e->{


        int counter = 1;

        int often = (int) (Math.random() * 20 + 1);
        if (hs.contains(often)) {
            System.out.println("ist vorhanden ");

        } else {
            System.out.println("ist nicht vorhanden");
            hs.add(often);
            System.out.println(hs.size());
            counter += 1;
            String test = String.valueOf(often);
            antwort_A.setText(test);
            System.out.println(test);
            System.out.println(counter);
        }

        });
        antwort_A.getButton().addActionListener(e->{

                if(farbeA){
                    antwort_A.sethintergrund(Color.GREEN);
                    farbeA = false;
                }else{
                    antwort_A.sethintergrund(Color.BLACK);
                    farbeA = true;
                }

        });

        antwort_B.getButton().addActionListener(e->{

            if(farbeB){
                antwort_B.sethintergrund(Color.GREEN);
                farbeB = false;
            }else{
                antwort_B.sethintergrund(Color.BLACK);
                farbeB = true;
            }

        });

        antwort_C.getButton().addActionListener(e->{

            if(farbeC){
                antwort_C.sethintergrund(Color.GREEN);
                farbeC = false;
            }else{
                antwort_C.sethintergrund(Color.BLACK);
                farbeC = true;
            }

        });


        antwort_D.getButton().addActionListener(e->{

            if(farbeD){
                antwort_D.sethintergrund(Color.GREEN);
                farbeD = false;
            }else{
                antwort_D.sethintergrund(Color.BLACK);
                farbeD = true;
            }

        });

        Button back = new Button();
        back.setgroesse(150, 60);

        back.getButton().addActionListener(e -> {
            Hauptmenu.hauptmenu();
            spiel.dispose();
        });
        spiel.add(back.getButton());


        spiel.setVisible(true);

    }

}

