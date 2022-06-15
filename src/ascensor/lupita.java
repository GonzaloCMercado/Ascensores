package ascensor;

import java.util.concurrent.Semaphore;

public class lupita extends Thread  {
    protected Semaphore lupita;
    protected Semaphore juan;
    
    public lupita(Semaphore lupita, Semaphore juan) {
        this.lupita = lupita;
        this.juan = juan;
    }
    public void run()  {
    	for(int i=0; i<3; i++) {
    		//Imprime y hace el release
            try {
                sleep((int) Math.round(500 * Math.random() - 0.5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Lupita");
            this.lupita.release(1);
            
            //hace el aquire del semaforo de Juan
            try {
                this.juan.acquire();
                } catch(Exception e) {
                    e.printStackTrace();
                }
    	}
    	
        
    }
}
