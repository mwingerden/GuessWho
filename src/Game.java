import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    public Game() {
        setTitle("Guess Who");
        setLayout(new BorderLayout());
        add(new ChatPanel(), BorderLayout.SOUTH);
        add(new Board(), BorderLayout.CENTER);

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Game();
        new Game();
        Thread server = new Thread(new Writer(), "SERVER");
        server.start();
        Thread thread1 = new Thread(new Reader(), "client 1");
        thread1.start();
//        Thread thread2 = new Thread(new Reader(), "client 2");
//        thread2.start();
    }
}