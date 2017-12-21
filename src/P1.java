
public class P1 extends Thread{ // De A � F : A, D, F
	// Les segments du chemin qui impactent les "�tapes" du processus (A, D et F)
	JobController AB, BD, DE, EF;
	
	P1(JobController AB, JobController BD, JobController DE, JobController EF){
		this.AB = AB;
		this.BD = BD;
		this.DE = DE;
		this.EF = EF;
	}
	
	public void run() {
		// Pour chaque �l�ment du processus, on doit d'abord v�rifier le trac�
		// le pr�c�dent directement
		
		// Rien avant AB, c'est bon on peut faire l'action
		System.out.println("A"); // L'action
		AB.jobDone(); // Notification que le travail est bien fait
		
		// On appelle une m�thode qui va attendre tant qu'elle sera "autoris�e" �
		// s'ex�cuter, en fonction de nos contraintes
		BD.isJobDone(); // le trac� avant le D est-il fait ?
		System.out.println("D"); // le trac� est bel et bien fait
		DE.jobDone(); // donc on peut partir de D vers la prochaine �tape
		
		EF.isJobDone(); // le trac� avant le F est-il fait ?
		System.out.println("F"); // le trac� est bel et bien fait
	} 
}
