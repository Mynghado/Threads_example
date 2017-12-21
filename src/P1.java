
public class P1 extends Thread{ // De A à F : A, D, F
	// Les segments du chemin qui impactent les "étapes" du processus (A, D et F)
	JobController AB, BD, DE, EF;
	
	P1(JobController AB, JobController BD, JobController DE, JobController EF){
		this.AB = AB;
		this.BD = BD;
		this.DE = DE;
		this.EF = EF;
	}
	
	public void run() {
		// Pour chaque élément du processus, on doit d'abord vérifier le tracé
		// le précédent directement
		
		// Rien avant AB, c'est bon on peut faire l'action
		System.out.println("A"); // L'action
		AB.jobDone(); // Notification que le travail est bien fait
		
		// On appelle une méthode qui va attendre tant qu'elle sera "autorisée" à
		// s'exécuter, en fonction de nos contraintes
		BD.isJobDone(); // le tracé avant le D est-il fait ?
		System.out.println("D"); // le tracé est bel et bien fait
		DE.jobDone(); // donc on peut partir de D vers la prochaine étape
		
		EF.isJobDone(); // le tracé avant le F est-il fait ?
		System.out.println("F"); // le tracé est bel et bien fait
	} 
}
