
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bateria b1 = new Bateria(50);
        Celular c1 = new Celular(10,"Fulano de Tal",b1);
        c1.desligarCelular();

        System.out.println(b1.getCarga());
        c1.ligarCelular();
        System.out.println(b1.getCarga());
        c1.desligarCelular();
        System.out.println(b1.getCarga());
        b1.carregar();
        b1.carregar();
        System.out.println(b1.getCarga());
        b1.descarregar();
        System.out.println(b1.getCarga());


	}

}
