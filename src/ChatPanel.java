import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class ChatPanel extends JPanel implements Observer, ActionListener {
    private static final ChatPanel instance = new ChatPanel();
    JTextField questionArea;
    String question;

    private ChatPanel() {
        setLayout(new BorderLayout());

        JPanel question = new JPanel();
        question.setLayout(new GridLayout(1, 2));

        questionArea = new JTextField();
        questionArea.setEditable(true);
        setLayout(new BorderLayout());
        questionArea.setFont(new Font("Helvetica", Font.PLAIN, 35));
        questionArea.setMinimumSize(new Dimension(100, 500));
        question.add(questionArea, BorderLayout.NORTH);


        JButton sendQuestionButton = new JButton("Submit Question");
        sendQuestionButton.addActionListener(this);
        question.add(sendQuestionButton, BorderLayout.NORTH);


        JTextField responseArea = new JTextField();
        responseArea.setEditable(false);
        setLayout(new BorderLayout());
        responseArea.setFont(new Font("Helvetica", Font.PLAIN, 50));
        responseArea.setMinimumSize(new Dimension(100, 500));
        add(responseArea, BorderLayout.CENTER);

        add(question, BorderLayout.NORTH);
        add(responseArea, BorderLayout.CENTER);
    }

    public static ChatPanel getInstance() {
        return instance;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        question = questionArea.getText();
        questionArea.setText("");
//        System.out.println(question);
    }
}
