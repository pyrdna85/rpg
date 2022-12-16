package personagem;

public class Mago extends Personagem{
	
	public Mago(String nome, int nivelVida) {
		this.nome = nome;
		this.nivelVida = nivelVida;
	}
	
	public Mago() {
		
	}	
	
	public void lancaMagia(Personagem alvo, int pontosDeDano) {
		alvo.tomaDano(pontosDeDano);
	}	

}