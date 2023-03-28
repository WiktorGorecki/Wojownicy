package wisniowa.tc;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HeroesKeyListener extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        /*System.out.println("char= " + e.getKeyChar());
        System.out.println("code= " + e.getKeyCode());
        System.out.println("location= " + e.getKeyLocation());
        System.out.println("/n/n");*/

        int key = e.getKeyCode();
        if (key == 39) {

            System.out.println("strzalka w prawo");
        } else {
            System.out.println("Nie strzalka w prawo");
        }
    }
}
