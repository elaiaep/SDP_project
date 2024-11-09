package singleton;

import controller.GameController;

public class GameManager {
    private static GameManager instance;

    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        GameController gameController = new GameController();
        gameController.play();
    }
}