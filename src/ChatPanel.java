import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class ChatPanel extends JPanel implements Observer {
    JTextField questionArea;
    JTextField responseArea;
    Repository repository;

    public ChatPanel() {
        repository = Repository.getInstance();
        repository.addObserver(this);
        Controller controller = new Controller(this, null);
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
        sendQuestionButton.addActionListener(controller);
        question.add(sendQuestionButton, BorderLayout.NORTH);


        responseArea = new JTextField();
        responseArea.setEditable(false);
        setLayout(new BorderLayout());
        responseArea.setFont(new Font("Helvetica", Font.PLAIN, 50));
        responseArea.setMinimumSize(new Dimension(100, 500));
        add(responseArea, BorderLayout.CENTER);

        add(question, BorderLayout.NORTH);
        add(responseArea, BorderLayout.CENTER);
    }

    public void setText() {
        repository.setQuestion(questionArea.getText());
    }

    @Override
    public void update(Observable o, Object arg) {
        responseArea.setText((String) arg);
    }
}
