import Engine.Game;
import Engine.Scene;
import SimpleSample.MenuScene;
import SimpleSample.Player;

import java.awt.*;
import java.awt.event.KeyEvent;

public class nivel_1 extends Scene {

    public nivel_1(Game game) {
        super(game);
        this.addObject(new jugador(400, 500, input));
        this.addObject(new deadline(0,595,input, this));
        this.addObject(new bola(400,400,input));
        for (int o=1;o<5;o++){
            for (int i=0; i<=12; i++) {
                this.addObject(new ladrillo(20 + (30 + 30) * i, 60*o, 50, 20, this));
            }
        }


    }
    @Override
    public void update(float delta) {
        // 1. Ejecutamos la lógica de todos los GameObjects de la lista
        super.update(delta);

        // 2. Lógica específica de este nivel
        // Ejemplo: Si pulsa ESC, volvemos a una hipotética escena de Menú
        if (input.isKeyPressed(KeyEvent.VK_ESCAPE)) {
            game.setScene(new menu(game));
            System.out.println("Cambiando a Menú...");
        }
    }

    @Override
    public void render(Graphics2D g) {
        // Dibujamos un fondo específico para este nivel
        g.setBackground(Color.black);
        g.setColor(new Color(30, 30, 30)); // Gris oscuro
        g.fillRect(0, 0, 800, 600);

        g.setColor(Color.WHITE);
        g.drawString("NIVEL 1 - Usa WASD para moverte | ESC para salir", 20, 30);
        g.drawString("Score: ",30,40);

        // Dibujamos todos los GameObjects
        super.render(g);
    }
}

