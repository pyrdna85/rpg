package personagem;

public class Personagem {
	
	protected String nome;	
	private int nivelPoder;
	private int nivelHabilidade;
	private int nivelInteligencia;
	protected int nivelVida;
	
	Personagem(){
		
	}
	
//	Personagem(String nome){
//		this.nome=nome;
//		
//	}
	
	Personagem(String nome, int nivelPoder, int nivelHabildiade, int nivelInteligencia, int nivelVida) {
		this.nome = nome;		
		this.nivelPoder = nivelPoder;
		this.nivelHabilidade = nivelHabildiade;
		this.nivelInteligencia = nivelInteligencia;
		this.nivelVida = nivelVida;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNivelPoder() {
		return nivelPoder;
	}

	public void setNivelPoder(int nivelPoder) {
		this.nivelPoder = nivelPoder;
	}

	public int getNivelHabilidade() {
		return nivelHabilidade;
	}

	public void setNivelHabilidade(int nivelHabilidade) {
		this.nivelHabilidade = nivelHabilidade;
	}

	public int getNivelInteligencia() {
		return nivelInteligencia;
	}

	public void setNivelInteligencia(int nivelInteligencia) {
		this.nivelInteligencia = nivelInteligencia;
	}

	public int getNivelVida() {
		return nivelVida;
	}

	public void setNivelVida(int nivelVida) {
		this.nivelVida = nivelVida;
	}	
	
	public void tomaDano(int pontosDeDano) {
		this.nivelVida = this.nivelVida - pontosDeDano;
		if(nivelVida <= 3) {
			System.out.println("Você perdeu...");			
		}
	}

}