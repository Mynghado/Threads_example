
public class Main {
	// Tous les contrôleurs
	JobController AB, BD, BC, DE, CE, EF, EG;
	
	// Tous les processus
	P1 p1 = new P1(AB, BD, DE, EF);
	P2 p2 = new P2(AB, BD, BC, DE, CE, EF, EG);
	P3 p3 = new P3(CE, EG);
}
