package construtores;

public class TesteSimplesConstrutor {

	public static void main(String[] args) {
		
		// Sem o uso do construtor com par�metros
		Pessoa p = new Pessoa(); // Erro: construtor padr�o
		p.nome = "Joao";         // n�o existe mais
		p.cpf = "000.000.000-00";
		
		// Com o uso do construtor com par�metros
		Pessoa p2 = new Pessoa("Joao", "000.000.000-00");
		// ...
		System.out.println(p.nome); // Imprime: Jo�o
		System.out.println(p.cpf); // Imprime: 000.000.000-00
		
	}
}

/*public class TesteSimplesConstrutor {

	public static void main(String[] args) {
		
		// Sem o uso do construtor com par�metros
		//Pessoa p = new Pessoa(); 
		//p.nome = "Jo�o";         
		//p.cpf = "000.000.000-00";
		
		// Com o uso do construtor com par�metros
		Pessoa p = new Pessoa("Jo�o", "000.000.000-00");
		System.out.println(p.nome); // Imprime: Jo�o
		System.out.println(p.cpf); // Imprime: 000.000.000-00
		
	}
}*/

/*public class TesteSimplesConstrutor {

	public static void main(String[] args) {
		
		// Imprime: "Construindo uma pessoa..."
		Pessoa p = new Pessoa();  

	}

}*/
