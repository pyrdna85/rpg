package personagem;

public class Jogo {
	
	public static void main(String[] args) {
		Barbaro barbaro = new Barbaro("Miguel", 15);
		//barbaro.setNivelVida(10);
		
		Mago mago = new Mago("Rodrigo", 10);
		//mago.setNivelVida(10);		
		
		System.out.println("Nível de vida do " + barbaro.getNome() + " antes do ataque: " + barbaro.getNivelVida());		
		mago.lancaMagia(barbaro, 3);			
		System.out.println("Nível de vida do " + barbaro.getNome() + " depois do ataque: " + barbaro.getNivelVida());
		
		System.out.println("Nível de vida do " + mago.getNome() + " antes do ataque: " + mago.getNivelVida() );		
		barbaro.lancaGolpe(mago, 2);		
		System.out.println("Nível de vida do " + mago.getNome() + " depois do ataque: " + mago.getNivelVida());
		
	}

}