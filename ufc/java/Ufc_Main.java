package ufc.java;

public class Ufc_Main {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador ("Carlos", "Brasileiro", 35, 7, 2, 0, 1.85f, 95.30f);
		l[1] = new Lutador ("Putscript", "Brasileiro", 29, 14, 2, 3, 1.68f, 57.8f);
		l[2] = new Lutador ("Iuri", "Brasileiro", 25, 12, 3, 1, 1.72f, 84.5f);
		l[3] = new Lutador("John", "USA", 28, 9, 2, 3, 1.85f, 60.2f);
		
		l[2].apresentar();
		
		l[0].status ();
		l[1].status ();
		l[2].status ();
		l[3].status ();
	}
}
