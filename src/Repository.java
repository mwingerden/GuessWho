import java.util.Observable;

public class Repository extends Observable {
    private static final Repository instance = new Repository();
    private String question;
    private String response;
    private Reader.Kind kind;

    private Repository() {
    }

    static public Repository getInstance() {
        return instance;
    }

    public void setKind(Reader.Kind kind) {
        this.kind = kind;
    }

    public Reader.Kind getKind() {
        return this.kind;
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
        setChanged();
        notifyObservers(this.response);
    }
}
