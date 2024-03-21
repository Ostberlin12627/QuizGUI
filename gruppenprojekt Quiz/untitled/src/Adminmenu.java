import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Adminmenu {
    public static void adminmenu() {
        JFrame admin = new JFrame();
        admin.setSize(1280, 720);
        admin.setLayout(null);

        // JLabels für die Eingabefelder
        JLabel questionLabel = new JLabel("Frage:");
        questionLabel.setBounds(50, 50, 100, 30);
        admin.add(questionLabel);

        JLabel correctAnswerLabel = new JLabel("Richtige Antwort:");
        correctAnswerLabel.setBounds(50, 100, 150, 30);
        admin.add(correctAnswerLabel);

        JLabel wrongAnswer1Label = new JLabel("Falsche Antwort 1:");
        wrongAnswer1Label.setBounds(50, 150, 150, 30);
        admin.add(wrongAnswer1Label);

        JLabel wrongAnswer2Label = new JLabel("Falsche Antwort 2:");
        wrongAnswer2Label.setBounds(50, 200, 150, 30);
        admin.add(wrongAnswer2Label);

        JLabel wrongAnswer3Label = new JLabel("Falsche Antwort 3:");
        wrongAnswer3Label.setBounds(50, 250, 150, 30);
        admin.add(wrongAnswer3Label);

        // JTextFields für die Eingaben
        JTextField questionField = new JTextField();
        questionField.setBounds(200, 50, 500, 30);
        admin.add(questionField);

        JTextField correctAnswerField = new JTextField();
        correctAnswerField.setBounds(200, 100, 500, 30);
        admin.add(correctAnswerField);

        JTextField wrongAnswer1Field = new JTextField();
        wrongAnswer1Field.setBounds(200, 150, 500, 30);
        admin.add(wrongAnswer1Field);

        JTextField wrongAnswer2Field = new JTextField();
        wrongAnswer2Field.setBounds(200, 200, 500, 30);
        admin.add(wrongAnswer2Field);

        JTextField wrongAnswer3Field = new JTextField();
        wrongAnswer3Field.setBounds(200, 250, 500, 30);
        admin.add(wrongAnswer3Field);

        // JButton zum Hinzufügen der Daten
        JButton addButton = new JButton("Hinzufügen");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Daten aus den Eingabefeldern lesen
                String question = questionField.getText();
                String correctAnswer = correctAnswerField.getText();
                String wrongAnswer1 = wrongAnswer1Field.getText();
                String wrongAnswer2 = wrongAnswer2Field.getText();
                String wrongAnswer3 = wrongAnswer3Field.getText();

                // Daten in die CSV-Datei schreiben
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Daten.csv", true))) {
                    String line = String.join(",", question, correctAnswer, wrongAnswer1, wrongAnswer2, wrongAnswer3);
                    System.out.println("Geschriebene Zeile: " + line);
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    JOptionPane.showMessageDialog(admin, "Die Daten wurden erfolgreich zur Datei hinzugefügt.");
                    System.out.println("bis hier funktioniert es");
                    questionField.setText("");
                    correctAnswerField.setText("");
                    wrongAnswer1Field.setText("");
                    wrongAnswer2Field.setText("");
                    wrongAnswer3Field.setText("");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(admin, "Ein Fehler ist aufgetreten.");
                }
            }
        });
        addButton.setBounds(200, 300, 150, 50);
        admin.add(addButton);

        // JButton zum Zurückkehren zum Hauptmenü
        JButton zurueck = new JButton("Zurück");
        zurueck.addActionListener(e -> {
            Hauptmenu.hauptmenu();
            admin.dispose();
        });
        zurueck.setBounds(1150, 660, 100, 50);
        admin.add(zurueck);

        admin.setVisible(true);
    }
}



