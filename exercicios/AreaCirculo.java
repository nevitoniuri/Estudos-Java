package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do raio: ");
		double raio = sc.nextDouble();
		sc.close();
		
		double pi = 3.14159;
		
		double area = pi * (Math.pow(raio, 2));
		
		System.out.println("Area do Circulo: " + area);
		System.out.printf("Area do Circulo: %.2f", area);
	}
}
