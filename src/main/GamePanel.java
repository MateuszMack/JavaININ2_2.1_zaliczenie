package main;

import inputs.Keyboard;
import inputs.Mouse;

import javax.swing.*;
import java.awt.*;

//Game Panel to jest to bo będzie widoczne w srodku okna "Window"
public class GamePanel extends JPanel {
    private Mouse mouse;
    private int xDelta = 30, yDelta = 30;

    public GamePanel(){

        mouse = new Mouse(this);
        addKeyListener(new Keyboard(this));
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    public void changeXDelta(int value){
        this.xDelta+=value;
        repaint();
    }
    public void changeYDelta(int value){
        this.yDelta+=value; //zmiana pozycji o okresloną w Keyboard wartość.
        repaint(); //odświeżanie po zmianie pozycji.
    }
//porusza się z kursorem.
    public void setByMouse(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    //paintComponent do "malowania" w oknie, czyszczenia i tworzenia grafik na nowo.
    public void paintComponent(Graphics g){
        super.paintComponent((g));

        g.fillRect(xDelta, yDelta,300,300);
    }
}
