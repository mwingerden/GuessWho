/**
 * The Repository class takes the response from either player and sends it to the other.
 *
 * @author  Matthew Wingerden
 */

import java.io.IOException;
import java.util.Observable;

public class Repository extends Observable {

    private final Writer writer;

    public Repository(int readerPort, int writerPort) throws IOException {
        Reader reader = new Reader(this, readerPort);
        reader.start();

        writer = new Writer(writerPort);
        writer.start();
    }

    public void append(String text) throws IOException {
        setChanged();
        notifyObservers(text);
    }

    public void send(String text) throws IOException {
        writer.write(text);
    }
}
