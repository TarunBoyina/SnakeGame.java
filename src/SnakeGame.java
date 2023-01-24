import javax.swing.*;

public class SnakeGame extends JFrame {
    GameBoard gameBoard;
    SnakeGame(){
        gameBoard = new GameBoard();
        add(gameBoard);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
    }
}