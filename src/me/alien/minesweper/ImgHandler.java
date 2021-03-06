package me.alien.minesweper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImgHandler {


    public final String BOMB_ONE =       "bomb_1";
    public final String BOMB_TOW =       "bomb_2";
    public final String BOMB_THERE =     "bomb_3";
    public final String BOMB_FORE =      "bomb_4";
    public final String BOMB_FIVE =      "bomb_5";
    public final String BOMB_SIX =       "bomb_6";
    public final String BOMB_SEVEN =     "bomb_7";
    public final String BOMB_EIGHTH =    "bomb_8";
    public final String BOMB_EMPTY =     "bomb_0";
    public final String ZERO =           "zero";
    public final String ONE =            "one";
    public final String TOW =            "tow";
    public final String THERE =          "there";
    public final String FORE =           "fore";
    public final String FIVE =           "five";
    public final String SIX =            "six";
    public final String SEVEN =          "seven";
    public final String EIGHTH =         "eight";
    public final String NINE =           "nine";
    public final String FLAG =           "flag";
    public final String BOMB =           "bomb";
    public final String WRONG_FLAG =     "flag_wrong";
    public final String UN_REVILED =     "un_reviled";

    public BufferedImage getImg(String img){
        BufferedImage image = null;
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream("/img/"+img+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
