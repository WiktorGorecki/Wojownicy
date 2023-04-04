package wisniowa.tc.enemies;

import wisniowa.tc.players.Player;


import javax.swing.*;


public class Monster implements Enemy{
    int x;
    int y;
    @Override
    public void go(int xDirection, int yDirection) {
        if (Player.getOccupatedPlaces()[x - 1][y] == false) {
            Player.getOccupatedPlaces()[x][y] = false;
            Player.getOccupatedPlaces()[--x][y] = true;
        }
    }
}
