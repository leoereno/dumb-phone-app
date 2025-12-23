import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.Sprite;

public class GameApp extends GameCanvas implements Runnable {

    private Sprite player;
    private boolean running;

    public GameApp(){
        super(true);
    }

    public void start(){
        running = true;
        new Thread(this).start();
    }

    @Override
    public void run() {
        Graphics g = getGraphics();
        while (running) {
            checkInput();
            updateWorld();
            draw(g);
            flushGraphics();
        }
    }

    private void checkInput() {
        int keyStates = getKeyStates();
        if ((keyStates & UP_PRESSED) != 0) { /* move player up */ }
    }

    private void updateWorld() { /* Lógica de física e colisões */ }

    private void draw(Graphics g) {
        g.setColor(0, 0, 0);
        g.fillRect(0, 0, getWidth(), getHeight());
        // player.paint(g);

    }
}