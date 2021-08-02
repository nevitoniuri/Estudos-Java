package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a ID do Funcionario: ");
		int id = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		int horas = sc.nextInt();
		
		System.out.println("Informe o valor da hora: ");
		double valor_hora = sc.nextDouble();
		sc.close();
		
		double salario = horas * valor_hora;
		
		System.out.println("ID = " + id);
		System.out.printf("Salário = %.2f", salario);
	}
}
