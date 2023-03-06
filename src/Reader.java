import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Reader implements Runnable {
    String str = "hello";
    Repository repository = Repository.getInstance();
    @Override
    public void run() {
        try {
            Socket s = new Socket("localhost", 6666);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            String str="",str2="";
            while(!str.equals("stop")){
                str = repository.getResponse();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
//                System.out.println("Server says: "+str2);
            }

            dout.close();
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
