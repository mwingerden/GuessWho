import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private final ImageIcon out = new ImageIcon("./Images/out.png");
    private final ChatPanel chatPanel;
    private final Board board;
    public Controller(ChatPanel chatPanel, Board board) {
        this.chatPanel = chatPanel;
        this.board = board;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("submit question")) {
            chatPanel.setText();
        }
        else {
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
