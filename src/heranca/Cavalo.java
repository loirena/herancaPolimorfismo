package heranca;

public class Cavalo extends Animal 
{
	private boolean corre;
	public Cavalo (String nome, int idade, boolean corre)
	{
		super(nome,idade, null);
		this.corre=corre;
	}
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	public String getSom()         
   	{                             
    		return "inhohohoho"+super.getSom();
    	}  
	public String getCavalo()                                                                                     
  	{                                                                                                            
    		return "Nome: "+super.getNome()+"Idade: "+super.getIdade()+ "Corre: "+this.isCorre()+ "Som: "+this.getSom();
    	}         
}