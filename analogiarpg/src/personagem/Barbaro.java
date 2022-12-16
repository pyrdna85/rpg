package personagem;

public class Barbaro extends Personagem{
	
	public Barbaro(String nome, int nivelVida) {
		this.nome = nome;
		this.nivelVida = nivelVida;
	}
	
	public Barbaro() {
		
	}
	
	public void lancaGolpe(Personagem alvo, int pontosDeDano) {
		alvo.tomaDano(pontosDeDano);
	}

}