public class Pessoa {
	
	public int idade;
	public int dia;
	public int mes;
	public int ano;
	public int diaAtual;
	public int mesAtual;
	public int anoAtual;
	public String nome;
	
	public void calcularIdade(int dia, int mes, int ano) {
		this.anoAtual = ano;
		this.idade = this.anoAtual - this.ano;
	}

	public int informarIdade(){
		return this.idade;
	}

	public String informaNome(){
		return nome;
	}

	public void ajustaDataNascimento(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano; 
	}
	
}
