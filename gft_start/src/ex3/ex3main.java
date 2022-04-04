package ex3;



public class ex3main {
	
	public static void main(String[] args) {
	Pessoa p = new Pessoa("ana", "21/10/1990", "F");
	Pessoa p1 = new Pessoa("bob", "21/10/1990", "M");
    Pessoa.imprimeTempoVidaRestante(p);
    Pessoa.imprimeTempoVidaRestante(p1);
	}

}
