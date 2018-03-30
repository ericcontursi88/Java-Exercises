
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partido b1 = new Partido("Partido dos Trabalhadores", "comunista",Sigla.PT,13);
		Candidato c1 = new Candidato("Lula", b1);
		c1.mostrarDados();
		c1.mudarPartido(b1);


	}

}
