import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Board extends JPanel implements MouseListener {
    ArrayList<JLabel> characters = new ArrayList<>();
    ImageIcon out = new ImageIcon("./Images/out.png");
    JLabel current;
    public Board() {
        setLayout(new GridLayout(4, 6));
        characters.add(new JLabel(new ImageIcon("./Images/Alex.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Alfred.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Anita.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Anne.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Bernard.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Bill.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Charles.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Claire.png")));
        characters.add(new JLabel(new ImageIcon("./Images/David.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Eric.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Franz.png")));
        characters.add(new JLabel(new ImageIcon("./Images/George.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Herman.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Joe.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Maria.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Max.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Paul.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Peter.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Philip.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Richard.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Robert.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Sam.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Susan.png")));
        characters.add(new JLabel(new ImageIcon("./Images/Tom.png")));

        for (JLabel character : characters) {
            character.addMouseListener(this);
            add(character);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
