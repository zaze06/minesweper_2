package me.alien.minesweper;

import me.alien.game.lib.Vector2I;

public class Box2I {
    Vector2I start;
    Vector2I end;

    public Box2I(Vector2I start, Vector2I end){
        this.start = start;
        this.end = end;
    }

    public Box2I(int startX, int startY, int endX, int endY){
        this(new Vector2I(startX, startY), new Vector2I(endX, endY));
    }
}
