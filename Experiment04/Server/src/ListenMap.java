import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ListenMap {
    public static Map<String, Listen> listenMap = new ConcurrentHashMap<>();

    public static void Init() {
        listenMap = new ConcurrentHashMap<>();
    }

    public static boolean Broadcast(String msg) {
        boolean isOK=true;
        Iterator entries = ListenMap.listenMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String) entry.getKey();
            Listen value = (Listen) entry.getValue();
            if(!value.Send(msg)){
                isOK=false;
            }
        }
        return isOK;
    }
}
