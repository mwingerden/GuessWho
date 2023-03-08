/**
 * The game class has the setup for the view of the game. Also has a main method that when two programs are run can
 * set up two repositories given each their own server and client.
 *
 * @author  Matthew Wingerden
 */

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Game extends JFrame {
    private static final int PORT1 = 6666;

    private static final int PORT2 = 7777;
    private static Repository repository = null;

    /**
     * This method is the constructor that calls an instance of Board and Chat Panel to set up the view of the game.
     */
    public Game() {
        setTitle("Guess Who");
        setLayout(new BorderLayout());
        add(new ChatPanel(repository), BorderLayout.SOUTH);
        add(new Board(), BorderLayout.CENTER);

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This is the main method. Receives an argument input that must be either 1 or 0. The method must be run twice
     * from the command line for the game to be set up correctly.
     * @param args lets the program know which port to set up correctly.
     */
    public static void main(String[] args) throws IOException {
        if (Integer.parseInt(args[0]) == 1) {
            repository = new Repository(PORT1, PORT2);
        } else {
            repository = new Repository(PORT2, PORT1);
        }
        new Game();
    }
}