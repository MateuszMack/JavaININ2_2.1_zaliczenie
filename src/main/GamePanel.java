package main;

import inputs.Keyboard;
import inputs.Mouse;

import javax.swing.*;
import java.awt.*;

//Game Panel to jest to bo będzie widoczne w srodku okna "Window"
public class GamePanel extends JPanel {
    private Mouse mouse;
    private int xDelta = 30, yDelta = 30;
    private int frames=0;
    private long lastCheck = 0;

    public GamePanel(){

        mouse = new Mouse(this);
        addKeyListener(new Keyboard(this));
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    public void changeXDelta(int value){
        this.xDelta+=value;
    }
    public void changeYDelta(int value){
        this.yDelta+=value; //zmiana pozycji o okresloną w Keyboard wartość.
    }
//porusza się z kursorem.
    public void setByMouse(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }

    //paintComponent do "malowania" w oknie, czyszczenia i tworzenia grafik na nowo.
    public void paintComponent(Graphics g){
        super.paintComponent((g));

        g.fillRect(xDelta, yDelta,300,300);

        frames++;
        if(System.currentTimeMillis() - lastCheck >=1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: "+ frames);
            frames = 0;

        }

        repaint(); //odświeżanie po zmianie pozycji.

    }
}
