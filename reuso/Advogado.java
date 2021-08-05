package reuso;

public class Advogado extends Pessoa {
	
	private String oab;
	
	public Advogado(String nome, String cpf, String oab) {
		super(nome, cpf);
		System.out.println("Construtor Advogado(nome,cpf,oab) chamado!");
		this.oab = oab;
	}

	public String getOab() {
		return oab;
	}

	public void setOab(String oab) {
		this.oab = oab;
	}

}
