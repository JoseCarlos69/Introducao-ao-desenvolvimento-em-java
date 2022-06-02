public class TestarConstrutora {
	
	public static void main(String args[]){
		Construtora construtora1 = new Construtora();
		Construtora construtora2 = new Construtora();
	            
		construtora1.nome = "JAVA Indústrias LTDA";
		construtora1.tipoIndustria = "Edifícios Residenciais";
		construtora1.dataConstrutoraFundacao(01, 05, 1995);
	    
		construtora2.nome = "PYTHON Company Inc";
		construtora2.tipoIndustria = "Edifícios Comerciais";
		construtora2.dataConstrutoraFundacao(01, 01, 1990);
	    
		construtora1.calcularIdadeConstrutora(19, 05, 2022);
	    construtora2.calcularIdadeConstrutora(16, 05, 2022);
	    
	    System.out.println("A construtora " + construtora1.informaNomeConstrutora() 
	    + " do ramo de " + construtora1.informaTipoIndustriaConstrutora() 
	    + " tem " + construtora1.informarIdadeConstrutora() + " anos no mercado");
	    System.out.println("A construtora  " + construtora2.informaNomeConstrutora() 
	    + " do ramo de " + construtora2.informaTipoIndustriaConstrutora() 
	    + " tem " + construtora2.informarIdadeConstrutora() + " anos no mercado");
	}
}
