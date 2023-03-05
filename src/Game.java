import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    private Thread thread;

    public Game(Reader.Kind kind) {
        Repository.getInstance().setKind(kind);
        setTitle("Guess Who");
        setLayout(new BorderLayout());
        add(new ChatPanel(), BorderLayout.SOUTH);
        add(new Board(), BorderLayout.CENTER);
        thread = new Thread(new Reader());
        thread.start();

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Game(Reader.Kind.SERVER);
        new Game(Reader.Kind.CLIENT);
    }
}