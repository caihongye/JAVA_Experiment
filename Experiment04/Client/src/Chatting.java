import java.io.*;
import java.io.OutputStream;
import java.net.Socket;

public class Chatting implements Runnable {
    private int port;
    private String host;
    Socket socket;
    String name;
    Chatting(String _host,int _port){
        host=_host;
        port=_port;
    }
    @Override
    public void run() {
        System.out.println("Thread start...");
        if(port<0||host==""||host==null){
            System.out.println("port or host error");
            return;
        }
        try{
            socket = new Socket(host, port);
            ClientListen cl=new ClientListen(socket);
            Thread t=new Thread(cl);
            t.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter write = new PrintWriter(socket.getOutputStream());
            System.out.println("please input your name:");
            name = br.readLine();
            write.println(name);
            write.flush();
            System.out.println("enter name success!");
            String readline="";
            while (!readline.equals(CODE.EXIT)) {
                readline = br.readLine();
                write.println(readline);
                write.flush();
            }
            write.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
    }
}
