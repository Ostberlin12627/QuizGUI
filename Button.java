import javax.swing.*;
import java.awt.*;

public class Button {
    private String text = "Zurück";

    private int x = 1050;

    private int y = 590;

    private int width = 200;

    private int height = 80;

    private Color bColor = Color.BLACK;

    private Color fColor = Color.WHITE;

    private Boolean focu = true;

    private Font font = new Font("Arial",Font.BOLD,20);
    JButton back;
    public Button(String text,int x,int y,int width,int height,Color bColor,Color fColor,Boolean focu){
        erstelleButton();

    }

    public void setText(String text){
        this.text = this.text;
        back.setText(text);
    }

    public void setkoords(int x,int y){
        this.x = this.x;
        this.y =this.y;
        back.setBounds(x,y,width,height);
    }

    public void setgroesse(int wight,int height){
        this.width = this.width;
        this.height = this.height;
        back.setBounds(x, y, width, height);
    }

    public void sethintergrund(Color bColor) {
        this.bColor = this.bColor;
        back.setBackground(bColor);
    }

    public void setSchriftfarbe(Color fColor) {
        this.fColor = this.fColor;
        back.setForeground(fColor);
    }

    public JButton getButton() {
        return back;
    }
    public Button() {
        erstelleButton();
    }
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