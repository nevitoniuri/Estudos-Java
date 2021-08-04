package ufc.java;

public class Ufc_Main {

	public static void main(String[] args) {
		Lutador l1 = new Lutador ("Carlos", "Brasileiro", 35, 7, 2, 0, 1.85f, 95.30f);
		l1.ganharLuta();
		l1.perderLuta();
		l1.empatarLuta();
		l1.apresentar();
	}
}
