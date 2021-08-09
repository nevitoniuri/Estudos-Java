package banco_exercicio;

public class ContaBanco {
	public int numConta; //numero da conta
	protected String tipo; //CC ou CP
	private String dono; //nome do dono
	private double saldo; //saldo em reais
	private boolean isAberta; //aberta ou fechada
	
	//CONSTRUTOR
	public ContaBanco() {
	}
	
	//METODOS
	
	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: R$ " + this.getSaldo());
		System.out.println("Status: " + this.isAberta());
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setAberta(true);
		
		if (t == "CC") {
			this.setSaldo(50);
		} else  if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta Aberta com sucesso.");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Não é possível fechar a conta. Saldo disponível de R$ " + this.getSaldo());
		} else if (this.getSaldo() < 0) { 
			System.out.println("Ação Impossível. Conta em DÉBITO de R$ " + this.getSaldo());
		} else {
			this.setAberta(false);
			System.out.println("Conta Fechada com Sucesso.");
		}
	}
	
	public void depositar(double v) {
		if(this.isAberta()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito Realizado. Novo saldo: R$ " + this.getSaldo());
		} else {
			System.out.println("Conta Fechada. Impossível realizar o depósito.");
		}
	}
	
	public void sacar(double v) {
		if(this.isAberta()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() + v);
				System.out.println("Saque realizado. Novo saldo: R$ " - this.getSaldo());
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada.");
		}
		
	}

	public void pagarMensal() {
		int v = 0;
		
		if(this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		
		if(this.isAberta()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga. Novo saldo: R$ " + this.getSaldo());
			} else {
				System.out.println("Saldo insuficiente.");
			}
			
		} else {
			System.out.println("Impossível. Conta fechada.");
		}
	}

	
	//GETTERS E SETTERS
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		if(this.tipo == "CC") {
			this.tipo = "Conta Corrente";
		} else {
			this.tipo = "Conta Poupança";
		}
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isAberta() {
		return isAberta;
	}

	public void setAberta(boolean isAberta) {
		this.isAberta = isAberta;
	}

}
