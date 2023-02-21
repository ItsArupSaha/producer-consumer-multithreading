public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c = c;
    }

    public void run(){
        try{
            while(true){
                c.consume_item();
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
            }
        }catch (Exception e){}
    }
}
