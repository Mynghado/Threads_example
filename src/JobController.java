
public class JobController {
	boolean done = false; // Initialement, un segment n'est pas parcouru
	
	synchronized public void jobDone(){ // l'action a �t� r�alis�e
		done = true; // changement d'�tat
		this.notifyAll(); // on notifie tout le monde
	}

	synchronized public void isJobDone(){ // on v�rifie si l'action a �t� r�alis�e
		if(!done) // si l'action n'a pas �t� r�alis�e
			try {
				wait(); // on attend 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}