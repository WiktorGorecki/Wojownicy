package wisniowa.tc.players;

import wisniowa.tc.Constants;

import javax.swing.*;

public class Warrior extends Player{

    public Warrior(String name, int x, int y, int goLeftKey, int goRightKey, int goUpKey, int goDownKey, int attackLeftKey, int attackRightKey) {
        super(name, x, y, goLeftKey, goRightKey, goUpKey, goDownKey, attackLeftKey, attackRightKey);
        type = "warrior";
        baseImage =
                new ImageIcon(
                        Constants.IMAGE_FOLDER +
                                "warrior/1.png"
                ).getImage();
    }
}
