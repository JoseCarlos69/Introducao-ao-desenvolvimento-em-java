import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fábrica do carro: ");
		double custFab = sc.nextInt();
		
		double custFinal = custFab + 0.73 * custFab;
		
		System.out.println("O valor do carro no final é de R$ " + custFinal);
		
	}

}