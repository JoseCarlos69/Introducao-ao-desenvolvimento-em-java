import java.util.Scanner;

public class DesafioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char operacao;
		
		do {
			System.out.println("Digite o 1°: ");
			num1 = sc.nextInt();
			
			System.out.println("Digite o 2°: ");
			num2 = sc.nextInt();
			
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			
			System.out.println("Deseja continuar a operação?");
			operacao = sc.next().charAt(0);
			
		} while(operacao == 'S');

	}

}
