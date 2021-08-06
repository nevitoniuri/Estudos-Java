package ufc.java;

import java.util.Random;

public class Luta {
	//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;
	
	
	//metodos publicos
	public void lutar () {
		if (this.isAprovada()) {
			System.out.println("#### DESAFIADO ####");
			this.desafiado.apresentar();
			System.out.println("#### DESAFIANTE ####");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("-----------------------------");
			System.out.println("------RESULTADO DA LUTA------");
			switch (vencedor) {
				case 0:
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					System.out.println("Vitória do " + this.getDesafiado().getNome());
					break;
	
				case 2:
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					System.out.println("Vitória do " + this.getDesafiante().getNome());
					break;
			}
			System.out.println("-----------------------------");
		} else {
			System.out.println("A luta não pode acontecer.");
		}
		
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && (l1.getNome() != l2.getNome())) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	
	//getters e setters
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
