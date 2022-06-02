import java.util.Scanner;

public class ProgramaVeiculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Veiculo veiculo1 = new Veiculo();
		
		System.out.print("Digite a placa do veículo: ");
		veiculo1.setPlaca(sc.nextLine());
		
		System.out.print("Digite a cor do veículo: ");
		veiculo1.setCor(sc.nextLine());
		
		System.out.print("Digite o número de passageiros do veículo: ");
		veiculo1.setNumDePassageiros(sc.nextInt());
		
		System.out.print("Digite a capacidade do tanque do veículo: ");
		veiculo1.setCapacidadeDoTanque(sc.nextInt());
		
		System.out.print("Digite a velocidade máxima do veículo: ");
		veiculo1.setVelocidadeMaxima(sc.nextFloat());
		
		System.out.print("Digite a velocidade atual do veículo: ");
		veiculo1.setVelocidadeAtual(sc.nextFloat());
		
		System.out.print("Digite o consumo médio do veículo: ");
		veiculo1.setConsumoMedio(sc.nextInt());

		System.out.println("");
		System.out.println("Informações do veículo: ");
		System.out.println("");
		System.out.println("Placa: " + veiculo1.getPlaca());
		System.out.println("Cor: " + veiculo1.getCor());
		System.out.println("Número de passageiros: " + veiculo1.getNumDePassageiros());
		System.out.println("Capacidade do tanque: " + veiculo1.getCapacidadeDoTanque());
		System.out.println("Velocidade máxima: " + veiculo1.getVelocidadeMaxima() + " km/h");
		System.out.println("Velocidade atual: " + veiculo1.getVelocidadeAtual() + " km/h");
		System.out.println("Consumo médio: " + veiculo1.getConsumoMedio() + " litros por km");

	}

}
