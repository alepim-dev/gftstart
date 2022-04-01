package gft_start;

public class CPU {
 
	private int clock;
	
	private String  modelo;
	
	public CPU() {}

	public CPU(int clock, String modelo) {
		super();
		this.clock = clock;
		this.modelo = modelo;
	}

	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
