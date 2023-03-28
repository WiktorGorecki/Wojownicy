package wisniowa.tc.players;

import wisniowa.tc.Constants;

import javax.swing.*;

public class Archer extends Player {
    public Archer(String name, int x, int y, int goLeftKey, int goRightKey, int goUpKey, int goDownKey, int attackLeftKey, int attackRightKey) {
        super(name, x, y, goLeftKey, goRightKey, goUpKey, goDownKey, attackLeftKey, attackRightKey);
        type = "archer";
        baseImage =
                new ImageIcon(
                        Constants.IMAGE_FOLDER +
                                "archer/1.png"
                ).getImage();
    }
}
