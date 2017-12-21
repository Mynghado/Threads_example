
public class P3 extends Thread{ // C et G 
	JobController BC, CE, EG;
	
	P3(JobController BC, JobController CE){
		this.BC = BC;
		this.CE = CE;
		this.EG = EG;
	}
	
	public void run() {
		BC.isJobDone(); // le trac� avant le C est-il fait ?
		System.out.println("C"); // le trac� est bel et bien fait
		
		CE.isJobDone(); // le trac� avant le E est-il fait ?
		EG.jobDone(); // le trac� est bel et bien fait donc on trace en partant de E
		System.out.println("G"); // on affiche G
	}
}
