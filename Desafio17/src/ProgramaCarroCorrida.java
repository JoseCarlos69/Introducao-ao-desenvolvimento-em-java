
public class ProgramaCarroCorrida {

	public static void main(String[] args) {
		CarroCorrida carro1 = new CarroCorrida(1, "Jose", "Azul", 120);
		
		System.out.println("Número do carro: " + carro1.getNumeroCarro());
		System.out.println("Nome do piloto: " + carro1.getPiloto());
		System.out.println("Equipe: " + carro1.getEquipe());
		System.out.println("Velocidade máxima: " + carro1.getVelocidadeMaxima() + " km/h");
		
		carro1.ligar();
		System.out.println("Carro ligado? " + carro1.isLigado());
		
		carro1.acelerar();
		
		carro1.frear();
		System.out.println("Velocidade após frear: " + carro1.getVelocidadeAtual());

		carro1.parar();
		System.out.println("Velocidade do carro ao parar: " + carro1.getVelocidadeAtual());

		carro1.desligar();
		System.out.println("Carro ligado? " + carro1.isLigado());

	}

}
