
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server implements Runnable {
    private int port;
    ServerSocket server;
    boolean isRun;
    ThreadPoolExecutor listenPool;
    Server(int _port){
        port=_port;
        listenPool=new ThreadPoolExecutor(1000,1000,10,
                TimeUnit.MINUTES,new ArrayBlockingQueue<Runnable>(50));
    }
    @Override
    public void run() {
        if(port<0){
            System.out.println("port error");
            return;
        }
        System.out.println("server start...");
        try{
            try{
                server=new ServerSocket(port);
                System.out.println("server start success!");
                isRun=true;
            }catch(Exception e) {
                System.out.println("server start fail："+e.getMessage());
            }
            while(isRun){
                Socket socket=null;
                try{
                    socket=server.accept();
                    System.out.println(socket.getInetAddress()+" connect");
                    Listen l=new Listen(socket);
                    listenPool.execute(l);
                    //Thread t=new Thread(l);
                }catch(Exception e) {
                    System.out.println("server accept error:"+e.getMessage());
                }
            }
        }catch(Exception e) {
            System.out.println("Error."+e);
        }
    }
}
