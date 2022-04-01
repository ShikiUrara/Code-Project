package start;

import java.awt.event.KeyListener;

public class KeyEvent  implements KeyListener {
    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        System.out.println("Key Code: " + e.getKeyCode());
        System.exit(0);
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {

    }
}
