import Engine.Collidable;
import Engine.Game;
import Engine.GameObject;
import Engine.InputHandler;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Engine.Game.getInput;
import static Engine.Game.input;

public class jugador extends GameObject implements Collidable {

    /**
     * Constructor base para un objeto de juego.
     *
     * @param x      Posición inicial en el eje X.
     * @param y      Posición inicial en el eje Y.
     * @param width  Ancho del objeto.
     * @param height Alto del objeto.
     */
    public jugador(float x, float y, int width, int height) {
        super(x, y, width, height);
    }

    public jugador(int x, int y, InputHandler input) {
        super(x,y,50,10);
    }

    @Override
    public void update(float delta) {
        if (getInput().isKeyHeld(KeyEvent.VK_A)){
            x-=5;
        }
        if (getInput().isKeyHeld(KeyEvent.VK_D)){
            x+=5;
        }

    }
    public Rectangle rect;

    public jugador(int x, int y, int ancho, int alto) {
        super(x,y,50,10);

        rect = new Rectangle(x, y, ancho, alto);
    }

    @Override
    public void render(Graphics2D g) {

        g.setColor(Color.blue); // Gris oscuro
        g.fillRect((int)x, (int)y, width, height);
        if (x<=0) x=0;
        if (x>=780)x=750;

    }


    @Override
    public void onCollision(GameObject other) {

    }
}

