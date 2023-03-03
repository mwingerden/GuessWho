import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private final ImageIcon out = new ImageIcon("./Images/out.png");
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("submit question")) {
            ChatPanel temp = ChatPanel.getInstance();
            temp.setText();
        }
        else {
            Board board = Board.getInstance();
            for(JButton character : board.getCharacters())
            {
                if(character == e.getSource()) {
                    character.setIcon(out);
                    break;
                }
            }
        }
    }
}
