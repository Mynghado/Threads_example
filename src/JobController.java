
public class JobController {
	boolean done = false; // Initialement, un segment n'est pas parcouru
	
	synchronized public void jobDone(){ // l'action a été réalisée
		done = true; // changement d'état
		this.notifyAll(); // on notifie tout le monde
	}

	synchronized public void isJobDone(){ // on vérifie si l'action a été réalisée
		if(!done) // si l'action n'a pas été réalisée
			try {
				wait(); // on attend 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}