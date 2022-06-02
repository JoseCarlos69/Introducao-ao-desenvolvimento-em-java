import java.util.Scanner;

public class DesafioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Deseja comprar alguma coisa?");
		String pergunta = sc.nextLine();
		
		System.out.println("Qual sua mesada?");
		double mesada = sc.nextDouble();
		
		switch(pergunta) {
		case "Não":
			System.out.println("Sua mesada é " + mesada);
		break;
		case "Sim":
			System.out.println("Qaul o valor do produto?");
			double valorProduto = sc.nextDouble();
			
			double conta = mesada - valorProduto;
			
			System.out.println("Sua mesada após a compra é de " + conta);
		}

	}

}
