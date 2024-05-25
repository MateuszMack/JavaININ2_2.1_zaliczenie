package utilz;

public class HelpMethods {

    public static boolean IsFloor(Rectangle2D.Float hitbox, float xSpeed, int[][] lvlData) {
        return IsSolid(hitbox.x + xSpeed, hitbox.y + hitbox.height + 1, lvlData);
    }

    public static boolean IsTileSolid(int xTile, int yTile, int[][] lvlData) {
        int value = lvlData[yTile][xTile];

        if (value >= 48 || value < 0 || value != 11)
            return true;
        return false;
    }

    public static boolean IsAllTileWalkable(int xStart, int xEnd, int y, int[][] lvlData) {
        for(int i = 0; i < xEnd - xStart; i++) {
            if (IsTileSolid(xStart + i, y, lvlData))
                return false;
            if (!IsTileSolid(xStart + i, y + 1, lvlData))
                return false;

        }

        return true;
    }

    public static boolean IsSightClear(int[][] lvlData, Rectangle2D.Float firstHitbox, Rectangle2D.Float secondHitbox, int yTile) {
        int firstXTile = (int)(firstHitbox.x / Game.TILES_SIZE);
        int secondXTile = (int)(secondHitbox.x / Game.TILES_SIZE);

        if(firstXTile > secondXTile)
            return IsAllTileWalkable(secondXTile, firstXTile, yTile, lvlData);
        else
            return IsAllTileWalkable(firstXTile, secondXTile, yTile, lvlData);
    }
}
