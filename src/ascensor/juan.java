package ascensor;

import java.util.concurrent.Semaphore;

public class juan extends Thread  {
    protected Semaphore pepe;
    protected Semaphore juan;
    
    public juan(Semaphore juan, Semaphore pepe) {
        this.juan = juan;
        this.pepe = pepe;
    }
    public void run()  {
    	for(int i=0; i<3; i++) {
    		//hace el aquire del semaforo de pepe
            try {
                this.pepe.acquire();
                } catch(Exception e) {
                    e.printStackTrace();
                }
        	
        	//Imprime y hace el release
            try {
                sleep((int) Math.round(500 * Math.random() - 0.5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Juan");
            this.juan.release(1);
    	}
    	
        
        
    }
}
