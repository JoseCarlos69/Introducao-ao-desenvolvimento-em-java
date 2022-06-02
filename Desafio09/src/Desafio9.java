import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o 2° valor: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Digite o 3° valor: ");
		double num3 = sc.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior número é " + num3);
		}
	}

}
