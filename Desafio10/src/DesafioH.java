import java.util.Scanner;

public class DesafioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Escolha uma operação matemática: ");
		String operacao = sc.nextLine();
		
		System.out.println("Digite o 1° número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o 2° número: ");
		int num2 = sc.nextInt();
		
		switch(operacao) {
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		break;
		case "/":
			System.out.println(num1 + " - " + num2 + " = " + (num1 / num2));
		break;
		case "+":
			System.out.println(num1 + " - " + num2 + " = " + (num1 + num2));
		break;
		case "*":
			System.out.println(num1 + " - " + num2 + " = " + (num1 * num2));
		break;
		default:
			System.out.println("ERRO");
		}

	}

}
