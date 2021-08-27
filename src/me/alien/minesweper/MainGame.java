package me.alien.minesweper;

import me.alien.game.lib.Game;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class MainGame extends Game {
    public MainGame() {
        super(100);
    }

    @Override
    public void doDrawing(Graphics g) {
        ImgHandler img = new ImgHandler();
        super.doDrawing(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new ColorUIResource(107, 107, 107));


        for(int x = 15; x < 229; x += 24){
            for(int y = 79; y < 256; y += 24){
                g2d.drawImage(img.getImg(img.UN_REVILED), null , x, y);
            }
        }
    }

    clic

}
