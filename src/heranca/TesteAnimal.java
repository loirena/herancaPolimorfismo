package heranca;

public class TesteAnimal 
{
	public static void main (String args[])
	{
		Animal vaca = new Animal ("Hanna", 5, "moo");
		Cachorro cachorro1 = new Cachorro ("Paçoca", 3, true);
		cachorro1.setSom("auau");
		Cavalo cavalo1 = new Cavalo ("Apolo", 7, true);
		cavalo1.setSom("innhohoho");
		Preguica preguica1 = new Preguica ("Tasha", 2, true);
		preguica1.setSom("nho");
		
		System.out.println(cachorro1.getCachorro());
		System.out.println(cavalo1.getCavalo());
		System.out.println(preguica1.getPreguica());
	}
}
