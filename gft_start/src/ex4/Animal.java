package ex4;

public abstract class Animal implements AcoesAnimal {

	private String classe;
	
	private String alimentacao;
	
	private String habitat;

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimetacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public void locomover() {
		System.out.println("");
		
	}


	public void Alimentacao() {
		
		System.out.println("");
	}
	
	
	
}
