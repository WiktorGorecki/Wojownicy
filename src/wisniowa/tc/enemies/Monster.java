package wisniowa.tc.enemies;

import wisniowa.tc.Constants;

import javax.swing.*;

public class Monster extends Enemy{
    public Monster(int x, int y, int hp) {
        super(x, y ,hp);
        type = "monster";
        baseImage =
                new ImageIcon(
                        Constants.IMAGE_FOLDER +
                                "monster/1.png"
                ).getImage();
        hp=120;
    }
}
