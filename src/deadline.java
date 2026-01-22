import Engine.Game;
import Engine.GameObject;
import Engine.InputHandler;
import Engine.Scene;

import java.awt.*;

public class deadline extends GameObject {


    @Override
    public void update(float delta) {

    }

    public deadline(int x, int y, InputHandler input, Scene scene) {
        super(x,y,800,10);
        this.scene = scene;

        
    }


    @Override
    public void render(Graphics2D g) {

        g.setColor(Color.red); // Gris oscuro
        g.fillRect((int)x, (int)y, width, height);

    }
    public void onCollision(GameObject other) {
        if (other instanceof bola) {

        }
    }

}
