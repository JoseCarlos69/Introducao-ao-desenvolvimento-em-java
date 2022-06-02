import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Número total de Votos Nulo: ");
		double votoNulo = sc.nextInt();
		
		System.out.println("Digite o Número total de Votos Válidos: ");
		double votoValido = sc.nextInt();
		
		System.out.println("Digite o Número total de Votos Brancos: ");
		double votoBranco = sc.nextInt();
		
		double totalEleitores = votoNulo + votoValido + votoBranco;
		
		System.out.println("Quantidade de Votos Nulos: " + votoNulo);
		System.out.println("Porcentagem de Votos Nulos: " + 100*(votoNulo/totalEleitores) + "%");
		
		System.out.println("Quantidade de Votos Válidos: " + votoValido);
		System.out.println("Porcentagem de Votos Válidos: " + 100*(votoValido/totalEleitores) + "%");
		
		System.out.println("Quantidade de Votos Brancos: " + votoBranco);
		System.out.println("Porcentagem de Votos Brancos: " + 100*(votoBranco/totalEleitores) + "%");
		
	}

}
