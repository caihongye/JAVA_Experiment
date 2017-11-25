import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Listen implements Runnable {
    public Socket s;
    public boolean isRun;
    public String name;

    Listen(Socket _s) {
        s = _s;
    }

    @Override
    public void run() {
        if (s == null) {
            System.out.println("socket is null");
            return;
        }
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            name = in.readLine();
            if(name==null){
                return;
            }
            Annuce(name + " login");
            ListenMap.listenMap.put(name, this);
            String line = "";
            while (true) {
                line = in.readLine();
                if (line.equals(CODE.EXIT)) {
                    break;
                }
                Annuce(name + ":" + line);
            }
            Annuce(name + " exit");
            ListenMap.listenMap.remove(name);
            in.close();
            s.close();
        } catch (Exception e) {
            //System.out.println("socker rec error:"+e.getMessage());
            if(name==null){
                return;
            }
            Annuce(name + " non-normal exit");
            if (ListenMap.listenMap.containsKey(name))
                ListenMap.listenMap.remove(name);
            return;
        }
    }

    public boolean Send(String msg) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter write = new PrintWriter(s.getOutputStream());
            write.println(msg);
            write.flush();
        } catch (Exception e) {
            System.out.println("send msg error:" + e.getMessage());
            return false;
        }
        return true;
    }

    private void Annuce(String msg) {
        System.out.println(msg);
        ListenMap.Broadcast(msg);
    }
}
