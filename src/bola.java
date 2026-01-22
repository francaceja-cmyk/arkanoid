import Engine.Collidable;
import Engine.GameObject;
import Engine.InputHandler;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Engine.Game.input;

public class bola extends GameObject implements Collidable {
    private float speedX = 2f;
    private float speedY = 2f;
    public bola(float x, float y, int width, int height) {
        super(x, y, width, height);
    }

    public bola(int x, int y, InputHandler input) {
        super(x,y,20,20);
    }

    @Override
    public void update(float delta) {
        x+=speedX;
        y+=speedY;
        if(x<=0){
            speedX*=-1;
        }
        if(x>=780){
            speedX*=-1;
        }
        if(y<=0){
            speedY*=-1;
        }
        if(y>=580){
            speedY*=-1;
        }

    }

    @Override
    public void render(Graphics2D g) {

        g.setColor(Color.yellow); // Gris oscuro
        g.fillOval((int)x, (int)y, width, height);
        g.setColor(Color.white);
        g.drawRect((int)x, (int)y, width, height);

    }

    @Override
    public void onCollision(GameObject other) {
        speedY=-speedY;

    }
}
