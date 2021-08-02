package exercicios;

import java.util.Scanner;

public class Soma_Produto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		sc.close();
		
		int soma = a + b;
		int produto = a * b;
		System.out.println("SOMA = " + soma);
		System.out.println("PRODUTO = " + produto);
	}
}
