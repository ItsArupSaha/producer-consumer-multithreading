public class Producer extends Thread{
    Company p;
    Producer(Company p){
        this.p = p;
    }
    public void run(){
        int i=1;
        try {
            while(true){
                p.produce_item(i);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
                i++;
            }
        }catch (Exception e) {}
    }
}
