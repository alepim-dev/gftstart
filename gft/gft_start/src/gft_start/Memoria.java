package gft_start;

public class Memoria {

	private int frequecia;
	
	private int capacidade;
	private String tipo;
	
	public Memoria() {}

	public Memoria(int frequecia, int capacidade, String tipo) {
		super();
		this.frequecia = frequecia;
		this.capacidade = capacidade;
		this.tipo = tipo;
	}

	public int getFrequecia() {
		return frequecia;
	}

	public void setFrequecia(int frequecia) {
		this.frequecia = frequecia;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
}
