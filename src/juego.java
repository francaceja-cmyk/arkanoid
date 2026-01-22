import Engine.Game;
import SimpleSample.MenuScene;

void main(String[] args) {
    int score = 0;
    Game game = new Game(800, 600, "Arkanoid");
    game.setScene(new menu(game));
    game.start();
}
