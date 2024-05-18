package main;
//imprt jframe do stworzenia okna gry.
import javax.swing.*;

public class Window {
    private  JFrame jframe;
    public Window(){

        //obiekt jframe
        jframe = new JFrame();
//wymiary okna gry, widoczność okna, wyłącznie.
        jframe.setSize(600, 600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);


    }

}
