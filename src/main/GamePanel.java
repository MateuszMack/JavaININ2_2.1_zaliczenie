package main;

import javax.swing.*;
import java.awt.*;

//Game Panel to jest to bo będzie widoczne w srodku okna "Window"
public class GamePanel extends JPanel {
    public GamePanel(){


    }
    //paintComponent do "malowania" w oknie, czyszczenia i tworzenia grafik na nowo.
    public void paintComponent(Graphics g){
        super.paintComponent((g));

        g.drawRect(30,30,300,300);
    }
}
