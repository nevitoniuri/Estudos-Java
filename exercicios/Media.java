package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		sc.close();
		
		double media = (a*2 + b*3 + c*5) / 10;
		System.out.println("MEDIA = " + media);
	}
}
