package desafios_dio;

import java.io.IOException;
import java.util.Scanner;

public class Domingo {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o valor da hora: ");
		
		while (leitor.hasNext()) {
			String[] relogio = leitor.nextLine().split(":");    		
			int hora = Integer.parseInt(relogio[0]);
			int min = Integer.parseInt(relogio[1]);
			int atraso = 0;
	  		
			if (hora >= 7) {
				atraso = 60 * (hora - 7) + min;
	  		}
  			
			System.out.println("Atraso maximo: " + atraso);
	  	}
		leitor.close();
	}
}