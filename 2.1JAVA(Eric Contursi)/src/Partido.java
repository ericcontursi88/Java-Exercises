
public class Partido {
	private String nome;
	private String ideologia;
	private Sigla sigla;
	int numero;

	public Partido(String nome, String ideologia, Sigla sigla, int numero) {

	this.nome = nome;
	this.ideologia = ideologia;
	this.sigla = sigla;
	this.numero = numero;
	}

	public String getNome() {
	return nome;
	}

	public String getIdeologia() {
	return ideologia;
	}

	public Sigla getSigla() {
	return sigla;
	}

	public int getNumero() {
	return numero;
	}
}
