import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Reader implements Runnable {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 12345;
//    private volatile PrintWriter out;

    public enum Kind {

        CLIENT,
        SERVER
    }
    @Override
    public void run() {
        try {
            Socket socket;
            if (Repository.getInstance().getKind() == Kind.CLIENT) {
                socket = new Socket(HOST, PORT);
            } else {
                ServerSocket ss = new ServerSocket(PORT);
                socket = ss.accept();
            }
            Scanner in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(), true);
//            display("Connected");
            while (true) {
                System.out.println(in.nextLine());
//                Repository.getInstance().setResponse(in.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
