
public class P3 extends Thread{ // C et G 
	JobController BC, CE, EG;
	
	P3(JobController BC, JobController CE){
		this.BC = BC;
		this.CE = CE;
		this.EG = EG;
	}
	
	public void run() {
		BC.isJobDone(); // le tracé avant le C est-il fait ?
		System.out.println("C"); // le tracé est bel et bien fait
		
		CE.isJobDone(); // le tracé avant le E est-il fait ?
		EG.jobDone(); // le tracé est bel et bien fait donc on trace en partant de E
		System.out.println("G"); // on affiche G
	}
}
