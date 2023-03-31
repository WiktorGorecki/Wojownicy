package wisniowa.tc.enemies;

import java.awt.*;

public class Enemy {
    protected int x;
    protected int y;
    protected Image baseImage;
    protected String type;
    protected int hp;

    public Enemy(int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
    }
}
