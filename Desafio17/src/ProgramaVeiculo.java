import java.util.Scanner;

public class ProgramaVeiculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Veiculo veiculo1 = new Veiculo();
		
		System.out.print("Digite a placa do ve�culo: ");
		veiculo1.setPlaca(sc.nextLine());
		
		System.out.print("Digite a cor do ve�culo: ");
		veiculo1.setCor(sc.nextLine());
		
		System.out.print("Digite o n�mero de passageiros do ve�culo: ");
		veiculo1.setNumDePassageiros(sc.nextInt());
		
		System.out.print("Digite a capacidade do tanque do ve�culo: ");
		veiculo1.setCapacidadeDoTanque(sc.nextInt());
		
		System.out.print("Digite a velocidade m�xima do ve�culo: ");
		veiculo1.setVelocidadeMaxima(sc.nextFloat());
		
		System.out.print("Digite a velocidade atual do ve�culo: ");
		veiculo1.setVelocidadeAtual(sc.nextFloat());
		
		System.out.print("Digite o consumo m�dio do ve�culo: ");
		veiculo1.setConsumoMedio(sc.nextInt());

		System.out.println("");
		System.out.println("Informa��es do ve�culo: ");
		System.out.println("");
		System.out.println("Placa: " + veiculo1.getPlaca());
		System.out.println("Cor: " + veiculo1.getCor());
		System.out.println("N�mero de passageiros: " + veiculo1.getNumDePassageiros());
		System.out.println("Capacidade do tanque: " + veiculo1.getCapacidadeDoTanque());
		System.out.println("Velocidade m�xima: " + veiculo1.getVelocidadeMaxima() + " km/h");
		System.out.println("Velocidade atual: " + veiculo1.getVelocidadeAtual() + " km/h");
		System.out.println("Consumo m�dio: " + veiculo1.getConsumoMedio() + " litros por km");

	}

}
