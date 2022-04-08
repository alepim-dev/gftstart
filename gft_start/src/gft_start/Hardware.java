package gft_start;

public class Hardware {

	private Integer id;
	private String descricao;
	private Double valor;
	private String fabricante;
	

	private CPU  cpu;
	private Memoria memoria;
	private DiscoRigido disco;
	
	
	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public DiscoRigido getDisco() {
		return disco;
	}

	public void setDisco(DiscoRigido disco) {
	this.disco = disco;
	}

	public Hardware() {}

	public Hardware(Integer id, String descricao, Double valor, String fabricante) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.fabricante = fabricante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void InstalarMemoria(Memoria m) {
		memoria = m;
	}
	public void InstalarCPU(CPU c) {
		cpu = c;
	}
	public void InstalarDiscoRigido(DiscoRigido d) {
		disco = d;
	}
	
	public void getDetalhesHardware() {
		
		System.out.println("detalhes do hardware ");
		System.out.println();
		System.out.println("id: "+getId());
		System.out.println("descricao: "+getDescricao());
		System.out.println("valor: "+getValor());
		System.out.println("fabricante: "+getFabricante());
		System.out.println();
		memoria.getDetalheMemoria();
		System.out.println();
		System.out.println("detalhes da CPU ");
		System.out.println(getCpu().getClock());
		System.out.println(getCpu().getModelo());
		System.out.println();
		System.out.println("detalhes do Disco rigido ");
		System.out.println(getDisco().getCapacidade());
		System.out.println(getDisco().getTipo());
		System.out.println(getDisco().getVelocidade());
	}
	
}
