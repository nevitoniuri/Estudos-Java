package reuso;

public class Neurocirurgiao extends Medico {

	public Neurocirurgiao(String nome, String cpf, String crm) {
		super(nome, cpf, crm);
		System.out.println("Construtor Neurocirurgiao(nome,cpf,oab) chamado!");
	}

}
