

class AsgOne implements Runnable{
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
            }
            Thread.sleep(5000);
            for(int i=6;i<=10;i++){
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class Aone{
    public static void main(String[] args) {
        AsgOne a1 = new AsgOne();
        Thread t = new Thread(a1);
        t.start();
    }
}
