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

    public void update() { switch (Gamestate.state) { case MENU:
        break;
        case PLAYING:
            levelManager.update();
            player.update();
            break;
        default:
            break;
    }
    }
    public void render (Graphics g) {
        switch (Gamestate.state) { case MENU:
        break; case PLAYING:
        levelManager.draw(g);
        player.render(g);
        break;
        default: break;
    }
}
}
//kupcia dupcia
//Kamil to nie jest to co my mamy robić!
//..