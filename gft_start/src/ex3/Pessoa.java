package ex3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String nascimento;
	private String sexo;
	
	public Pessoa(String nome, String nascimento, String sexo) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	 static String anoAtual() {
		DateFormat ano = new SimpleDateFormat("YYYY");
		Date dat = new Date();
		return ano.format(dat);
	}
	
	static  Integer getAnoNascimento( Pessoa p) {
		String [] s = p.getNascimento().split("/");
		
			return Integer.parseInt(s[2])	;
	}
	public static Integer getIdade( Pessoa p) {
		return Integer.parseInt(anoAtual())- getAnoNascimento(p);
	}
	
	public static void imprimeTempoVidaRestante(Pessoa p) {
		if(p.getSexo()== "m" || p.getSexo()== "M" ) {
			int tempo = 80- getIdade(p);
			System.out.println(tempo);
		}
		if(p.getSexo()== "f" || p.getSexo()== "F" ) {
			int tempo = 73- getIdade(p);
			System.out.println("o tempo de vida restante é de "+ tempo +" anos!");
		}
	}
	
	
}
