import Engine.Game;
import Engine.Scene;
import SimpleSample.Level1;

import java.awt.*;
import java.awt.event.KeyEvent;

public class menu extends Scene {
    public menu(Game game) {
        super(game);
    }
    @Override
    public void update(float delta) {
        super.update(delta);
        // Si pulsamos espacio, el menú le dice al motor que cambie al Nivel 1
        if (input.isKeyPressed(KeyEvent.VK_SPACE)) {
            game.setScene(new nivel_1(game));
        }
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.drawString("MENU PRINCIPAL - Pulsa ESPACIO para jugar", 250, 300);
        super.render(g);
    }
}
