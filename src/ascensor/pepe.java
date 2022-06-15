package ascensor;

import java.util.concurrent.Semaphore;

public class pepe extends Thread  {
    protected Semaphore pepe;
    protected Semaphore lupita;
    
    public pepe(Semaphore pepe, Semaphore lupita) {
        this.lupita = lupita;
        this.pepe = pepe;
    }
    public void run()  {
    	for(int i=0; i<3; i++) {
    		//hace el aquire del semaforo de lupita
            try {
                this.lupita.acquire();
                } catch(Exception e) {
                    e.printStackTrace();
                }
        	
        	//Imprime y hace el release
            try {
                sleep((int) Math.round(500 * Math.random() - 0.5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Pepe");
            this.pepe.release(1);
    	}
    	
        
        
    }
}
