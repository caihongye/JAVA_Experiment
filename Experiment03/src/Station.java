public class Station extends Thread {
    public static int tickets=20;

    public Station(String name){
        super(name);
    }

    @Override
    public void run() {
        super.run();
        while(tickets>0){
            try{
                sleep(10);
            }catch (Exception e){
                e.printStackTrace();
                return;
            }
            Sale(this.getName());
        }
        System.out.println("tickets are all sold out;");
        return;
    }

    public static synchronized void Sale(String name){
        if(Station.tickets>0){
            tickets--;
            System.out.println(name+" sale the "+(20-tickets)+"th ticket");
        }
    }
}

