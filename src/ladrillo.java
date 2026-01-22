import Engine.Collidable;
import Engine.GameObject;
import Engine.InputHandler;
import Engine.Scene;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Engine.Game.input;

public class ladrillo extends GameObject implements Collidable {
    private Scene scene;
    /**
     * Constructor base para un objeto de juego.
     *
     * @param x      Posición inicial en el eje X.
     * @param y      Posición inicial en el eje Y.
     * @param width  Ancho del objeto.
     * @param height Alto del objeto.
     */
    public ladrillo(float x, float y, int width, int height, Scene scene) {
        super(x, y, 50, 20);
        this.scene = scene;
    }

    @Override
    public void onCollision(GameObject other) {
        if (other instanceof bola) {
            scene.removeObject(this);
        }
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.GRAY);
        g.fillRect((int)x, (int)y, width, height);
    }
}
