import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientListen implements Runnable {
    private Socket s;
    ClientListen(Socket _s){
        s=_s;
    }
    @Override
    public void run() {
        if(s==null){
            System.out.println("server null!");
            return;
        }
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;
            line=in.readLine();
            while (line!=""&&line!=null){
                if(line.endsWith(CODE.KEEP)){
                    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    //PrintWriter write = new PrintWriter(s.getOutputStream());
                    //write.println("**ans**");
                    //write.flush();
                    //System.out.println(line);
                }else{
                    System.out.println(line);
                }
                line=in.readLine();
            }
        }catch (Exception e){
            System.out.println("client listen error:"+e.getMessage());
            return;
        }
    }
}
