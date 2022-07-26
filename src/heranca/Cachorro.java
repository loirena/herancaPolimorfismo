package heranca;

public class Cachorro extends Animal 
{
	private boolean corre;
	public Cachorro(String nome, int idade, boolean corre)
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
		return "auau"+super.getSom();
	}
	public String getCachorro()
	{
		return "Nome: "+super.getNome()+"Idade: "+super.getIdade()+ "Corre: "+this.isCorre()+ "Som: "+this.getSom();
	}
	
}
