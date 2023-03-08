import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Game extends JFrame {
    private static final int PORT1 = 6666;

    private static final int PORT2 = 7777;
    private static Repository repository = null;

    public Game() {
        setTitle("Guess Who");
        setLayout(new BorderLayout());
        add(new ChatPanel(repository), BorderLayout.SOUTH);
        add(new Board(), BorderLayout.CENTER);

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        if (Integer.parseInt(args[0]) == 1) {
            repository = new Repository(PORT1, PORT2);
        } else {
            repository = new Repository(PORT2, PORT1);
        }
        new Game();
    }
}