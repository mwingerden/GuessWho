import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public Game() {
        setTitle("Guess Who");
        setLayout(new BorderLayout());
        add(ChatPanel.getInstance(), BorderLayout.SOUTH);
        add(Board.getInstance(), BorderLayout.CENTER);

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Game();
    }
}