import java.util.Scanner;

public class DesafioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		int num2 = sc.nextInt();
		
		int conta = num1 - num2;
		
		if(conta < 0) {
			conta = 1;
		} else {
			conta = 2;
		}
		
		switch(conta) {
		case 1:
			System.out.println("N�mero 2 � maior");
		break;
		case 2:
			System.out.println("N�mero 1 � maior");
		break;
		default:
			System.out.println("ERRO");
		}
	}
}