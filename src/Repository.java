import java.util.Observable;

public class Repository extends Observable {
    private static final Repository instance = new Repository();
    private String question;
    private String response;

    private Repository() {
    }

    static public Repository getInstance() {
        return instance;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
