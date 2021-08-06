package ufc.java;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
	public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura,
			float peso) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.setCategoria();
	}

//----------METODOS PUBLICOS-----------
	
	public void apresentar() {
		System.out.println("\n");
		System.out.println("IT'S TIME! APRESENTAMOS O LUTADOR");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade() + " anos.");
		System.out.println("Altura: " + this.getAltura() + "m");
		System.out.println("Pesando: " + this.getPeso() + "kg.");
		System.out.println("Ganhou " + this.getVitorias() + " lutas.");
		System.out.println("Perdeu " + this.getDerrotas() + " lutas.");
		System.out.println("Empatou: " + this.getEmpates() + " lutas.");
		System.out.println("\n");
	}
	
	public void status() {
		System.out.println(this.getNome() + " está atualmente na categoria " + this.getCategoria() + ".");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
	//==========METODOS ESPECIAIS===============
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 56.7) {
			this.categoria = "Peso Mosca";
		} else if (this.getPeso() <= 61.2) {
			this.categoria = "Peso Galo";
		} else if (this.getPeso() <= 65.8) {
			this.categoria = "Peso Pena";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Peso Leve";		
		} else if (this.getPeso() <= 77.1) {
			this.categoria = "Peso Meio-Médio";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Peso Médio";
		} else if (this.getPeso() <= 92.9) {
			this.categoria = "Peso Meio-Pesado";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Peso Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
}