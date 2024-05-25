package utilz;

import static utilz.Constants.EnemyConstants.CRABBY;

public class LoadSave {
}

public static ArrayList<Crabby> GetCrabs() {
    BufferedImage img = GetSpriteAtlas(LEVEL_ONE_DATA);
    ArrayList<Crabby> list = new ArrayList<>();
    for (int j = 0; j < img.getHeight(); j++)
        for (int i = 0; i < img.getWidth(); i++) {
            Color color = new Color(img.getRGB(i, j));
            int value = color.getGreen();
            if (value == CRABBY)
                list.add(new Crabby(i * Game.TILES_SIZE, j * Game.TILES_SIZE));
        }
    return list;
}
