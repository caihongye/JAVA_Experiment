public class Main {
    public static void main(String[]args){
        Station s[]=new Station[3];
        for(int i=0;i<3;i++){
            s[i]=new Station(String.valueOf(i+1));
            s[i].start();
        }
    }
}
