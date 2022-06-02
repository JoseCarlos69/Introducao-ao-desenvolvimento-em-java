public class Construtora {
	
	public int idade;
	public int dia;
	public int mes;
	public int ano;
	public int diaAtual;
	public int mesAtual;
	public int anoAtual;
	public String nome;
	public String tipoIndustria;

	
	public void calcularIdadeConstrutora(int dia, int mes, int ano) {
		this.anoAtual = ano;
		this.idade = this.anoAtual - this.ano;
	}

	public int informarIdadeConstrutora(){
		return this.idade;
	}

	public String informaNomeConstrutora(){
		return nome;
	}

	public String informaTipoIndustriaConstrutora(){
		return tipoIndustria;
	}
	
	public void dataConstrutoraFundacao(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano; 
	}
	
}
