import java.io.IOException;
import java.util.Observable;

public class Repository extends Observable {
    private static final Repository instance = new Repository();
    private String response = "";

    private Repository() {}

    static public Repository getInstance() {
        return instance;
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
