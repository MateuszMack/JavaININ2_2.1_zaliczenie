package ui;

import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import gamestates.Gamestate;
import main.Game;
import utilz.LoadSave;
import static utilz.Constants.UI.PauseButtons.*;




public class PauseOverlay {
    private BufferedImage backgroundImg;
    private int bgX, bgy, bgW, bgH;


    public PauseOverlay() {
        LoadBackground();
        createSoundButtons();
    }

    private void createSoundButtons() {
        int soundX = (int) (450 * Game.SCALE);
        int musicY = (int) (140 * Game.SCALE);
        int sfxY = (int) (186 * Game.SCALE);
        musicButton = new SoundButton(soundX, musicY, SOUND_SIZE, SOUND_SIZE);
        sfxButton = new SoundButton(soundX, sfxY, SOUND_SIZE, SOUND_SIZE);
    }


    private void loadBackground() {
        backgroundImg = LoadSave.GetSpriteAtlas(LoadSave.PAUSE_BACKGROUND);
        bgW = (int) (background Img.getWidth() * Game.SCALE);
        bgH = (int) (background Img.getHeight() * Game.SCALE);
        bgX = Game.GAME_WIDTH / 2 - bgW / 2;
        bgy = (int) (25 Game.SCALE);

    }

    public void update() {
        musicButton.update();
        sfxButton.update();
    }

    public void draw(Graphics g) {
        // Background
        g.drawImage(background Img, bgX, bgY, bgW, bgH, null);
        // Sound buttons
        musicButton.draw(g);
        sfxButton.draw(g);
    }

    public void mouseDragged(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {
        if (isIn(e, musicButton))
            musicButton.setMousePressed(true);
        else if(isIn(e, sfxButton))
            sfxButton.setMousePressed(true);
    }

    public void mouseReleased(MouseEvent e) {
        if (isIn(e, musicButton)) {
            if (musicButton.isMousePressed())
                musicButton.setMuted(!musicButton.isMuted());
        } else if (isIn(e, sfxButton))
            if (sfxButton.isMousePressed())
                sfxButton.setMuted(!sfxButton.isMuted());

        musicButton.resetBools();
        sfxButton.resetBools();
    }

    public void mouseMoved(MouseEvent e) {
        musicButton.setMouseover(false);
        sfxButton.setMouseOver(false);

        if(isIn(e, musicButton))
            musicButton.setMouseOver(true);
        else if(isIn(e, sfxButton))
            sfxButton.setMouseOver(true);
    }
    private boolean isIn(MouseEvent e, PauseButton b) {
        return b.getBounds().contains(e.getX(), e.getY());
    }
}
