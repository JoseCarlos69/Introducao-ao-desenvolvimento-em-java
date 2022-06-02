public class TestarPessoa {
	
	public static void main(String args[]){
		Pessoa isaac = new Pessoa();
		Pessoa einsten = new Pessoa();
	            
	    isaac.nome = "Isaac Newton";
	    isaac.ajustaDataNascimento(14, 03, 1849);
	    
	    einsten.nome = "Albert Einsten";
	    einsten.ajustaDataNascimento(04, 01, 1643);
	    
	    isaac.calcularIdade(19, 05, 2022);
	    einsten.calcularIdade(16, 05, 2022);
	    
	    System.out.println("Idade atual de " + isaac.informaNome() + " seria de " + isaac.informarIdade());
	    System.out.println("Idade atual de " + einsten.informaNome() + " seria de " + einsten.informarIdade());
	}
}
