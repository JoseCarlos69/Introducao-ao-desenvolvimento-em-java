import java.util.Scanner;

public class DesafioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um mês: ");
		String mes = sc.nextLine();
		
		switch(mes) {
		case "Janeiro":
			System.out.println("Janeiro tem 31 dias");
		break;
		case "Fevereiro":
			System.out.println("Fevereiro tem 28 dias");
		break;
		case "Março":
			System.out.println("Março tem 31 dias");
		break;
		case "Abril":
			System.out.println("Abril tem 30 dias");
		break;
		case "Maio":
			System.out.println("Maio tem 31 dias");
		break;
		case "Junho":
			System.out.println("Junho tem 30 dias");
		break;
		case "Julho":
			System.out.println("Julho tem 31 dias");
		break;
		case "Agosto":
			System.out.println("Agosto tem 31 dias");
		break;
		case "Setembro":
			System.out.println("Setembro tem 30 dias");
		break;
		case "Outubro":
			System.out.println("Outubro tem 31 dias");
		break;
		case "Novembro":
			System.out.println("Novembro tem 30 dias");
		break;
		case "Dezembro":
			System.out.println("Dezembro tem 31 dias");
		break;
		default:
			System.out.println("ERRO");
		}
	}

}
