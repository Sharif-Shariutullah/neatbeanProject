
public class process {
    int i;

    public process(int i) {
        this.i = i;
    }
    
    public void run(){
    
        for (int j = 0; j < 10; j++) {
            System.out.println(j + "Process thread");
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        
        }
    };
    
    
}
