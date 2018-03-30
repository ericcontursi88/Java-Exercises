
public class Celular {
	private String nomeDoUsuario;
	private int identificador;
	private boolean estadoDoCelular;
	private Bateria bateria;
	
    public Celular(int identificador, String nomeDoUsuario, Bateria bateria) {
    	
        this.identificador = identificador;
        this.nomeDoUsuario = nomeDoUsuario;
        this.bateria = bateria;
        this.estadoDoCelular = false;
    
    }
    
    public void ligarCelular(){
        if(this.estadoDoCelular == false){
            if(bateria.getCarga() >20){
            
            System.out.println("Olá,seja Bem vindo: " + this.nomeDoUsuario);
            bateria.descarregar();
            bateria.descarregar();
            this.estadoDoCelular = true;
            
            }
            else if(this.bateria.getCarga() <=20 && this.bateria.getCarga() >0){
            System.out.println("Bateria Acabando!");
            }
       
        }
        else
        {
        	System.out.println("Celular já está ligado!");
        }
    }
    public void desligarCelular(){
        if(this.estadoDoCelular == true)
        {
        	System.out.println("Tchau!!!!");
        	this.estadoDoCelular = false;
        }
        else
        	System.out.println("Celular já está Desligado");
    }
    
    public void tocarSom(){
        if(this.estadoDoCelular==true && bateria.getCarga()>=10){
            System.out.println("Tocando Som!");
        }
    }
}
