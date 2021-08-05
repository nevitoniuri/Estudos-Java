package reuso;

public class Medico extends Pessoa {
	
	private String crm;
	
	public Medico(String nome, String cpf, String crm) {
		super(nome, cpf);
		System.out.println("Construtor Medico(nome,cpf,crm) chamado!");
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

}
