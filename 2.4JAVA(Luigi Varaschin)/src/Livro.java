
public class Livro {
	private String nome;
	private int tipo;
	private double preco;
	
	//construtor
	public livro(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = precoLivro(tipo);
		//this.preco = preco;
	}
	//metodo definir preço do livro CERTO
	public float precoLivro(int tipo){
		float valor =0;
		switch (tipo){
			case 1:
				valor = 20;
				break;
			case 2:
				valor = 40;
				break;
			case 3:
				valor = 80;
				break;
		}

		return valor;
	}
	//metodo definir preço do livro
	/*public void precoLivro(){
		
		switch(tipo) {
		case 1:
			this.preco = 20;
			break;
		case 2: 
			this.preco = 40;
			break;
		case 3:
			this.preco = 80;
			break;
		}
		
	}*/
	
	//metodo retornar tipo livro
	public String tipolivro() {
		String _tipo = null;
		switch(tipo) {
		case 1:
			_tipo = "EPUB";
			break;
		case 2:
			_tipo = "PDF";
			break;
		case 3: 
			_tipo = "FÍSICO";
			break;
		}
		return _tipo;
	}
	public String getNome(){
		return nome;
	}
	public double getPreco() {
		return preco;
	}

}
