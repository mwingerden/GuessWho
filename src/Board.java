import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
    private final ArrayList<JButton> characters = new ArrayList<>();
//    private static final Board instance = new Board();
    public Board() {
        Controller controller = new Controller(null, this);
        setLayout(new GridLayout(4, 6));
        characters.add(new JButton(new ImageIcon("./Images/Alex.png")));
        characters.add(new JButton(new ImageIcon("./Images/Alfred.png")));
        characters.add(new JButton(new ImageIcon("./Images/Anita.png")));
        characters.add(new JButton(new ImageIcon("./Images/Anne.png")));
        characters.add(new JButton(new ImageIcon("./Images/Bernard.png")));
        characters.add(new JButton(new ImageIcon("./Images/Bill.png")));
        characters.add(new JButton(new ImageIcon("./Images/Charles.png")));
        characters.add(new JButton(new ImageIcon("./Images/Claire.png")));
        characters.add(new JButton(new ImageIcon("./Images/David.png")));
        characters.add(new JButton(new ImageIcon("./Images/Eric.png")));
        characters.add(new JButton(new ImageIcon("./Images/Franz.png")));
        characters.add(new JButton(new ImageIcon("./Images/George.png")));
        characters.add(new JButton(new ImageIcon("./Images/Herman.png")));
        characters.add(new JButton(new ImageIcon("./Images/Joe.png")));
        characters.add(new JButton(new ImageIcon("./Images/Maria.png")));
        characters.add(new JButton(new ImageIcon("./Images/Max.png")));
        characters.add(new JButton(new ImageIcon("./Images/Paul.png")));
        characters.add(new JButton(new ImageIcon("./Images/Peter.png")));
        characters.add(new JButton(new ImageIcon("./Images/Philip.png")));
        characters.add(new JButton(new ImageIcon("./Images/Richard.png")));
        characters.add(new JButton(new ImageIcon("./Images/Robert.png")));
        characters.add(new JButton(new ImageIcon("./Images/Sam.png")));
        characters.add(new JButton(new ImageIcon("./Images/Susan.png")));
        characters.add(new JButton(new ImageIcon("./Images/Tom.png")));

        for (JButton character : characters) {
            character.addActionListener(controller);
            add(character);
        }
    }

//    public static Board getInstance() {
//        return instance;
//    }

    public ArrayList<JButton> getCharacters() {
        return characters;
    }
}