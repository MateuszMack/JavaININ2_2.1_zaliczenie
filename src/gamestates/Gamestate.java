package gamestates;

public enum Gamestate {
//stany gry domyslnie menu
    PLAYING, MENU, OPTIONS, QUIT, CREDITS;

    public static Gamestate state = MENU;

}
