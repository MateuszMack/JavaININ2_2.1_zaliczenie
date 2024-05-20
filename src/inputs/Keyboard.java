package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    private GamePanel gamePanel;
    public Keyboard(GamePanel gamePanel){
        this.gamePanel = gamePanel;

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()){
            case KeyEvent.VK_W:
                gamePanel.changeYDelta(-1);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-1);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeYDelta(1);
                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(1);
                break;

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
