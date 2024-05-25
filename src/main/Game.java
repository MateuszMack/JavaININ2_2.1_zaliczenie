package main;
//główna klasa gry
public class Game {
    private Window window;
    private GamePanel gamePanel;
    public Game(){
        //konstruktor
        gamePanel = new GamePanel();
        window = new Window(gamePanel);
        gamePanel.requestFocus();

    }
}
//kupcia dupcia
//Kamil to nie jest to co my mamy robić!
//.