import java.util.Scanner;

public class DesafioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o 1° número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o 2° número: ");
		int num2 = sc.nextInt();
		
		int restoNum = num1 % num2;
		
		System.out.println("O resto da divisão de " + num1 + " ÷ " + num2 + " é " + restoNum);
	}

}
