package gft_start;

public class DiscoRigido {
	
    private int velocidade;
	private int capacidade;
	private String tipo;

	public DiscoRigido() {}

	public DiscoRigido(int velocidade, int capacidade, String tipo) {
		super();
		this.velocidade = velocidade;
		this.capacidade = capacidade;
		this.tipo = tipo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
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
