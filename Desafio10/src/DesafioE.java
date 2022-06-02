import java.util.Scanner;

public class DesafioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		
		int conta = num1 % 2;
		
		switch(conta) {
		case 1:
			System.out.println("Ímpar");
		break;
		case 0:
			System.out.println("Par");
		break;
		default:
			System.out.println("ERRO");
		}
	}
}
