
public class P2 extends Thread { // De B, X et E
	JobController AB, BD, BC, DE, CE, EF, EG;

	P2(JobController AB, JobController BD, JobController BC, JobController DE,
	JobController CE, JobController EF, JobController FG){
		this.AB = AB;
		this.BD = BD;
		this.BC = BC;
		this.DE = DE;
		this.CE = CE;
		this.EF = EF;
		this.EG = EG;
	}	
	
	public void run() {
		AB.isJobDone(); // le tracé avant B est-il fait?
		// System.out.println("B");
		
		// BX.isJobDone();
		// System.out.println("X");
		// XE.jobDone();
		// System.out.println("E");
	}
}
