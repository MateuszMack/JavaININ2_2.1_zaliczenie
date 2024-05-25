package gamestates;

public class Playing {
}

    @Override
    public void update() {
        if (!paused) {
            levelManager.update();
            player.update();
            enemyManager.update(levelManager.getCurrentLevel().getLevelData(), player);
            checkCloseToBorder();
        } else {
            pauseOverlay.update();
        }
    }