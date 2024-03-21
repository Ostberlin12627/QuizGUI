import javax.swing.*;
import java.awt.*;

public class Button {
    private String text = "Zurück";

    private int x = 1090;

    private int y = 610;

    private int width = 150;

    private int height = 60;

    private Color bColor = Color.BLACK;

    private Color fColor = Color.WHITE;

    private Boolean focu = true;

    private Font font = new Font("Arial",Font.BOLD,20);
    JButton back;

    /**
     * Man kann diese Funktion nutzen, um entweder alle Variablen zu ändern,
     * oder man lässt die klammern leer. Sollte man dies tun, können die Werte
     * Text, Koords, Größe und Farbe per set geändert werden.
     * @param text gibt an, welcher Text auf dem Button erscheint.
     * @param x gibt an an welcher x(breite) Koordinate der Button auftauchen soll
     * @param y gibt an welcher y (höhe) Koordinate der Button auftauchen soll
     * @param width gibt an wie breit der Button sein soll
     * @param height gibt die höhe des Buttons an
     * @param bColor gibt die Hintergrundfarbe an
     * @param fColor gibt die Schriftfarbe des Button an
     * @param focu gibt anhand eines Boolean an ob der Button mit Tap angewählt werden kann oder nicht.
     *             Sollte dies Werte geändert werden müssen,
     *             müssen alle Werte in die Klammern geschireben werden.
     *             Alle anderen Werte lassen sich per set ändern.
     */
    public Button(String text,int x,int y,int width,int height,Color bColor,Color fColor,Boolean focu){
        erstelleButton();

    }

    /**
     * Ändere das Wort das auf dem Button stehen soll. Der Standart ist, Zurück.
     * @param text
     */
    public void setText(String text){
        this.text = this.text;
        back.setText(text);
    }

    /**
     * Setzte für den Button neue Koordinaten. X und Y
     * Standart ist, bei einer Auflösung von 1280 x 720 Pixel,
     * wird der Button in die untere Rechte Ecke gesetzt
     * @param x
     * @param y
     */
    public void setkoords(int x,int y){
        this.x = this.x;
        this.y =this.y;
        back.setBounds(x,y,width,height);
    }

    /**
     * Setze die Größe des Buttons Breite,Höhe
     * Standart ist 200 x 80
     * @param width
     * @param height
     */
    public void setgroesse(int width,int height){
        this.width = width;
        this.height = height;
        back.setBounds(x, y, width, height);
    }

    /** Setzte die Hintergrundfarbe.
     * Die Standdartfarbe ist Schwarz.
     *
     * @param bColor
     */
    public void sethintergrund(Color bColor) {
        this.bColor = this.bColor;
        back.setBackground(bColor);
    }

    /**
     * Ändere die Schriftfarbe des Textes, der Auf dem Button steht.
     * Standart ist Weiß
     * @param fColor
     */
    public void setSchriftfarbe(Color fColor) {
        this.fColor = this.fColor;
        back.setForeground(fColor);
    }

    /**
     * gebe einen Button zurück, die Funktion wird auch benötigt im den
     * Button in einem Frame, aufzurufen zum Beispiel: frame.add(back.button.get());
     * @return gibt den Button zurück. wird auch verwendet, um den button aufrufen zukönnen in einem Frame
     */
    public JButton getButton() {
        return back;
    }
    public Button() {
        erstelleButton();
    }

    /**
     * Die Standartwerte für diesen Button sind:
     * Auf dem Button steht Zurück
     * Der Button ist untenlinks, bei einer Auflösung von 1280 x 720 pixel
     * Der Button ist 200 x 80 groß
     * Der Button ist Focusierbar
     * Der Button ist schwarz und benutzt weiße schrift
     * Die Schriftgröße des Buttons ist 20
     */
    private void erstelleButton(){
        back = new JButton();
        back.setText(text);
        back.setBounds(x,y,width,height);
        back.setBackground(bColor);
        back.setForeground(fColor);
        back.setFocusable(focu);
        back.setFont(font);

    }
}