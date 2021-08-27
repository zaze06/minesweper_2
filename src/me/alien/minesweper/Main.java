package me.alien.minesweper;

import me.alien.game.lib.Game;
import me.alien.game.lib.Init;

public class Main extends Init {

    public Main(int height, int width, Game game) {
        super(height, width, game);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new Main(310, 246, new MainGame());
    }
}
