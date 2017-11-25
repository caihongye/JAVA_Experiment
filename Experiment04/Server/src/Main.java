import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ListenMap.Init();
        Server c=new Server(9999);
        Thread t=new Thread(c);
        t.start();
        Thread sendClient=new Thread(()->{
            while(true){
                try{
                    Thread.currentThread().sleep(5000);
                    System.out.println("online:"+ListenMap.listenMap.size());
                    Iterator entries = ListenMap.listenMap.entrySet().iterator();
                    while (entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) entries.next();
                        String key = (String)entry.getKey();
                        Listen value = (Listen)entry.getValue();
                        //System.out.println("send to "+key+" **keep**");
                        //System.out.println(key);
                        value.Send(CODE.KEEP);
                    }
                }catch (Exception e){
                    System.out.println("sleep error:"+e.getMessage());
                    return;
                }
            }
        });
        sendClient.start();
    }
}
