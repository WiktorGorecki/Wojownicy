package wisniowa.tc;

import wisniowa.tc.players.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import wisniowa.tc.Menu;

public class GamePanel extends JPanel {
    public int x = 100;
    public int y = 300;
    private Team team;
    Player[] players;
    public Boolean pause = false;
    public Boolean started = false;

    public GamePanel(Team team) {
        Menu menu = new Menu();
        started = menu.MainMenu();
        this.team = team;
        this.players = this.team.getTeamMembers();
        setFocusable(true);
        addKeyListener(new HeroesKeyListener2());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /////
        //Image tmpImage = new ImageIcon("static/images/warrior/1.png").getImage();
        /////
        for (Player player : players) {
            g.drawImage(
                      player.getBaseImage(),
                    player.getX()*Constants.CHARACTER_IMG_WIDTH,
                    player.getY()*Constants.CHARACTER_IMG_HEIGHT, this);
        }
        //g.drawImage(tmpImage, x, y, this);
        g.drawString("Wisniowa", 300, 500);

        /*System.out.println(Player.getOccupatedPlaces().length);
        for (boolean[]rows : Player.getOccupatedPlaces()) {
            for (boolean occupPlace : rows) {
                System.out.print(occupPlace + " ");
            }
            System.out.println();
        }
        System.out.println();*/
    }

    public class HeroesKeyListener2 extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            /*if (key == KeyEvent.VK_SHIFT) {
                if (e.getKeyLocation() == 2) {
                    System.out.println("Lewy SHIFT");
                } else {
                    System.out.println("Prawy SHIFT");
                }
            }*/

            for (Player player: players) {
                if (player.getGoLeftKey() == key && pause==false && started) {
                    player.tryGoLeft();
                    //player.setX(player.getX() - Constants.CHARACTER_IMG_WIDTH);
                }
                if (player.getGoRightKey() == key && pause==false && started) {
                    player.tryGoRight();
                    //player.setX(player.getX() + Constants.CHARACTER_IMG_WIDTH);
                }
                if (player.getGoUpKey() == key && pause==false && started) {
                    player.tryGoUp();
                    //player.setY(player.getY() - Constants.CHARACTER_IMG_HEIGHT);
                }
                if (player.getGoDownKey() == key && pause==false && started) {
                    player.tryGoDown();
                    //player.setY(player.getY() + Constants.CHARACTER_IMG_HEIGHT);
                }
                if (key==KeyEvent.VK_ESCAPE && started) {
                    if(pause==true) {
                        pause = false;
                    } else {
                        pause = true;
                    }
                }
            }
            repaint();
        }
    }
}
