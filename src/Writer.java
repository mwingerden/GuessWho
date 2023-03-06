import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Writer implements Runnable {
    List<DataOutputStream> dataOutputStreams = new ArrayList<>();
    String str = "";
    Repository repository = Repository.getInstance();

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(6666);
            while (true) {
                Socket s = ss.accept();
                DataInputStream din = new DataInputStream(s.getInputStream());
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());

                String str = "", str2 = "";
                while (!str.equals("stop")) {
                    str = din.readUTF();
                    repository.setResponse(str);
//                    System.out.println("client says: "+str);
                    str2 = repository.getResponse();
                    dout.writeUTF(str2);
                    dout.flush();
                }
            }
//            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
