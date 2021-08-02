package banco_exercicio;

public class Aula05 {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(111);
		c1.setDono("Roberto");
		c1.abrirConta("CC");
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(222);
		c2.setDono("Carla");
		c2.abrirConta("CP");
		
		c1.depositar(500);
		
		c1.estadoAtual();
		c2.estadoAtual();
	}
}