package main;

import gamestates.Menu;
import gamestates.Playing;

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


    private Playing playing;
    private Menu menu;


    private void initClasses () {
        menu = new Menu(this);
        playing = new Playing(this);
    }


    public void update() { switch (Gamestate.state) {
        case MENU:
            menu.update();
        break;
        case PLAYING:
            playing.update();
            break;
        default:
            break;
    }
    }
    public void render (Graphics g) {
        switch (Gamestate.state) {
            case MENU:
                menu.draw(g);
        break;
        case PLAYING:
            playing.draw(g);
        break;
        default: break;
    }
}


    public void windowFocus Lost() {
        if (Gamestate.state == Gamestate.PLAYING)
        playing.getPlayer().resetDirBooleans();
    }

    public Menu getMenu() { return menu;
    }
    public Playing getPlaying() { return playing;
    }
}
//kupcia dupcia
//Kamil to nie jest to co my mamy robić!
//...