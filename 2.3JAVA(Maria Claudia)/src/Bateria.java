
public class Bateria {
private int carga;
	
	public Bateria (int carga) {
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}

	public void descarregar() {
	if (this.carga> 0)
		this.carga = this.carga -10;
	else
		System.out.println("Sem bateria!");
}
	public void carregar() {
		if (this.carga != 100)
			this.carga = this.carga+5;
		else
			System.out.println("Bateria cheia!");
	}

}
