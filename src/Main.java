import singleton.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();
    }
}