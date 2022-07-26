package heranca;

public class Preguica extends Animal 
{
	private boolean sobeArvore;
	public Preguica(String nome, int idade, boolean corre)
	{
		super(nome,idade, null);
		this.sobeArvore=sobeArvore;
	}
	public boolean issobeArvore() {
		return sobeArvore;
	}
	public void setsobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	public String getSom() 
	{
		return "nhonho"+super.getSom();
	}
	public String getPreguica() 
	{
		return "Nome: "+super.getNome()+"Idade: "+super.getIdade()+ "Corre: "+this.issobeArvore()+ "Som: "+this.getSom();
	}	
}